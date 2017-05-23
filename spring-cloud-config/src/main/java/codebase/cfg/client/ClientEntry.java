package codebase.cfg.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chendong on 2017/5/23.
 * <p>
 * spring cloud example
 */
@SpringBootApplication
public class ClientEntry {

    public static void main(String[] args) {
        SpringApplication.run(ClientAppConfig.class, args);
    }
}
