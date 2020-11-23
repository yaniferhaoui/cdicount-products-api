package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public final class Saving implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6378075055108312159L;

	@SerializedName(value = "Type")
	@Expose(serialize = true, deserialize = true)
	private String type;
	
	@SerializedName(value = "Value")
	@Expose(serialize = true, deserialize = true)
	private BigDecimal value;
}
