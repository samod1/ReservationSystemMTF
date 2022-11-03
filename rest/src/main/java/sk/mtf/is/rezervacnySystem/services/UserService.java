package sk.mtf.is.rezervacnySystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.mtf.is.rezervacnySystem.model.User;
import sk.mtf.is.rezervacnySystem.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;





    public void updateUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user1 -> users.add(user1));

        return users;
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }


    public void deleteUser(int userid) {
        userRepository.deleteById(userid);
    }
}

