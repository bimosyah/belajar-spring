package com.bimo.syahputro.belajar.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConf {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bimo.syahputro.belajar.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "Petani API",
                "Ini adalah demo API",
                "V1.0",
                "Terms of service",
                new Contact("Bimo S","https://www.linkedin.com/in/bimosyah14/","bimosyah@icloud.com"),
                "Apache License",
                "www.apache.com",
                Collections.emptyList()
        );
        return apiInfo;
    }

}
