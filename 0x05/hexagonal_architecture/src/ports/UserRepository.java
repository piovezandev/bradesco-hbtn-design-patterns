package ports;

//Porta de saída (Interface para persistência)
import java.util.List;

import domain.User;


public interface UserRepository {
 void save(User user);
 User findById(String id);
 List<User> findAll();
}