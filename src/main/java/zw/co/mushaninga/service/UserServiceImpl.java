package zw.co.mushaninga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import zw.co.mushaninga.model.User;
import zw.co.mushaninga.repository.UserRepository;

@Service ("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByEmailaddress(String emailaddress) {
        return userRepository.findByEmailaddress(emailaddress);
    }


    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode((user.getPassword())));
        user.setActive(0);
        userRepository.save(user);
    }
}




