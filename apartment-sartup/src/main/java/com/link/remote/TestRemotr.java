package com.link.remote;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public interface TestRemotr {
    @RequestMapping("/21")
    String test();
}
