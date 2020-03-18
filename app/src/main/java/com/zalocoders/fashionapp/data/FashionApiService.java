package com.zalocoders.fashionapp.data;


import retrofit2.Call;
import retrofit2.http.GET;

public interface FashionApiService {
    @GET("fashion_groups")
    Call<GroupResponse> getGroups();
}