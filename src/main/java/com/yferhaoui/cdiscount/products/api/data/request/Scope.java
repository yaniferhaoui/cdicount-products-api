package com.yferhaoui.cdiscount.products.api.data.request;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public final class Scope implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2286016060829000656L;

	@SerializedName(value = "Offers")
	@Expose(serialize = true, deserialize = true)
	private boolean offers;

	@SerializedName(value = "AssociatedProducts")
	@Expose(serialize = true, deserialize = true)
	private boolean associatedProducts;

	@SerializedName(value = "Images")
	@Expose(serialize = true, deserialize = true)
	private boolean images;

	@SerializedName(value = "Ean")
	@Expose(serialize = true, deserialize = true)
	private boolean ean;

	public Scope(final boolean offers, final boolean associatedProducts, final boolean images, final boolean ean) {

		this.offers = offers;
		this.associatedProducts = associatedProducts;
		this.images = images;
		this.ean = ean;
	}
}
