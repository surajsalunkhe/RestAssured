package com.test.RestAPI.RestAssured;

import static io.restassured.RestAssured.given;
import org.junit.Test;
import com.Rest.Base.RestBase;
import io.restassured.http.ContentType;

public class SampleDelete extends RestBase {
	
	
	@Test
	public void sampleDelete()
	{
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete("/users/3")
		.then().statusCode(204);

	}

}
