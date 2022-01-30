import org.junit.jupiter.api.Test
import io.restassured.RestAssured.get
import org.hamcrest.CoreMatchers.containsString



open class ExampleApiRequest {

    @Test
    fun checkContainsKeyAndStatusCode() {
        get("https://reqres.in/api/users?page=2")
            .then()
            .assertThat()
            .body("data[2].last_name", containsString("Funke"))
            .and()
            .statusCode(200)
    }
}

