package de.eiswind.training.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

// tag::snip[]
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HelloIntegrationTest {

    @Autowired
    WebTestClient client;

    @Test
    void testHello() {


        client
                .get()
                .uri("hello")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hello");


    }


    // tag::snip[]
}
// end::snip[]
