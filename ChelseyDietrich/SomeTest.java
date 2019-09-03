import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class SomeTest {

    private static RequestSpecification spec;
    private int userId;

    @BeforeAll
    public static void init() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setProxy("gate.swissre.com", 9443)
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    @Test
    public void simpleTest() {

        User[] users = given()
                .spec(spec)
                .when()
                .get("users")
                .then()
                .statusCode(200)
                .extract().as(User[].class);

        for (int i = 0; i < users.length; i++)
        {
            String expected = "Chelsey Dietrich";
            String actual = users[i].getName();

            if (expected.equals(actual))
            {
                Assertions.assertEquals(expected, actual, "Find user by given name");
                userId = users[i].getId();
            }
        }
    }
    @Test
    public void testPosts() {

        Posts[] posts = given()
                .spec(spec)
                .when()
                .get("posts")
                .then()
                .statusCode(200)
                .extract().as(Posts[].class);

        for (int i = 0; i < posts.length; i++)
        {
            String expected ="odio fugit voluptatum ducimus earum autem est incidunt voluptatem\\nodit reiciendis aliquam sunt sequi nulla dolorem\\nnon facere repellendus voluptates quia\\nratione harum vitae ut";

            if (userId == posts[i].getUserId())
            {
                String actual = posts[i].getBody();
                Assertions.assertEquals(expected, actual, "Find Chelsey Dietrich post");
            }
        }

    }
}