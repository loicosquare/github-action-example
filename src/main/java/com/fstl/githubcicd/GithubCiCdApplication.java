package com.fstl.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class GithubCiCdApplication {

    @GetMapping("/welcome")
    public String Welcome() {
        return "Welcome to FSTL";
    }

    /*
    Je suis allé dans action dans Github
    En suite j'ai crée une branche ou je choisis ci/cd with java maven
    En suite je fait une merge request
    * */

    public static void main(String[] args) {
        SpringApplication.run(GithubCiCdApplication.class, args);
    }

}
