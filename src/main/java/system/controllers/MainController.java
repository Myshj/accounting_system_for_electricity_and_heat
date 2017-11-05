package system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import system.entities.User;
import system.repositories.UserRepository;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewUser(
            @RequestParam String name,
            @RequestParam String email
    ){
        User u = new User(name, email);
        userRepository.save(u);
        return "User saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
                return userRepository.findAll();
    }

    @GetMapping(path = "/delete")
    public @ResponseBody String deleteUser(
            @RequestParam Long id
    ){
        userRepository.delete(id);
        return "User deleted!";
    }
}
