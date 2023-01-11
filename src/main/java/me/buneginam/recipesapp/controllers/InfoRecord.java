package me.buneginam.recipesapp.controllers;

import java.time.LocalDate;

public class InfoRecord {
    private final String name;
    private final String nameProject;
    private final LocalDate dateOfCreation;
    private final String description;

    public InfoRecord(String name, String nameProject, LocalDate dateOfCreation, String description) {
        this.name = name;
        this.nameProject = nameProject;
        this.dateOfCreation = dateOfCreation;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getNameProject() {
        return nameProject;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public String getDescription() {
        return description;
    }
}
