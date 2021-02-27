package com.truespring.restapi.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloworld")
public class HelloController {

    @GetMapping(value = "/string")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }

    @GetMapping(value = "/json")
    @ResponseBody
    public Hello helloworldJson() {
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    @GetMapping(value = "/page")
    public String helloworld() {
        return "helloworld";
    }

    @Getter
    @Setter
    public static class Hello {
        private String message;
    }
}
