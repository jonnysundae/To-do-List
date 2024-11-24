package com.oisoujon.projetos.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oisoujon.projetos.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
//Não é uma classe, é uma interface que herda o JpaRepository, que fornece
//métodos genéricos para operações CRUD.

}
