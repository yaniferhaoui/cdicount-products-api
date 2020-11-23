package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public final class Size implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6727196421736129547L;

	@SerializedName(value = "Id")
	@Expose(serialize = true, deserialize = true)
	private Integer id;
	
	@SerializedName(value = "Name")
	@Expose(serialize = true, deserialize = true)
	private String name;
	
	@SerializedName(value = "SalePrice")
	@Expose(serialize = true, deserialize = true)
	private BigDecimal salePrice;
	
	@SerializedName(value = "IsAvailable")
	@Expose(serialize = true, deserialize = true)
	private boolean isAvailable;
}
