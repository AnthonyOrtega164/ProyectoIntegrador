package com.ada.proyectointegrador.controllers.health;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Health Controller")
public class HealthController {

    @Operation(summary="check API")
    @RequestMapping("/health")
    public String checkAPI() {
        return "<h1>The API is working ok!</h1>";
    }

}
