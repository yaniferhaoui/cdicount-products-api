package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public final class Products implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -115843262901136673L;
	
	@SerializedName(value = "Products")
	@Expose(serialize = true, deserialize = true)
	private Product[] products;
}
