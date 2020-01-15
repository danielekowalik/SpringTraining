package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OurRestController {


    private SampleService sampleService;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private SampleService sampleServiceBean;

    @Autowired
    public OurRestController(SampleService sampleService) {
        this.sampleService=sampleService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        
        System.out.println(sampleService.whatever());
        System.out.println(sampleServiceBean.whatever());
        return "Hello World";
    }


}
