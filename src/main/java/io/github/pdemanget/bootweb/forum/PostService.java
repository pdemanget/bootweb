package io.github.pdemanget.bootweb.forum;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

@Service
public class PostService {
  @PersistenceContext
  EntityManager entityManager;
  
  public List<Post> list() {
    TypedQuery<Post> query = entityManager.createNamedQuery("Post.list",Post.class);
    return query.getResultList();
  }
}
