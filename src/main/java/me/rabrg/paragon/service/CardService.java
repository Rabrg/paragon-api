package me.rabrg.paragon.service;

import me.rabrg.paragon.model.card.Card;
import me.rabrg.paragon.model.card.CardComplete;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CardService {

    @GET("/v1/card/{id}")
    Call<Card> card(@Path("id") String id);

    @GET("/v1/cards")
    Call<List<Card>> cards();

    @GET("/v1/cards/complete")
    Call<List<CardComplete>> cardsComplete();
}
