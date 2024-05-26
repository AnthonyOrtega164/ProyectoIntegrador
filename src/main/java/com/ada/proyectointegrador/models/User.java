package com.ada.proyectointegrador.models;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Tag(name = "User Model")
@Getter
@Setter
@AllArgsConstructor
public class User {

    private String id;
    private String name;
    private String email;

}
