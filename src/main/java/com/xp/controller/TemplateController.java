package com.xp.controller;

import com.xp.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;

/**
 * @author Climb.Xu
 * @date 2020/3/31 21:44
 */
@Controller
@RequestMapping("/page")
public class TemplateController {
    @Autowired
    LocaleResolver localeResolver;

    @RequestMapping("login")
    public String hello(HttpServletRequest request, HttpServletResponse response, String l,String msg,ModelMap modelMap) {
        if(!StringUtils.isEmpty(msg)){
            modelMap.addAttribute("msg", msg);
        }
        if (!StringUtils.isEmpty(l)) {
            if (l.equals("en_US"))
                localeResolver.setLocale(request, response, Locale.US);
            if (l.equals("zh_CN"))
                localeResolver.setLocale(request, response, Locale.CHINA);
        }
        return "login";
    }
    @RequestMapping("dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @RequestMapping("student/list")
    public String list() {
        return "student/list";
    }
    @RequestMapping("student/add")
    public String add() {
        return "student/add";
    }
}
