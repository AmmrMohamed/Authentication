package com.sumerge.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user) {
        userRepository.save(user);
        return "user added : " + user.getEmail();
    }

    @GetMapping("/findAllUsers")
    public List<UserModel> getUsers() {
        List<User> users = userRepository.findAll();
        List<UserModel> userModelList = new ArrayList<>();
        for (User user : users) {
            UserModel model = new UserModel();
            model.setEmail(user.getEmail());
            model.setPassword(user.getPassword());
            userModelList.add(model);
        }
        return userModelList;
    }

    @GetMapping("/findUser/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @PostMapping("/validate")
    public int ValidateUser(@RequestBody UserModel user) {
//        System.out.println(user);
//        System.out.println(password);
        return userService.Validate(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
        return "user deleted " + id;
    }


//    @RequestMapping(value = "/")
//    public String Greeting(){
//        return "hello world";
//    }
//
//    @GetMapping(value = "/{amr}")
//    public String GreetingName(@PathVariable String amr){
//        return String.format("hello world %s" , amr);
//    }
//    @GetMapping(value = {"","/"})
//    public users NewUser(){
//        users users = new users("amssr.com","123");
//        return users;
//    }


}
