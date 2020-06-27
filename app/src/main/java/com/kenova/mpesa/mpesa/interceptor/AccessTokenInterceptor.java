package com.kenova.mpesa.mpesa.interceptor;

import android.util.Base64;

import androidx.annotation.NonNull;

import com.kenova.mpesa.BuildConfig;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Aaron at 6/27/2020
 **/
public class AccessTokenInterceptor implements Interceptor {
	public AccessTokenInterceptor() {
	
	}
	
	@Override
	public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
		
		String keys = BuildConfig.CONSUMER_KEY + ":" + BuildConfig.CONSUMER_SECRET;
		
		Request request = chain.request().newBuilder()
				.addHeader("Authorization", "Basic " + Base64.encodeToString(keys.getBytes(), Base64.NO_WRAP))
				.build();
		return chain.proceed(request);
	}
}
