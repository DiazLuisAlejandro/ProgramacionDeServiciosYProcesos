package com.docencia.restejercicio.repository;

import com.docencia.restejercicio.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

    List<Task> tasks = new ArrayList<>();

    /**
     * Metodo que busca las Tasks
     * 
     * @return la lista de Task
     */
    public List<Task> findAll() {
        return this.tasks;
    }

    /**
     * Metodo que busca una Task por su id
     * 
     * @param id de la Task
     * @return Task con la id solicitada
     */
    public Optional<Task> findById(Long id) {
        Task task = new Task(id);
        Task task2 = null;
        if (tasks.contains(task)) {
            int pos = tasks.indexOf(task);
            task2 = tasks.get(pos);
        }

        return Optional.of(task2);
    }

    /**
     * Metodo que inserta una Task a la lista
     * 
     * @param task a insertar
     * @return la task insertada
     */
    public Task save(Task task) {
        if (task == null) {
            return null;
        }
        if (tasks.contains(task)) {
            int pos = tasks.indexOf(task);
            tasks.add(pos, task);
            return task;
        }
        tasks.add(task);
        return task;
    }

    /**
     * Metodo que borra una Task de la lista
     * 
     * @param id de la Task a borrar
     */
    public void deleteById(Long id) {
        if (id != null) {
            Task task = new Task(id);

            if (tasks.contains(task)) {
                int pos = tasks.indexOf(task);
                tasks.remove(pos);
            }
        }
    }

    /**
     * Metodo que dice si una Task esta en la lista
     * 
     * @param id de la Task
     * @return True si esta o false si no
     */
    public boolean existsById(Long id) {
        Task task = new Task(id);
        return tasks.contains(task);
    }
}
