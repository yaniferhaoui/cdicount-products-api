package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public final class Offer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8503253451250162646L;

	@SerializedName(value = "Condition")
	@Expose(serialize = true, deserialize = true)
	private String condition;
	
	@SerializedName(value = "Id")
	@Expose(serialize = true, deserialize = true)
	private String id;
	
	@SerializedName(value = "IsAvailable")
	@Expose(serialize = true, deserialize = true)
	private boolean isAvailable;
	
	@SerializedName(value = "PriceDetails")
	@Expose(serialize = true, deserialize = true)
	private PriceDetails priceDetails;
	
	@SerializedName(value = "ProductURL")
	@Expose(serialize = true, deserialize = true)
	private String productURL;
	
	@SerializedName(value = "SalePrice")
	@Expose(serialize = true, deserialize = true)
	private BigDecimal salePrice;
	
	@SerializedName(value = "Seller")
	@Expose(serialize = true, deserialize = true)
	private Seller seller;
	
	@SerializedName(value = "Shippings")
	@Expose(serialize = true, deserialize = true)
	private Shipping[] shippings;
	
	@SerializedName(value = "Sizes")
	@Expose(serialize = true, deserialize = true)
	private Size[] sizes;
}
