package ciaran.liedeman.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {

    private final String url;
    private final RestTemplate restTemplate;

    @Autowired
    public RestClient(@Value("${url}") String url) {
        this.url = url;
        this.restTemplate = new RestTemplate();
    }

    public void home() {
        ResponseEntity<String> result = restTemplate.getForEntity(url + "/", String.class);
        System.out.println(result);
    }
}
