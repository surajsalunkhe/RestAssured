package com.test.RestAPI.RestAssured;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class SampleRestTest {
	@BeforeClass
	public static void test()
	{
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api";
		
	}
	
	@Test
	public void sampleTest()
	{
		
		Response res=
		given()
		.when().get("/users/2");
		System.out.println(""+res.body().prettyPrint());
		
		given()
		.when().get("/users/2")
		.then()
		.statusCode(200);
		
		Response res2=given()
		.param("page", "2")
		.when()
		.get("/users");
		System.out.println(""+res2.body().prettyPeek());
	}

}
