package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public final class CartItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7950507466098855729L;

	@SerializedName(value = "Condition")
	@Expose(serialize = true, deserialize = true)
	private String condition;
	
	@SerializedName(value = "OfferId")
	@Expose(serialize = true, deserialize = true)
	private String offerId;
	
	@SerializedName(value = "Price")
	@Expose(serialize = true, deserialize = true)
	private BigDecimal price;
	
	@SerializedName(value = "ProductId")
	@Expose(serialize = true, deserialize = true)
	private String productId;
	
	@SerializedName(value = "Quantity")
	@Expose(serialize = true, deserialize = true)
	private Integer quantity;
	
	@SerializedName(value = "SellerId")
	@Expose(serialize = true, deserialize = true)
	private Integer sellerId;
	
	@SerializedName(value = "SizeId")
	@Expose(serialize = true, deserialize = true)
	private Integer sizeId;
}
