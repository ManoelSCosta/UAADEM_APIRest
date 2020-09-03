package br.com.tbmmarketing.uaadem.UAADEM.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket eventoApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.tbmmarketing.uaadem.UAADEM"))
				.paths(PathSelectors.regex("/tbmmarketing/.*"))
				.build()
				.apiInfo(metaInfo());
	}
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"UAADEM API REST",
				"Api para Cadastrar Eventos",
				"1.0",
				"Termos de Serviço",
				new Contact("TBM Marketing Digital", "https://wwww.github.com/tbmmarketing",  
						"tbmmarketingdigital@gmail.com"),
				"Apache License Version 2.0",
				"https://www.apache.org/license.html", new ArrayList<VendorExtension>()
				);
		return apiInfo;
	}
}
