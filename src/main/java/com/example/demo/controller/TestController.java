package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    /**
     * rest test
     */
    @RequestMapping("test")
    @ResponseBody
    public String test() {
        LOG.info("----->> /test");
        return "Hola mundo";
    }
}
