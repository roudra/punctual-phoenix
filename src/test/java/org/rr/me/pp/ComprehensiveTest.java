package org.rr.me.pp;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ComprehensiveTest {

    @Test
     void testParallel() {
        Results results = Runner.path("classpath:org/rr/me/pp").parallel(4);
        Assert.assertEquals(results.getErrorMessages(), results.getFailCount(), 0);
    }
}

//    @Test
//    void testHelloEndpoint() {
//        given()
//                .when().get("/hello")
//                .then()
//                .statusCode(200)
//                .body(is("Hello from RESTEasy Reactive"));
//    }
