package eci.cvds.parcial.ECICredit.service;

import eci.cvds.parcial.ECICredit.model.User;
import eci.cvds.parcial.ECICredit.mongoConnection.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registrarUsuario(String nombre, String email) {
        if (userRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("El email ya esta registrado.");
        }
        User user = new User(nombre, email);
        return userRepository.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}