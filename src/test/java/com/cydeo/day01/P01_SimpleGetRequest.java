package com.cydeo.day01;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P01_SimpleGetRequest {

    String url = "http://34.203.212.11:8000/api/spartans";

    @Test
    public void SimpleGetRequest(){
        Response response = RestAssured.get(url);
        System.out.println("response.getStatusCode() = " + response.getStatusCode());
        System.out.println("response.statusCode() = " + response.statusCode());

        System.out.println("response.statusLine() = " + response.statusLine());

        int actualStatusCode = response.getStatusCode();
        Assertions.assertEquals(200, actualStatusCode);

        response.prettyPrint();



    }
}
