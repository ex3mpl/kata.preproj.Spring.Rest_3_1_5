package kata.preproj.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import kata.preproj.Spring.service.AppServiceImpl;

import javax.servlet.http.HttpSession;

@Controller
public class ApplicationController {

    private final AppServiceImpl appService;

    @Autowired
    public ApplicationController(AppServiceImpl appService) {
        this.appService = appService;
    }


    @GetMapping({"", "/"})
    public String main(Model model, HttpSession session, @Nullable Authentication auth) {
        return appService.getPage(model, session, auth);
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied-page";
    }
}
