package edu.iu.habahram.farm.cropmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/greetings")
    public String greet() {
        return "Hello from Crop Management!";
    }
}
