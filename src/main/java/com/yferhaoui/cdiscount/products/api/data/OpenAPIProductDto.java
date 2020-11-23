package com.yferhaoui.cdiscount.products.api.data;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public final class OpenAPIProductDto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4324208902364566052L;
	
	@SerializedName(value = "OpenAPIProductDto")
	@Expose(serialize = true, deserialize = true)
	private List<Product> products;
}
