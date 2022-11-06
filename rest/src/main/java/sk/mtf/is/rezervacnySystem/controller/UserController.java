package sk.mtf.is.rezervacnySystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.mtf.is.rezervacnySystem.model.User;
import sk.mtf.is.rezervacnySystem.repository.UserRepository;
import sk.mtf.is.rezervacnySystem.services.UserService;

import java.util.List;

@RestController
@CrossOrigin(origins = "localhost:4200")

public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping(path = "/add")
    public @ResponseBody String createUser(@RequestParam String username, @RequestParam String password,
                                           @RequestParam String meno, @RequestParam String priezvisko,
                                           @RequestParam String datumNarodenia, @RequestParam String email,
                                           @RequestParam Integer studentMtf, @RequestParam Integer status)
    {return userService.addNewUser(username,password,meno,priezvisko,datumNarodenia,email,studentMtf,status);}

    /**
     * Get all users
     **/
    @GetMapping (path = "/all")
    public @ResponseBody List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PutMapping(path = "user/edit/{id}")
    public void updateUser (@RequestParam User user, @PathVariable Integer id)
    {
        userService.updateUser(id,user);
    }

    @DeleteMapping(path = "/user/{userid}")
    private void deleteUser(@PathVariable("userid") int userid)
    {
        userService.deleteUser(userid);
    }

}
