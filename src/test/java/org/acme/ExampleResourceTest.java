package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ExampleResourceTest {
    @Test
    void testRechneEndpoint() {
        given()
          .when().get("/rechne/10mal2")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST 20.0"));
        given()
                .when().get("/rechne/10plus2")
                .then()
                .statusCode(200)
                .body(is("Hello from Quarkus REST 12.0"));
    }


}