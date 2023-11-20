package com.fstl.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class GithubCiCdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubCiCdApplication.class, args);
    }

}
