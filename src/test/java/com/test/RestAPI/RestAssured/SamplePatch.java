package com.test.RestAPI.RestAssured;

import static io.restassured.RestAssured.given;
import org.junit.Test;
import com.Rest.Base.RestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SamplePatch extends RestBase {
	@Test
	public void samplePatch()
	{
		PojoForPost pojo=new PojoForPost();
		pojo.setName("Neo");
		pojo.setJob("Actor");
		Response res=given()
		.contentType(ContentType.JSON)
		.body(pojo)
		.when()
		.patch("/users/2");
		System.out.println(""+res.body().prettyPeek());
		

	}

}
