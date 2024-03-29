package me.rabrg.paragon;

import me.rabrg.paragon.model.account.Account;
import me.rabrg.paragon.model.account.AccountFind;
import me.rabrg.paragon.model.account.AccountHeroStats;
import me.rabrg.paragon.model.account.AccountStats;
import me.rabrg.paragon.model.card.Card;
import me.rabrg.paragon.model.card.CardComplete;
import me.rabrg.paragon.model.hero.Hero;
import me.rabrg.paragon.model.hero.HeroComplete;
import me.rabrg.paragon.service.AccountService;
import me.rabrg.paragon.service.CardService;
import me.rabrg.paragon.service.HeroService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class ParagonApi {

    private final OkHttpClient client;
    private final Retrofit retrofit;

    private final AccountService accountService;
    private final CardService cardService;
    private final HeroService heroService;

    public ParagonApi(final String apiKey) {
        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor((chain) -> {
            final Request original = chain.request();

            final Request.Builder requestBuilder = original.newBuilder()
                    .addHeader("X-Epic-ApiKey", apiKey)
                    .addHeader("Accept", "application/json; charset=utf-8");

            final Request request = requestBuilder.build();
            return chain.proceed(request);
        });

        client = httpClient.build();
        retrofit = new Retrofit.Builder()
                .baseUrl("https://developer-paragon.epicgames.com")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountService = retrofit.create(AccountService.class);
        cardService = retrofit.create(CardService.class);
        heroService = retrofit.create(HeroService.class);
    }

    public Account account(final String accountId) throws IOException {
        return body(accountService.account(accountId));
    }

    public AccountStats accountStats(final String accountId) throws IOException {
        return body(accountService.accountStats(accountId));
    }

    public AccountHeroStats accountHeroStats(final String accountId, final String heroId) throws IOException {
        return body(accountService.accountHeroStats(accountId, heroId));
    }

    public String accountFind(final String accountId) throws IOException {
        return body(accountService.accountFind(accountId)).getAccountId();
    }

    public Card card(final String id) throws IOException {
        return body(cardService.card(id));
    }

    public List<Card> cards() throws IOException {
        return body(cardService.cards());
    }

    public List<CardComplete> cardsComplete() throws IOException {
        return body(cardService.cardsComplete());
    }

    public Hero hero(final String id) throws IOException {
        return body(heroService.hero(id));
    }

    public List<Hero> heroes() throws IOException {
        return body(heroService.heroes());
    }

    public List<HeroComplete> heroesComplete() throws IOException {
        return body(heroService.heroesComplete());
    }

    private <T> T body(final Call<T> call) throws IOException {
        return call.execute().body();
    }
}
