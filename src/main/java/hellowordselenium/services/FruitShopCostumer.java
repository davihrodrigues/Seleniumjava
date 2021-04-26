package hellowordselenium.services;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

public class FruitShopCostumer {

	private static String endpoint = "https://api.predic8.de:443/shop/customers/";
	String dadoUsername = "Davi";
	String dadoLastname = "Haubricht";
	String dadoVazio = "";
	@Test
	public void getResponseStatus() {
		given().when().get(endpoint).then().assertThat().statusCode(200);
	}
	
	@Test
	public void getResponseClassico() {
		given().when().get(endpoint + "9999").then().assertThat().statusCode(404);
	}
	
	@Test
	public void getDaviHaubricht() {
		given().when().get(endpoint + "555").then().assertThat().statusCode(200);
	}

	@Test
	public void postCustomerTest() {
		JSONObject requestParams = new JSONObject();
		
		
		requestParams.put("firstname", dadoUsername);
		requestParams.put("lastname", dadoLastname);
		System.out.println(requestParams.toJSONString());
		System.out.println(endpoint);
		System.out.println("customer_url");
		given().
		body(requestParams.toJSONString())
		.contentType(ContentType.JSON)
	.when()
		.post(endpoint)
	.then()
		.statusCode(201)
		.body(containsString(dadoUsername));
}
	@Test
	public void postCustomerValidationBodyTest() {
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("firstname", dadoUsername);
		requestParams.put("lastname", dadoLastname);
		System.out.println(requestParams.toJSONString());
		System.out.println(endpoint);
		given()
			.body(requestParams.toJSONString())
			.contentType(ContentType.JSON)
		.when()
			.post(endpoint)
		.then().
			statusCode(201)
			.body("firstname", Matchers.equalTo(dadoUsername))
			.body("lastname", Matchers.equalTo(dadoLastname));
	}
	
	@Test
	public void postCustomerVazio() {
		JSONObject requestParams = new JSONObject();
		
		
		requestParams.put("firstname", dadoVazio);
		requestParams.put("lastname", dadoVazio);
		System.out.println(requestParams.toJSONString());
		System.out.println(endpoint);
		given()
			.body(requestParams.toJSONString())
			.contentType(ContentType.JSON)
		.when()
			.post(endpoint)
		.then().
			statusCode(201)
			.body("firstname", Matchers.equalTo(dadoVazio))
			.body("lastname", Matchers.equalTo(dadoVazio));
	}
	
	@Test
	public void postCustumero() {
		JSONObject requestParams = new JSONObject();

		
		requestParams.put("firstname", dadoUsername);
		requestParams.put("lastname", dadoVazio);
		System.out.println(requestParams.toJSONString());
		System.out.println(endpoint);
		given()
			.body(requestParams.toJSONString())
			.contentType(ContentType.JSON)
		.when()
			.post(endpoint)
		.then().
			statusCode(400)
			.body("firstname", Matchers.equalTo(dadoUsername));
			
	}

	@Test
    public void putCustomerTest(){
        JSONObject requestParams = new JSONObject();
        
		requestParams.put("firstname", dadoUsername);
		requestParams.put("lastname", dadoLastname);

        given().
                body(requestParams.toJSONString()).contentType(ContentType.JSON).
        when().
                put(endpoint + "555").
        then().
                statusCode(200).
                body(containsString(dadoUsername)).log();
    }
	@Test
    public void putCustomerNaoexistente(){
        JSONObject requestParams = new JSONObject();
        requestParams.put("firstname", dadoUsername);
		requestParams.put("lastname", dadoLastname);
		

        given().
                body(requestParams.toJSONString()).contentType(ContentType.JSON).
        when().
                put(endpoint + "9999").
        then().
                statusCode(404);
        
    }
	
	@Test
    public void putCustomervazio(){
        JSONObject requestParams = new JSONObject();
		requestParams.put("firstname", dadoVazio);
		requestParams.put("lastname", dadoVazio);

        given().
                body(requestParams.toJSONString()).contentType(ContentType.JSON).
        when().
                put(endpoint + "555").
        then().
                statusCode(400).
                body(containsString(dadoUsername)).log();
    }
	
	@Test
    public void deleteCustomerTest(){
		given().
        when().
                delete(endpoint + "730").
        then()
                .statusCode(200).log();
    }
	
	@Test
    public void deleteCustomerNaoExistente(){
		given().
        when().
                delete(endpoint + "9999").
        then()
                .statusCode(404).log();
    }
	
	@Test
    public void deleteCustomerString(){
		given().
        when().
                delete(endpoint + "asdf").
        then()
                .statusCode(400).log();
    }
}