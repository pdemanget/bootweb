package io.github.pdemanget.bootweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
  @Autowired
  private TodoService todoService;

  @RequestMapping(method = RequestMethod.GET, path = "/hello")
  public String hello() {
    return "hello; world";
  }

  @RequestMapping(method = RequestMethod.GET, path = "")
  public List<Todo> list() {
    return todoService.list();
  }

  @RequestMapping(method = RequestMethod.GET, path = "/add")
  public String add() {
    return "hello; world";
  }

}
