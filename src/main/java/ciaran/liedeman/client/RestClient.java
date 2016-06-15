package ciaran.liedeman.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {

    private final String url;
    private final RestTemplate restTemplate;

    public RestClient() {
        this.url = System.getProperties().getProperty("url");
        this.restTemplate = new RestTemplate();
        System.out.println("URL:" + url);
    }

    public void home() {
        ResponseEntity<String> result = restTemplate.getForEntity(url + "/", String.class);
        System.out.println(result);
    }
}
