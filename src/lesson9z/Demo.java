package lesson9z;

public class Demo {
    public static void main(String[] args) {
        User[] users = new User[3];
        UserRepository userRepository = new UserRepository(users);
        userRepository.getUserIds();
    }
}
