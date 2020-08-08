package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public final class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4043175533430327049L;

	@SerializedName(value = "AssociatedProducts")
	@Expose(serialize = true, deserialize = true)
	private Product[] associatedProducts;
	
	@SerializedName(value = "BestOffer")
	@Expose(serialize = true, deserialize = true)
	private Offer bestOffer;
	
	@SerializedName(value = "Brand")
	@Expose(serialize = true, deserialize = true)
	private String brand;
	
	@SerializedName(value = "Description")
	@Expose(serialize = true, deserialize = true)
	private String description;
	
	@SerializedName(value = "Ean")
	@Expose(serialize = true, deserialize = true)
	private String ean;
	
	@SerializedName(value = "Id")
	@Expose(serialize = true, deserialize = true)
	private String id;
	
	@SerializedName(value = "Images")
	@Expose(serialize = true, deserialize = true)
	private Image[] images;
	
	@SerializedName(value = "MainImageUrl")
	@Expose(serialize = true, deserialize = true)
	private String mainImageUrl;
	
	@SerializedName(value = "Name")
	@Expose(serialize = true, deserialize = true)
	private String name;
	
	@SerializedName(value = "Offers")
	@Expose(serialize = true, deserialize = true)
	private Offer[] offers;
	
	@SerializedName(value = "OffersCount")
	@Expose(serialize = true, deserialize = true)
	private Integer OffersCount;
	
	@SerializedName(value = "Rating")
	@Expose(serialize = true, deserialize = true)
	private BigDecimal rating;
}
