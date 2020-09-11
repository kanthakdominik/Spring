package pl.dominik.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.dominik.conference.model.User;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Dominik") String firsName,
                        @RequestParam(value = "lastName", defaultValue = "Kan") String lastName,
                        @RequestParam(value = "age", defaultValue = "24") int age) {

        User user = new User();
        user.setFirsName(firsName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        return user;
    }
}
