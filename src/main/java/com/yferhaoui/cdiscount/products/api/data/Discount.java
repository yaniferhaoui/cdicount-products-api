package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public final class Discount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2767178693692158398L;

	@SerializedName(value = "Type")
	@Expose(serialize = true, deserialize = true)
	private String type;
	
	@SerializedName(value = "StartDate")
	@Expose(serialize = true, deserialize = true)
	private String startDate;
	
	@SerializedName(value = "EndDate")
	@Expose(serialize = true, deserialize = true)
	private String endDate;
}
