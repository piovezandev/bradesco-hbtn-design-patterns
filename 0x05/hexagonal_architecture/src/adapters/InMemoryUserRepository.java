package adapters;

import java.util.*;

import domain.User;
import ports.UserRepository;


public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> database = new HashMap<String, User>();

    public void save(User user) {
        database.put(user.getId(), user);
    }

    public User findById(String id) {
        return database.get(id);
    }

    public List<User> findAll() {
        return new ArrayList<User>(database.values());
    }
}