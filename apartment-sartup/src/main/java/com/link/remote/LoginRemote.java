package com.link.remote;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "user.do")
public interface LoginRemote {
    @RequestMapping
    public String index();

    @RequestMapping(value = "login")
    public String login(String username, String password,
                        Model model);


}
