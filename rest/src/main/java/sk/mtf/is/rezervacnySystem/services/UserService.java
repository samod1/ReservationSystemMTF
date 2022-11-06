package sk.mtf.is.rezervacnySystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sk.mtf.is.rezervacnySystem.model.User;
import sk.mtf.is.rezervacnySystem.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addNewUser(String meno, String priezvisko, String username, String password, String datumNarodenia, String email, Integer studentMtf, Integer status)
    {
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

    public User updateUser(User user, Integer id) {
        User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found") );
        existingUser.setMeno(user.getMeno());
        existingUser.setPriezvisko(user.getPriezvisko());
        existingUser.setEmail(user.getEmail());
        existingUser.setDatumNarodenia(user.getDatumNarodenia());

        userRepository.save(existingUser);

        return existingUser;


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

    public ResponseEntity<List<User>> getUsersByEmail(String email) {
        return new ResponseEntity<List<User>>(userRepository.findByEmail(email), HttpStatus.OK);
    }
}

