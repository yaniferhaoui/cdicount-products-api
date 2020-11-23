package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public final class Shipping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3721586103622237717L;

	@SerializedName(value = "DelayToDisplay")
	@Expose(serialize = true, deserialize = true)
	private String delayToDisplay;
	
	@SerializedName(value = "MaxDeliveryDate")
	@Expose(serialize = true, deserialize = true)
	private String maxDeliveryDate;
	
	@SerializedName(value = "MinDeliveryDate")
	@Expose(serialize = true, deserialize = true)
	private String minDeliveryDate;
	
	@SerializedName(value = "Name")
	@Expose(serialize = true, deserialize = true)
	private String name;
	
	@SerializedName(value = "Price")
	@Expose(serialize = true, deserialize = true)
	private BigDecimal price;
}
