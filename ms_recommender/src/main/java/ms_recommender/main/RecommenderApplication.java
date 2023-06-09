package ms_recommender.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers", "businessLogic", "main", "config"})
public class RecommenderApplication {


    public static void main(String[] args) {
        SpringApplication.run(RecommenderApplication.class, args);
    }
}