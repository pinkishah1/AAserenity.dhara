package com.virgin.games.testsuite;

import com.virgin.games.utils.PropertyReader;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SerenityRunner.class)
public class UserAssertionTest {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://www.virgingames.com/api/jackpots/bingo";
        response = given().
                when().
                get("").
                then().statusCode(200);
    }

    @Title("Verify the id equal to 194")
    @Test
    public void test01() {
        response.body("data.pots.id", anything("194"));
    }

}
