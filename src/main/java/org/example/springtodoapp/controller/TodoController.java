package org.example.springtodoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoController {
    private final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @GetMapping("/")
    public ModelAndView index() {
        logger.debug("request to GET index");
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}
