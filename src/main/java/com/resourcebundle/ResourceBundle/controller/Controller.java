package com.resourcebundle.ResourceBundle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.ResourceBundle;

@RestController
@RequestMapping("resource/")
public class Controller {

    @Value("${hello.text}")
    private final static String us = null;

//    @Autowired
//    private ResourceBundleMessageSource messageSource;

//    @GetMapping
//    public String getContent(@RequestHeader("Accept-Language") String locale){
//   // Throws NoSuchMessageException
//  // if no corresponding message was found(and no default message was provided by the MessageSourceResolvable)
//        return messageSource.getMessage("hello.text",null, new Locale(locale));
//    }

    @GetMapping
    public ResponseEntity<?> getContent(@RequestHeader("Accept-Language") String locale){

        Locale locale1 = new Locale("en","EN");
        if (locale.equalsIgnoreCase("en")){
            locale1 = new Locale("en","EN");
        }else {
            locale1 = new Locale("fr","FR");
        }
        ResourceBundle bundle = ResourceBundle.getBundle("com.resourcebundle.ResourceBundle.JavaMessage.message",locale1);
        Object[][] rs = {
                {"Capital",bundle.getObject("Capital")},
                { "Area", bundle.getObject("Area") },
                { "Currency", bundle.getObject("Currency") },
        };
        return new ResponseEntity<>(rs, HttpStatus.OK);
    }
}
