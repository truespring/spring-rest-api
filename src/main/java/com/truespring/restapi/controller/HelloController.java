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

    // 화면에 문자열로 출력
    @GetMapping(value = "/string")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }

    // 화면에 객체로 출력
    @GetMapping(value = "/json")
    @ResponseBody
    public Hello helloworldJson() {
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    // 화면에 helloworld.ftl의 내용이 출력
    @GetMapping(value = "/page")
    public String helloworld() {
        return "helloworld";
    }

    @Getter
    @Setter
    public static class Hello {
        private String message;
    }
    /*
        @ResponseBody : 결과를 응답에 그대로 출력한다는 의미
                        어노테이션을 지정하지 않으면 return에 지정된 문자열과 같은 이름의 파일을 프로젝트 경로에서 찾아 화면에 출력

        ftl 확장자를 호출하기 위해서는 freemaker 라이브러리를 추가해야함
    * */
}
