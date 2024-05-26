package com.ada.proyectointegrador.configs;

import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title="Proyecto Integrador",
                version = "1.0.0",
                description = "Proyecto Integrador ADA"
        )
)
public class OpenApiConfig {
}
