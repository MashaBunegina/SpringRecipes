package me.buneginam.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FirstController {
    @GetMapping("/")
    public String helloRecipes() {
        return "Привет.Это приложение с рецептами";
    }

    @GetMapping("/info")
    public InfoRecord info(){
        return new InfoRecord( "Мария", "Рецепты", LocalDate.of(2023, 01, 11), "приложение для добавления рецептов" );  }
}
