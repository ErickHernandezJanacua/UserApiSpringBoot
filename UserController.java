package com.erick.userapi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getAll() {
        return users;
    }

    @PostMapping
    public String create(@RequestBody User user) {
        users.add(user);
        return "User created";
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        users.removeIf(u -> u.getId().equals(id));
        return "User deleted";
    }
}
