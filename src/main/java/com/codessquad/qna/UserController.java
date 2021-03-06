package com.codessquad.qna;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    List<User> users = new ArrayList<>();

    @PostMapping("/users")
    public String createUser(User user) {
        users.add(user);

        return "redirect:/users";
    }

    @GetMapping("/users")
    public String showUserList(Model model) {
        model.addAttribute("users", users);

        return "user/list";
    }

    @GetMapping("/users/{userId}")
    public String showUserProfile(@PathVariable String userId, Model model) {
        users.stream()
                .filter(user -> user.getUserId().equals(userId))
                .forEach(user -> model.addAttribute("userprofile", user));

        return "user/profile";
    }

    @GetMapping("/users/{userId}/form")
    public String modifyUserProfile(@PathVariable String userId, Model model) {
        users.stream()
                .filter(user -> user.getUserId().equals(userId))
                .forEach(user -> model.addAttribute("userprofile", user));

        return "user/updateForm";
    }

    @PostMapping("/users/{userId}/update")
    public String updateUserProfile(@PathVariable String userId, Model model, User updateuser) {
        users.stream()
                .filter(user -> user.getUserId().equals(userId))
                .forEach(user -> {
                    user.setPassword(updateuser.getPassword());
                    user.setName(updateuser.getName());
                    user.setEmail(updateuser.getEmail());
                    model.addAttribute("userprofile", user);
                });

        return "redirect:/users";
    }
}
