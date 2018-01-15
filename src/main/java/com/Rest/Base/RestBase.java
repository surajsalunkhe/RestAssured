package com.Rest.Base;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class RestBase {

	@BeforeClass
	public static void test()
	{
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api";
		
	}
}
