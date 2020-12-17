package jpabook.jpastore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    //Controller -> Model(data) -> View
    public String hello(Model model) {
        //key, value
        model.addAttribute("data", "hello!!!");
        //View name : ../resources/templates/hello.html
        return "hello";
    }
}
