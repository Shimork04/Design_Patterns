package fintech.creational;

import fintech.models.User;

public class UserFactory {
    public static User createUser(String username, String email) {
        return new User(username, email);
    }
}
