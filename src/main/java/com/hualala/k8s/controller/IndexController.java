package com.hualala.k8s.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/load",method = RequestMethod.POST)
    @ResponseBody
    public String index(@RequestParam("uname") String uname,@RequestParam("pword") String pword){
        String string = uname+":"+pword;
        System.out.printf(string);
        return string;
    }

    @RequestMapping("/welcome")
    public ModelAndView page(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/index");
        return mv;
    }
}
