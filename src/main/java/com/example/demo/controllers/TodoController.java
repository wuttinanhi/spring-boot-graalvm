package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Todo;
import com.example.demo.services.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public List<Todo> getAll() {
        return todoService.getAll();
    }

    @GetMapping("/{id}")
    public Todo getById(long id) {
        return todoService.getById(id);
    }

    // create todo
    public Todo create(Todo todo) {
        return todoService.createTodo(todo);
    }

    // update todo
    public Todo update(Todo todo) {
        return todoService.update(todo);
    }

    // delete todo
    public void delete(long id) {
        todoService.delete(id);
    }
}
