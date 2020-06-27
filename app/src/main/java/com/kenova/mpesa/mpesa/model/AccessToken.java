package com.kenova.mpesa.mpesa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Aaron at 6/27/2020
 **/
public class AccessToken
    {
    @SerializedName("access_token")
    @Expose
    public String accessToken;
    @SerializedName("expires_in")
    @Expose
    private String expiresIn;

    public AccessToken(String accessToken, String expiresIn) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    }
    }
