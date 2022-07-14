package com.bhargav.todoapp.repositories;

import com.bhargav.todoapp.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem,Long> {
}
