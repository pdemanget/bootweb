package io.github.pdemanget.bootweb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
  @PersistenceContext
  EntityManager entityManager;
  
  public List<Todo> list() {
    TypedQuery<Todo> query = entityManager.createNamedQuery("Todo.list",Todo.class);
    return query.getResultList();
  }
}
