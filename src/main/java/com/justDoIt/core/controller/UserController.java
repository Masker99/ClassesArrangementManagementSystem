package com.justDoIt.core.controller;

import com.justDoIt.core.pojo.User;
import com.justDoIt.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String logIn(int id,
                        String password,
                        Model model,
                        HttpSession session){
        User user = userService.findUser(id, password);

        if (user != null){
            session.setAttribute("user",user);

            return "user";
        }

        model.addAttribute("msg","输入错误信息，请重新输入！");
        return "LogIn";
    }
}
