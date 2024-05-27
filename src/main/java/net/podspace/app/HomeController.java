package net.podspace.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final MyBean b;

    public HomeController(MyBean b) {
        this.b = b;
    }

    @GetMapping("/")
    public String index() {
        return "Greetings";
    }

    @GetMapping("/other")
    public String other() {
        return "Bean Value = " + b.getValue();
    }

}
