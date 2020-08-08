package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public final class Seller implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6152156415377837561L;

	@SerializedName(value = "Id")
	@Expose(serialize = true, deserialize = true)
	private Integer id;
	
	@SerializedName(value = "Name")
	@Expose(serialize = true, deserialize = true)
	private String name;
}
