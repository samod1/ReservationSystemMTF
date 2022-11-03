package sk.mtf.is.rezervacnySystem.controller;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.mtf.is.rezervacnySystem.model.User;
import sk.mtf.is.rezervacnySystem.repository.UserRepository;
import sk.mtf.is.rezervacnySystem.services.UserService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "localhost:4200")

public class UserController {
    @Autowired
    private UserService userService;

    /**
     *
     * @return vratia sa vsetky zaznamy s pouzivatelmi
     */
    @GetMapping("/user")
    private List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userid}")
    private User getUserById(@PathVariable("userid") int id)
    {
        return userService.getUserById(id);
    }

    /**
     *
     * @param user updatovany pouzivatel ako JSON
     */
    @PutMapping(path = "/edit")
    public void updateUser(@RequestBody User user)
    {
        userService.updateUser(user);
    }

    @DeleteMapping(path = "/user/{userid}")
    private void deleteUser(@PathVariable("userid") int userid)
    {
        userService.deleteUser(userid);
    }

}

