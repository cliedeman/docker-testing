package ciaran.liedeman.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClientApplication {

    /**
     * Invoke with -Durl=server-to-test
     *
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ClientApplication.class)
                .web(false).run(args);

        RestClient restClient = context.getBean(RestClient.class);
        restClient.home();
    }
}
