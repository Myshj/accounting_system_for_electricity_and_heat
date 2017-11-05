package system.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import system.forms.UserForm;

import javax.validation.Valid;

@Controller
//@RequestMapping("web")
public class UserController extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(UserForm userForm){
        return "userForm";
    }

    @PostMapping("/")
    public String checkUserInfo(
            @Valid UserForm userForm,
            BindingResult bindingResult
    ){
        if(bindingResult.hasErrors()){
            return "userForm";
        }

        return "redirect:/results";
    }
}
