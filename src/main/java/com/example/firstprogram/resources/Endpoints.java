package com.example.firstprogram.resources;



import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class Endpoints {

      @RequestMapping("/hello/{name}")
      public String getMessage(@PathVariable("name") String name) {

          return "Hello " + name;
      }

}
