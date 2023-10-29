package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Todo;
import com.example.demo.repositories.TodoRepository;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    // create todo
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // get todo by id
    public Todo getById(long id) {
        return todoRepository.findById(id).orElse(null);
    }

    // get all todos
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    // update todo
    public Todo update(Todo todo) {
        return todoRepository.save(todo);
    }

    // delete todo
    public void delete(long id) {
        todoRepository.deleteById(id);
    }
}
