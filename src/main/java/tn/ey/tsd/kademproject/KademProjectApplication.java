package tn.ey.tsd.kademproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("tn.ey.tsd.kademproject")
public class KademProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(KademProjectApplication.class, args);
    }
}
