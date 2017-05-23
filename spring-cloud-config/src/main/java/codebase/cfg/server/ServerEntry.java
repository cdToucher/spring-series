package codebase.cfg.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chendong on 2017/5/23.
 * <p>
 * spring cloud example
 */
@SpringBootApplication
public class ServerEntry {

    public static void main(String[] args) {
        SpringApplication.run(ServerAppConfig.class, args);
    }
}
