package api.service;


import org.springframework.data.repository.CrudRepository;
import api.model.User;




// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserService extends CrudRepository<User, Integer> {

}
