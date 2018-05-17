package pack;

import io.restassured.assertion.BodyMatcher;
import io.restassured.specification.RequestSpecification;

import java.io.Console;
import java.util.List;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter.Green;
import org.apache.poi.xwpf.usermodel.BodyElementType;
import org.apache.xmlbeans.xml.stream.events.ElementTypeNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.matcher.ResponseAwareMatcher;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.path.json.config.JsonPathConfig;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.Argument;
import com.sun.mail.imap.protocol.BODY;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
public class StepDefinition {

	@Test(enabled=false)
	@Given("^Iam a normal user$")
	public void iam_a_normal_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String w = "Mario";
		//given().when().get("http://localhost:3000/companies").then().statusCode(200);
		String response2 = given().when().get("http://localhost:3000/companies").getHeader("Connection");
		System.out.print(response2);
		String response1 = given().when().get("http://localhost:3000/companies").getBody().prettyPrint();		
		if (response1.contains(w))
		{
			System.out.println("TC1 Passed");
		}
		else
		{
			System.out.println("TC1 Failed");
		}		
		ValidatableResponse response3 = given().when().get("http://localhost:3000/companies").then().assertThat().body(containsString(w));
		if (response3 != null)
		{
			System.out.println("TC2 Passed");
		}
		else
		{
			System.out.println("TC2 Failed");
		}
		
	    //throw new PendingException();
	}

	@When("^I hit the system with GIT$")
	public void i_hit_the_system_with_GIT() throws Throwable {
	    /* Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI ="http://localhost:3000";
		RequestSpecification Request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("title", "first");
		requestParams.put("author", "time");
		requestParams.put("isbn", "javaAPI");
		//Request.body(requestParams.toString());
		given().contentType("application/json").when().body(requestParams).post("http://localhost:3000/company");
//		Response response = Request.post("/register");
	//	io.restassured.response.Response response = Request.post("/company");
		
	   // throw new PendingException();*/
	}

	@Then("^I shall see all companies details$")
	public void i_shall_see_all_companies_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Map<String, Object>  jsonAsMap = new HashMap<>();
		jsonAsMap.put("title", "first");
		jsonAsMap.put("author", "time");
		jsonAsMap.put("isbn", "javaAPI");

		ResponseBody ResponseBody = given().
		        accept(ContentType.JSON).
		        contentType(ContentType.JSON).
		        body(jsonAsMap).
		when().
		        post("http://localhost:3000/company");
		
	    //throw new PendingException();
	}
}
