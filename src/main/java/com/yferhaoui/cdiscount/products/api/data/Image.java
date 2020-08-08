package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public final class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8207288915384131181L;

	@SerializedName(value = "ImageUrl")
	@Expose(serialize = true, deserialize = true)
	private String imageUrl;
	
	@SerializedName(value = "ThumbnailUrl")
	@Expose(serialize = true, deserialize = true)
	private String thumbnailUrl;
}
