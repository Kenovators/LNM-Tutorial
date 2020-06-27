package com.kenova.mpesa.mpesa.services;

import com.kenova.mpesa.mpesa.model.AccessToken;
import com.kenova.mpesa.mpesa.model.STKPush;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Aaron at 6/27/2020
 **/
public interface STKPushService {
	@POST("mpesa/stkpush/v1/processrequest")
	Call<STKPush> sendPush(@Body STKPush stkPush);
	
	@GET("jobs/pending")
	Call<STKPush> getTasks();
	
	@GET("oauth/v1/generate?grant_type=client_credentials")
	Call<AccessToken> getAccessToken();
}
