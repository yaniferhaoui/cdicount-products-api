package com.yferhaoui.cdiscount.products.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.yferhaoui.cdiscount.products.api.data.Product;
import com.yferhaoui.cdiscount.products.api.data.Products;
import com.yferhaoui.cdiscount.products.api.data.request.JsonRequest;
import com.yferhaoui.cdiscount.products.api.data.request.ProductRequest;
import com.yferhaoui.cdiscount.products.api.data.request.Scope;
import com.yferhaoui.cdiscount.products.api.gson.GsonAdapter;

public final class CdiscountAPI {

	private final static URI GET_PRODUCT_REQUEST = URI.create("https://api.cdiscount.com/OpenApi/json/GetProduct");

	// ---------------------------------------------------------- //

	private final HttpClient client = HttpClient.newHttpClient();
	private final Gson gson = new GsonBuilder()
	        .registerTypeAdapter(new TypeToken<List<Product>>() {}.getType(), new GsonAdapter())
	        .create();

	public final Products getProductsByIds(final JsonRequest jsonRequest) throws IOException, InterruptedException {

		final HttpRequest request = HttpRequest.newBuilder()//
				.uri(CdiscountAPI.GET_PRODUCT_REQUEST)//
				.header("Content-Type", "application/json")//
				.POST(HttpRequest.BodyPublishers.ofString(this.gson.toJson(jsonRequest)))//
				.build();
		
		

		final HttpResponse<String> response = this.client.send(request, HttpResponse.BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			throw new IOException("HTTP Status Code: " + response.statusCode() + " => " + response.body());
		}

		// Return Servers
		return this.gson.fromJson(response.body(), Products.class);
	}

	public final static void main(final String[] args) throws IOException, InterruptedException {
		
		final Scope scope = new Scope(true, true, true, true);
		final ProductRequest productRequest = new ProductRequest(new String[] { "productId" }, scope);
		final JsonRequest jsonRequest = new JsonRequest("apiKey", productRequest);

		final CdiscountAPI api = new CdiscountAPI();

		final Products products = api.getProductsByIds(jsonRequest);

		System.out.println(products.getOpenAPIProductDto().getProducts().get(0).getName());
	}
}
