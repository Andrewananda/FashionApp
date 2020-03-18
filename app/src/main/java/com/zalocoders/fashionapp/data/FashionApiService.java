package com.zalocoders.fashionapp.data;


import com.zalocoders.fashionapp.requests.GroupRequest;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FashionApiService {
    @GET("fashion_groups")
    Call<GroupRequest> getGroups();
}