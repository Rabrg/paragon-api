package me.rabrg.paragon.model.account;

import com.google.gson.annotations.SerializedName;

public class AccountFind {

    @SerializedName("accountId")
    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return "AccountFind{" +
                "accountId='" + accountId + '\'' +
                '}';
    }
}
