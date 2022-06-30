package com.nulo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //server.port=8081

    private  final String template = "{\n" +
            "  \"type\": \"success\",\n" +
            "   \"value\": {\n" +
            "      \"id\": 10,\n" +
            "      \"quote\": \"Really loving Spring Boot, makes stand alone Spring apps easy.\"\n" +
            "   }\n" +
            "}";
    @GetMapping("/greeting")
    public String getQuote()  {
        return template;
    }
}
