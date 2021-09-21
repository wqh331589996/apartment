package com.link.controller;

import com.link.api.TestService;
import com.link.remote.TestRemotr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestControll implements TestRemotr {
    @Autowired
    private TestService testServicel;
    @Override
    public String test() {
        testServicel.test();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("test");
        return "test";
    }

}
