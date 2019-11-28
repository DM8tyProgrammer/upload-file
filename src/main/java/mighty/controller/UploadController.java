package mighty.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UploadController {


  @GetMapping("/hello")
  public @ResponseBody String hello() {
    return "hello";
  }

  @PostMapping("/upload")
  public @ResponseBody Response upload(String body) {
    return new Response("hello");
  }
}
