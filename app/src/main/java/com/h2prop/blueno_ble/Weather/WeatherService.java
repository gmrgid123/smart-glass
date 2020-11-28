package com.h2prop.blueno_ble.Weather;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("data/2.5/weather")
    Call<WeatherResponse> getWeather(@Query("lat") double lat, @Query("lon") double lon,
                                     @Query("units") String metric, @Query("appid") String apid);
}