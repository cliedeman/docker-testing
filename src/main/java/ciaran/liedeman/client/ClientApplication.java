package ciaran.liedeman.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClientApplication {

    private static final int WAIT = 20;

    /**
     * Invoke with -Durl=server-to-test
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ClientApplication.class)
                .web(false).run(args);

        Thread.sleep(1000 * WAIT);

        RestClient restClient = context.getBean(RestClient.class);
        restClient.home();
    }
}
