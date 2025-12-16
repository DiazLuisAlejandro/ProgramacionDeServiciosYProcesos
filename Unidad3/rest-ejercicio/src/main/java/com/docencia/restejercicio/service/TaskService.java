package com.docencia.restejercicio.service;

import com.docencia.restejercicio.model.Task;
import com.docencia.restejercicio.repository.TaskRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;

    @Autowired
    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    /**
     * Metodo que busca todas las Task en el repository
     * 
     * @return lista de Task
     */
    public List<Task> getAll() {
        return repository.findAll();
    }

    /**
     * Metodo que busca una Task por su id
     * 
     * @param id de la Task
     * @return Task con la id solicitada
     */
    public Task getById(Long id) {
        return repository.findById(id).get();
    }

    /**
     * Metodo que inserta una Task al repository
     * 
     * @param task a insertar
     * @return la task insertada
     */
    public Task create(Task task) {
        return repository.save(task);
    }

    /**
     * Metodo que recibe la id y la Task correspondiente para actualizar
     * 
     * @param id     de la Task
     * @param update de la Task que ya teniamos con una nueva informacion
     * @return Task tras la actualización
     */
    public Task update(Long id, Task update) {
        repository.deleteById(id);
        update.setId(id);
        return repository.save(update);
    }

    /**
     * Metodo que borra una Task del Repository
     * 
     * @param id de la Task a borrar
     */
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
