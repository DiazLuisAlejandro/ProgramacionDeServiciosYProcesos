package com.docencia.restejercicio.service;

import com.docencia.restejercicio.model.User;
import com.docencia.restejercicio.repository.UserRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    /**
     * Metodo que busca todas los User en el repository
     * 
     * @return lista de User
     */
    public List<User> getAll() {
        return repository.findAll();
    }

    /**
     * Metodo que busca un User por su id
     * 
     * @param id del User
     * @return User con la id solicitada
     */
    public User getById(Long id) {
        return repository.findById(id).get();
    }

    /**
     * Metodo que inserta una User al repository
     * 
     * @param user a insertar
     * @return el User insertada
     */
    public User create(User user) {
        return repository.save(user);
    }

    /**
     * Metodo que recibe la id y el User correspondiente para actualizar
     * 
     * @param id     del User
     * @param update del User que ya teniamos con una nueva informacion
     * @return User tras la actualización
     */
    public User update(Long id, User update) {
        repository.deleteById(id);
        update.setId(id);
        return repository.save(update);
    }

    /**
     * Metodo que borra un User del Repository
     * 
     * @param id del User a borrar
     */
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
