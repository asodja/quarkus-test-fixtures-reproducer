package org.my.group;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import com.example.MyTestFactory;

@QuarkusTest
public class MyResourceTest {

    @Test
    public void testTestFixtures() {
        MyService myService = new MyTestFactory().createMyService();

        myService.doSomething();
    }

}