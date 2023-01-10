package me.buneginam.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/")
    public String helloRecipes() {
        return "Привет. Это приложение с рецептами";
    }

    @GetMapping("/info")
    public String info(@RequestParam String name, String nameProject, Integer dateOfCreation, String description) {
        return "Привет, меня зовут " + name + " название проекта " + nameProject + " дата создания " + dateOfCreation + " описание проекта" + description;
    }
}
