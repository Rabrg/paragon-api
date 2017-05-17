package me.rabrg.paragon.service;

import me.rabrg.paragon.model.account.Account;
import me.rabrg.paragon.model.account.AccountFind;
import me.rabrg.paragon.model.account.AccountHeroStats;
import me.rabrg.paragon.model.account.AccountStats;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AccountService {

    @GET("/v1/account/{accountId}")
    Call<Account> account(@Path("accountId") String accountId);

    @GET("/v1/account/{accountId}/stats")
    Call<AccountStats> accountStats(@Path("accountId") String accountId);

    @GET("/v1/account/{accountId}/stats/hero/{heroId}")
    Call<AccountHeroStats> accountHeroStats(@Path("accountId") String accountId, @Path("heroId") String heroId);

    @GET("/v1/accounts/find/{displayName}")
    Call<AccountFind> accountFind(@Path("displayName") String displayName);
}
