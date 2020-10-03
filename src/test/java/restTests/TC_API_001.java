package restTests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TC_API_001 {

	Response response;

	@BeforeMethod
	public void startAPI() {
		System.out.println("******** Rest API Tests Starts *******");
		RestAssured.baseURI = "https://reqres.in/";
	}

	@Test
	public void getListUsersResponse() {

		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "\r\n" + "/api/users?page=2");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		Assert.assertEquals(responseBody.toLowerCase().contains("id"), true);

		// Status Code Validation
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status Code is =>" + statusCode);

		// Status Line Validation
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		System.out.println("Status Line is =>" + statusLine);

		// Content Type Validation
		String contentType = response.getContentType();
		Assert.assertEquals(contentType, "application/json; charset=utf-8");
		System.out.println("Content Type is ==>" + contentType);

		// Content Encoding Validation
		String contentEncoding = response.getHeader("Content-Encoding");
		Assert.assertEquals(contentEncoding, "gzip");
		System.out.println("Content Encoding value is ==>" + contentEncoding);

		// Print all header details
		Headers allHeaders = response.headers();
		for (Header eachHeader : allHeaders) {

			System.out.println(eachHeader.getName() + " == " + eachHeader.getValue());
		}

		// Get time, cookies details
		System.out.println("Time is ==>" + response.getTime());
		System.out.println("Session ID is ==>" + response.getSessionId());
		System.out.println("Cookies are ==>" + response.getCookies());
		System.out.println("Detailed Cookies are ==>" + response.getDetailedCookies());

	}

	@Test
	public void getSingleUserResponse() {

		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "\r\n" + "/api/Users/2");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		Assert.assertEquals(responseBody.toLowerCase().contains("id"), true);

		// Status Code Validation
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status Code is =>" + statusCode);

		// Status Line Validation
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		System.out.println("Status Line is =>" + statusLine);

		// Content Type Validation
		String contentType = response.getContentType();
		Assert.assertEquals(contentType, "application/json; charset=utf-8");
		System.out.println("Content Type is ==>" + contentType);

		// Content Encoding Validation
		String contentEncoding = response.getHeader("Content-Encoding");
		Assert.assertEquals(contentEncoding, "gzip");
		System.out.println("Content Encoding value is ==>" + contentEncoding);

	}

	@Test
	public void singleUserNotFound() {

		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "\r\n" + "/api/Users/23");

		// Status Code Validation
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 404);
		System.out.println("Status Code is =>" + statusCode);

	}

	@Test
	public void validateSingleUserResponseBody() {

		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "\r\n" + "/api/Users/2");

		JsonPath jsonPath = response.jsonPath();
		String id = jsonPath.get("id");
		System.out.println(id);

	}

	@Test
	public void createUsersPostRequest() {

		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "suresh");
		requestParams.put("first_name", "suresh");
		requestParams.put("last_name", "velumoni");
		requestParams.put("dob", "28-09-1992");

		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());

		response = httpRequest.post("/api/users");

		// Status Code Validation
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
		System.out.println("Status Code is =>" + statusCode);

		/*// Success code validation
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals("Correct Success code was returned", successCode, "OPERATION_SUCCESS");
		*/
		JsonPath jsonPath = response.jsonPath();
		System.out.println(jsonPath.get().toString());
		
		System.out.println("Name ==> "+jsonPath.get("name"));
		System.out.println("First Name ==> "+jsonPath.get("first_name"));
		System.out.println("Last Name ==> "+jsonPath.get("last_name"));
		System.out.println("DOB ==> "+jsonPath.get("dob"));
		
		Assert.assertEquals(jsonPath.get("name"), requestParams.get("name"));
		Assert.assertEquals(jsonPath.get("first_name"), requestParams.get("first_name"));
		Assert.assertEquals(jsonPath.get("last_name"), requestParams.get("last_name"));
		Assert.assertEquals(jsonPath.get("dob"), requestParams.get("dob"));

	}
	
	@Test
	public void putRequest() {
		
		String name ="morpheus";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Suresh");
		requestParams.put("job", "Automation");

		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());

		response = httpRequest.put("/api/users/3/update/"+name);

		// Status Code Validation
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status Code is =>" + statusCode);

		JsonPath jsonPath = response.jsonPath();
		System.out.println(jsonPath.get().toString());
		
		System.out.println("Name ==> "+jsonPath.get("name"));
		System.out.println("Job ==> "+jsonPath.get("job"));
		
		Assert.assertEquals(jsonPath.get("name"), requestParams.get("name"));
		Assert.assertEquals(jsonPath.get("job"), requestParams.get("job"));

	}
	
	@Test
	public void deleteRequest() {
		
		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");

		response = httpRequest.delete("/api/users/2/delete/");

		// Status Code Validation
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 204);
		System.out.println("Status Code is =>" + statusCode);

		
	}

	@AfterMethod
	public void endAPI() {
		System.out.println("******** Rest API Tests Ends *******");
	}

}
