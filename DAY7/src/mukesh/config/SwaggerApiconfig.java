package com.birthdayeventmanagement.mukesh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.birthdayeventmanagement.mukesh.Utils.MyConstant;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.Type;
import io.swagger.v3.oas.models.servers.Server;

import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.SWAGGER_DESCRIPTION;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.SWAGGER_SECURITY_SCHEME_NAME;

import java.util.*;
@Configuration
public class SwaggerApiconfig {
 @Bean
    public OpenAPI openApi(){
        return new OpenAPI().servers(List.of(new Server().url(MyConstant.SWAGGER_LOCALHOST_URL)))
                            .addSecurityItem(new SecurityRequirement()
                            .addList(SWAGGER_SECURITY_SCHEME_NAME))
                            .components(new Components().addSecuritySchemes(SWAGGER_SECURITY_SCHEME_NAME, new SecurityScheme().name(SWAGGER_SECURITY_SCHEME_NAME)
                            .type( Type.HTTP)
                            .scheme(MyConstant.SWAGGER_SCHEME)
                            .description(SWAGGER_DESCRIPTION)
                            .bearerFormat(SWAGGER_DESCRIPTION)));
    }
}
   

