package com.to_do_list.demo.controller;

import com.to_do_list.demo.model.Todo;
import com.to_do_list.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/allTodos")
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Optional<Todo> todos = Optional.ofNullable(todoService.getTodoById(id));
        return todos.map(ResponseEntity::ok).orElseGet(() ->ResponseEntity.notFound().build());
    }

    @PostMapping("/saveTodo")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        Todo newTodo = todoService.saveOrUpdateTodo(todo);
        return ResponseEntity.ok(newTodo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        Todo existingTodo = todoService.getTodoById(id);
        if (existingTodo != null) {
            existingTodo.setTitle(todo.getTitle());
            existingTodo.setCompleted(todo.isCompleted());
            return todoService.saveOrUpdateTodo(existingTodo);
        }
        return null;
    }
    @PostMapping("/saveMultipleTodos")
    public ResponseEntity<List<Todo>> createMultipleTodos(@RequestBody List<Todo> todos) {
        List<Todo> savedTodos = new ArrayList<>();
        for (Todo todo : todos) {
            Todo newTodo = todoService.saveOrUpdateTodo(todo);
            savedTodos.add(newTodo);
        }
        return ResponseEntity.ok(savedTodos);
    }


    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoService.deleteTodoById(id);
    }
}
