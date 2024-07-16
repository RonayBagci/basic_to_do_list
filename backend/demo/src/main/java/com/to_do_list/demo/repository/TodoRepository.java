package com.to_do_list.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.to_do_list.demo.model.Todo;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
