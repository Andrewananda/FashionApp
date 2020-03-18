package com.zalocoders.fashionapp.requests;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.zalocoders.fashionapp.Models.FashionGroup;

public class GroupRequest {

    @SerializedName("fashion_groups")
    @Expose
    private List<FashionGroup> fashionGroups = null;

    public List<FashionGroup> getFashionGroups() {
        return fashionGroups;
    }

    public void setFashionGroups(List<FashionGroup> fashionGroups) {
        this.fashionGroups = fashionGroups;
    }

}
