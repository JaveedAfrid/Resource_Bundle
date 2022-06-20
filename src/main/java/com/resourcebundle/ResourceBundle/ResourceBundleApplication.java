package com.resourcebundle.ResourceBundle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;
import java.util.ResourceBundle;

@SpringBootApplication
public class ResourceBundleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceBundleApplication.class, args);
	}

//	@Bean
//	public LocaleResolver localResolver(){
//		SessionLocaleResolver slr = new SessionLocaleResolver();
//		slr.setDefaultLocale(Locale.US); // setting the default Locale as English
//		return slr;
//	}
//
//	@Bean
//	public ResourceBundleMessageSource messageSource(){
//		ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
//		rb.setBasename("message/message"); // Setting baseName for the message Resource Bundle
//		rb.setUseCodeAsDefaultMessage(true); // Sets the message code as default message instead of throwing a NoSuchMessageException
//		return rb;
//	}

}
