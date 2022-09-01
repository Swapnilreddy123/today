package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiDemo1 {

	public static void main(String[]args)
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RequestSpecification httpreqest= RestAssured.given();
//	  	Response resp=httpreqest.get();
		Response resp=httpreqest.request(Method.DELETE);
		
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getStatusCode());
		 
 
	}
	
}  
