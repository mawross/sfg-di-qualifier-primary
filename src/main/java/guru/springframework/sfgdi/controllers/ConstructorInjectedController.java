package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    //@Autowired //This annotation on the Constructor annot. is optional. It works without it as well
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
