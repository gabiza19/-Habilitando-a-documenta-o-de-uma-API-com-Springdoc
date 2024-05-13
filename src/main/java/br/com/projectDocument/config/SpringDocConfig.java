package br.com.projectDocument.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                //acesso em: http://localhost:8080/swagger-ui/index.html
                .info(new Info().title("API Restful com Documentação")
                        .description("Exemplo de API Restful utilizando Springdoc para documentação.")
                        .version("1.0.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Link do Repositório da Aplicação - APIRestful Documentation")
                        .url("https://github.com/endereco-repositorio-api"));
    }
}