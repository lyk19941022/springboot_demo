package com.liuyukun.controller;

import com.liuyukun.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello");
        //classpath:/templates/hello.html
        return "hello";
    }

    @RequestMapping("/msb")
    public String msb(){
        return "hello";
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(ModelMap map,HttpSession session){
        session.setAttribute("name","张三");
        map.put("thText","th:text设置文本内容 <b>加粗</b>");
        map.put("thUText","th:utext 设置文本内容 <b>加粗</b>");
        map.put("thValue","thValue 设置当前元素的value值");
        map.put("thEach","Arrays.asList(\"th:each\", \"遍历列表\")");
        map.put("thIf","msg is not null");
        map.put("thObject",new Person("zhangsan",12,"男"));
        return "thymeleaf";
    }

    @RequestMapping("/fragment")
    public String fragment(){
        return "fragment";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
