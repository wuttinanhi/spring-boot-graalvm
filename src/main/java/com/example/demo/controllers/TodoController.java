package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/")
    public Todo create(Todo todo) {
        return todoService.createTodo(todo);
    }

    // update todo
    @PutMapping("/{id}")
    public Todo update(@PathVariable long id, @RequestBody Todo todo) {
        return todoService.update(todo);
    }

    // delete todo
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        todoService.delete(id);
    }
}
