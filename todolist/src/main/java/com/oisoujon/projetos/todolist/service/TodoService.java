package com.oisoujon.projetos.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.oisoujon.projetos.todolist.entity.Todo;
import com.oisoujon.projetos.todolist.repository.TodoRepository;


@Service
//Para ser um serviço no Spring
public class TodoService {
    //Para executar todas as operações do serviço, precisa do Repository

    private TodoRepository todoRepository;

    //Gera a injeção de dependência: Botão Direito -> Source Action -> Generate Constructors
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list(){
        //todoRepository.findAll();
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending()
        );
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}