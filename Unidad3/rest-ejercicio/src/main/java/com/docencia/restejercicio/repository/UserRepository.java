package com.docencia.restejercicio.repository;

import com.docencia.restejercicio.model.User;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    List<User> users = new ArrayList<>();

    /**
     * Metodo que busca todos los Users de una lista
     * 
     * @return lista de usuario
     */
    public List<User> findAll() {
        return this.users;
    }

    /**
     * Metodo que busca un User por su id
     * 
     * @param id del User
     * @return User con la id solicitada
     */
    public Optional<User> findById(Long id) {
        User user = new User(id);
        User user2 = null;
        if (users.contains(user)) {
            int pos = users.indexOf(user);
            user2 = users.get(pos);
        }

        return Optional.of(user2);
    }

    /**
     * Metodo que inserta un User a la lista
     * 
     * @param user a insertar
     * @return el user insertado
     */
    public User save(User user) {
        if (user == null) {
            return null;
        }
        if (users.contains(user)) {
            int pos = users.indexOf(user);
            users.add(pos, user);
            return user;
        }
        users.add(user);
        return user;
    }

    /**
     * Metodo que borra un User de la lista
     * 
     * @param id del User a borrar
     */
    public void deleteById(Long id) {
        if (id != null) {
            User user = new User(id);

            if (users.contains(user)) {
                int pos = users.indexOf(user);
                users.remove(pos);
            }
        }
    }

    /**
     * Metodo que dice si un User esta en la lista
     * 
     * @param id del User
     * @return True si esta o false si no
     */
    public boolean existsById(Long id) {
        User user = new User(id);
        return users.contains(user);
    }
}
