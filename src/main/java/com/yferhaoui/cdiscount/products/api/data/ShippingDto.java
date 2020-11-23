package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public final class ShippingDto implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6930270049207692922L;
	
	@SerializedName(value = "Shippings")
	@Expose(serialize = true, deserialize = true)
	private Shipping[] shippings;
}
