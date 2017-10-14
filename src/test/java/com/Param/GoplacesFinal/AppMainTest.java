package com.Param.GoplacesFinal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PlaceControllerTest {
    String user1;
    @LocalServerPort
    private int port;
    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders headers = new HttpHeaders();
    User user;
    @Before
    public void setUp() throws Exception {
         user = new User("3","Paul Dawson",25);
    }
    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testSaveUser() throws Exception {
        HttpEntity<User> entity = new HttpEntity<User>(user, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/v.0.1/home"),
                HttpMethod.POST, entity, String.class);
        assertNotNull(response);
        String actual = response.getBody();
        System.out.println(actual);
        assertEquals("User saved successfully",actual);
    }
    @Test
    public void testList() throws Exception {
        HttpEntity<Place> entity = new HttpEntity<Place>(null, headers);
        ResponseEntity<Place> response = restTemplate.exchange(
                createURLWithPort("/user/list"),
                HttpMethod.GET, entity, String.class);
        assertNotNull(response);
        System.out.println(response);
        String finalOutput = response.getBody();
        System.out.println(finalOutput);
        assertEquals("data deletedsuccessfully" , finalOutput);

    }

}
