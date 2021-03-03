package ua.polina.user_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.polina.user_service.dto.UserDto;
import ua.polina.user_service.entity.User;
import ua.polina.user_service.service.UserService;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/save")
    public User saveUser(@RequestBody UserDto dto) {
        return userService.saveUser(dto);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }
}
