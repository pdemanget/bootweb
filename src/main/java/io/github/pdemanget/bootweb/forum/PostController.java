package io.github.pdemanget.bootweb.forum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
  @Autowired
  private PostService postService;


  @RequestMapping(method = RequestMethod.GET, path = "")
  public List<Post> list() {
    return postService.list();
  }

  @RequestMapping(method = RequestMethod.GET, path = "/add")
  public String add() {
    return "hello; world";
  }

}
