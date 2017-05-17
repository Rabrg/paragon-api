package me.rabrg.paragon;

import me.rabrg.paragon.model.Hero;
import me.rabrg.paragon.model.HeroComplete;
import me.rabrg.paragon.service.HeroesService;
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

    private final HeroesService heroesService;

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

        heroesService = retrofit.create(HeroesService.class);
    }

    public Hero hero(final String id) throws IOException {
        return body(heroesService.hero(id));
    }

    public List<Hero> heroes() throws IOException {
        return body(heroesService.heroes());
    }

    public List<HeroComplete> heroesComplete() throws IOException {
        return body(heroesService.heroesComplete());
    }

    private <T> T body(final Call<T> call) throws IOException {
        return call.execute().body();
    }
}
