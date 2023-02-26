package Service;

import Model.User;

public interface UserService {
    User createUser(String firstName, String lastName, String email, String password, String repeatPassword);
}
