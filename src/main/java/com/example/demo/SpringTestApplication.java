package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringTestApplication {
    @GetMapping("/welcome")
    public String welcome(){
        return "AAAaaaaaaaaaaaaa";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }
    /*
    * echo "# springboottest" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/whodin/springboottest.git
    git push -u origin main
    * */
}
