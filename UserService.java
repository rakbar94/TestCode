@Service
public class UserService {

    @Cacheable(value = "users", key = "#id")
    public User getUserById(Long id) {
        simulateSlowService(); // simulate DB delay
        return new User(id, "User " + id);
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000); // simulate delay
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}