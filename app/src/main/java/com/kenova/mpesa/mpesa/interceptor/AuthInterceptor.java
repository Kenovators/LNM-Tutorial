package com.kenova.mpesa.mpesa.interceptor;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Aaron at 6/27/2020
 **/
public class AuthInterceptor implements Interceptor {
	private String mAuthToken;
	
	public AuthInterceptor(String authToken) {
		mAuthToken = authToken;
	}
	
	@Override
	public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
		Request request = chain.request().newBuilder()
				.addHeader("Authorization", "Bearer " + mAuthToken)
				.build();
		return chain.proceed(request);
	}
}
