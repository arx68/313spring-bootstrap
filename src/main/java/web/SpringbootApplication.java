package web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import web.service.RoleServiceImp;
import web.service.UserServiceImp;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserServiceImp userService, RoleServiceImp roleService) {
        return args -> {
            System.out.println("In CommandLineRunnerImpl ");
        };
    }
}
