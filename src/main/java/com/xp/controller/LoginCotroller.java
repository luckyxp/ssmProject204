package com.xp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author Climb.Xu
 * @date 2020/3/30 23:03
 */
@Controller
@RequestMapping("user")
public class LoginCotroller {

    @PostMapping("login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        ModelMap modelMap, HttpSession session){
        if (username.equals("admin") && password.equals("123")){
            session.setAttribute("loginUser",username);
            return "redirect:/page/dashboard";
        }else {
            modelMap.addAttribute("msg", "账号或密码错误");
            return "redirect:/page/login";
        }
    }
}
