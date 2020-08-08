package com.yferhaoui.cdiscount.products.api.data.request;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public final class ProductRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4126962602425246630L;

	@SerializedName(value = "ProductIdList")
	@Expose(serialize = true, deserialize = true)
	private String[] productIdList;

	@SerializedName(value = "Scope")
	@Expose(serialize = true, deserialize = true)
	private Scope scope;

	public ProductRequest(final String[] productIdList, final Scope scope) {

		this.productIdList = productIdList;
		this.scope = scope;
	}
}
