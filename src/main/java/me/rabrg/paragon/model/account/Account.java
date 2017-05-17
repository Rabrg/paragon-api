package me.rabrg.paragon.model.account;

import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("accountId")
    private String accountId;
    @SerializedName("displayName")
    private String displayName;

    public String getAccountId() {
        return accountId;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}