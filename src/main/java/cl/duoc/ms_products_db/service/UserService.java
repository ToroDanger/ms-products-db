package cl.duoc.ms_products_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_products_db.model.entities.User;
import cl.duoc.ms_products_db.model.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> selectAllUsers(){
        List<User> listUsers = userRepository.findAll();
        return listUsers;
    
    }
}
