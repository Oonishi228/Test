package com.example.testdemo.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;



@Getter
public class CreateForm {

    @NotBlank
    @Length(max = 20)
    private String name;

    @NotBlank
    private String residence;

    public CreateForm(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }
}
