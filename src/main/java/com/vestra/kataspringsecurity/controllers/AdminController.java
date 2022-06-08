package com.vestra.kataspringsecurity.controllers;

import com.vestra.kataspringsecurity.service.UserServiceImpl;
import org.jetbrains.annotations.NotNull;
import com.vestra.kataspringsecurity.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AdminController {

    private final UserServiceImpl userServiceImpl;

    public AdminController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/admin")
    public String userList(Model model) {
        model.addAttribute("allUsers", userServiceImpl.findAll());
        return "listOfUsers";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        return "newUser";
    }

    @PostMapping("/adduser")
    public String createUser(@ModelAttribute("user") User user) {
        userServiceImpl.saveUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") long id, @NotNull Model model) {
        User user = userServiceImpl.findById(id);
        model.addAttribute("user", user);
        return "userEdit";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("user") User user){
        userServiceImpl.saveUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        userServiceImpl.deleteById(id);
        return "redirect:/admin";
    }
}
