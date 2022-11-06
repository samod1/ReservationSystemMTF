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

    public void updateUser(Integer id, User Inuser) {/*
        for (int i=0; i< liUser.size(); i++)
        {
            User user = liUser.get(i);
            if (user.getId().equals(id))
            {
                liUser.set(i,Inuser);
                return "Updated";
            }
        */}


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

