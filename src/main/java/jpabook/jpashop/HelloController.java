package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // @Component를 포함하고 있음
public class HelloController {

    @GetMapping("hello") // hello URL로 오면
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; // View name resources:templates/ +{ViewName}+ .html
    }
}
