package sk.mtf.is.rezervacnySystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sk.mtf.is.rezervacnySystem.model.Building;
import sk.mtf.is.rezervacnySystem.model.User;
import sk.mtf.is.rezervacnySystem.repository.UserRepository;

@RestController
@CrossOrigin(origins = "localhost:4200")
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String createUser(@RequestParam String username, @RequestParam String password, @RequestParam String meno, @RequestParam String priezvisko, @RequestParam String datumNarodenia, @RequestParam String email,
                                           @RequestParam Integer studentMtf, @RequestParam Integer status){

        User u = new User();
        u.setMeno(meno);
        u.setPriezvisko(priezvisko);
        u.setUsername(username);
        u.setPassword(password);
        u.setDatumNarodenia(datumNarodenia);
        u.setEmail(email);
        u.setStudentMtf(studentMtf);
        u.setStatus(status);
        userRepository.save(u);
        return "Created";


    }

    @GetMapping (path = "/all")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }

}
