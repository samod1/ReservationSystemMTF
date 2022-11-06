package sk.mtf.is.rezervacnySystem.controller;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @Operation(summary="service for user creation")
    @PostMapping(path = "/add")
    public @ResponseBody String createUser(@RequestParam String username, @RequestParam String password,
                                           @RequestParam String meno, @RequestParam String priezvisko,
                                           @RequestParam String datumNarodenia, @RequestParam String email,
                                           @RequestParam Integer studentMtf, @RequestParam Integer status)
    {return userService.addNewUser(username,password,meno,priezvisko,datumNarodenia,email,studentMtf,status);}

    /**
     * Get all users
     **/
    @Operation(summary="service for getting all users")
    @GetMapping (path = "/all")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @Operation(summary="service for updating user")
    @PutMapping(path = "user/edit/{userid}")
    public ResponseEntity<User> updateUser (@RequestBody User user, @PathVariable("userid") int id)
    {
        return new ResponseEntity<User>(userService.updateUser(user,id), HttpStatus.OK);
    }

    @Operation(summary="service for deleting users")
    @DeleteMapping(path = "/user/{userid}")
    private void deleteUser(@PathVariable("userid") int userid)
    {
        userService.deleteUser(userid);
    }

    @Operation(summary="service for getting users by email")
    @GetMapping(path = "/user/email")
    public ResponseEntity<List<User>> getUsersByEmail (@RequestParam String email)
    {
        return userService.getUsersByEmail(email);
    }

    @Operation(summary="service for getting users by firstname")
    @GetMapping(path =  "/user/firstname")
    public ResponseEntity<List<User>> getUsersByName (@RequestParam String meno)
    {
        return userService.getUsersByName(meno);
    }

    @Operation(summary="service for getting users by lastname")
    @GetMapping(path =  "/user/lastname")
    public ResponseEntity<List<User>> getUsersByLastName (@RequestParam String priezvisko)
    {
        return userService.getUsersByLastName(priezvisko);
    }


}
