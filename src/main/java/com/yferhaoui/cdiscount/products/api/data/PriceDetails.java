package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public final class PriceDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6415387580842368775L;

	@SerializedName(value = "Discount")
	@Expose(serialize = true, deserialize = true)
	private Discount discount;
	
	@SerializedName(value = "ReferencePrice")
	@Expose(serialize = true, deserialize = true)
	private BigDecimal referencePrice;
	
	@SerializedName(value = "Saving")
	@Expose(serialize = true, deserialize = true)
	private Saving saving;
}
