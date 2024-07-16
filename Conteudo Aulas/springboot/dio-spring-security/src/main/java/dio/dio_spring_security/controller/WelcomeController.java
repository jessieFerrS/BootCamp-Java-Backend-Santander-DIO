package dio.dio_spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){

        return "Welcome to My Spring Boot Web API";
    }
    @GetMapping("/users")
    //@PreAuthorize("hasAnyRole('MANAGERS','USERS')") -> remover para fazer o configure adapter
    public String users() {

        return "Authorized user";
    }
    @GetMapping("/managers")
    //@PreAuthorize("hasRole('MANAGERS')") -> remover para fazer o configure adapter
    public String managers() {

        return "Authorized manager";
    }
}
