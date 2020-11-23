package com.yferhaoui.cdiscount.products.api.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.yferhaoui.cdiscount.products.api.data.Product;

public class GsonAdapter implements JsonDeserializer<List<Product>> {

	@Override
	public List<Product> deserialize(//
			JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

		List<Product> vals = new ArrayList<Product>();
		if (json.isJsonArray()) {
			for (JsonElement e : json.getAsJsonArray()) {
				vals.add((Product) context.deserialize(e, Product.class));
			}
		} else if (json.isJsonObject()) {
			vals.add((Product) context.deserialize(json, Product.class));
		} else {
			throw new RuntimeException("Unexpected JSON type: " + json.getClass());
		}
		return vals;
	}
}