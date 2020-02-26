package zw.co.mushaninga.service;

import zw.co.mushaninga.model.User;

public interface UserService {

    public User findUserByEmailaddress (String emailaddress);

    public void saveUser(User user);
}
