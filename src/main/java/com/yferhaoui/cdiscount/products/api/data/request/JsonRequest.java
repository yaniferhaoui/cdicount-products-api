package com.yferhaoui.cdiscount.products.api.data.request;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public final class JsonRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2284011333065412876L;

	@SerializedName(value = "ApiKey")
	@Expose(serialize = true, deserialize = true)
	private String apiKey;
	
	@SerializedName(value = "ProductRequest")
	@Expose(serialize = true, deserialize = true)
	private ProductRequest productRequest;
	
	public JsonRequest(final String apiKey, final ProductRequest productRequest) {
		
		this.apiKey = apiKey;
		this.productRequest = productRequest;
	}
}
