package me.rabrg.paragon.service;

import me.rabrg.paragon.model.Hero;
import me.rabrg.paragon.model.HeroComplete;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface HeroService {

    @GET("/v1/hero/{id}")
    Call<Hero> hero(@Path("id") String id);

    @GET("/v1/heroes")
    Call<List<Hero>> heroes();

    @GET("/v1/heroes/complete")
    Call<List<HeroComplete>> heroesComplete();
}
