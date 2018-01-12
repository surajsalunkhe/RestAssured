package com.test.RestAPI.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PostRequest {
	@BeforeClass
	public static void test()
	{
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api";
		
	}
	@Test
	public void samplePost()
	{
		PojoForPost pojo=new PojoForPost();
		pojo.setName("Neo");
		pojo.setName("Matrix Hero");
		given()
		.contentType(ContentType.JSON)
		.body(pojo)
		.when()
		.post("/users")
		.then()
		.statusCode(201);

	}
	
}
