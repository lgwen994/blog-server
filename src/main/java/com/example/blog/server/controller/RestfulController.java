package com.example.blog.server.controller;
import com.example.blog.server.entity.CommonContainer;
import com.example.blog.server.entity.Details;
import com.example.blog.server.service.DealingService;
import com.example.blog.server.service.DealingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/blog_server")
public class RestfulController {
    @Autowired
    private DealingService service;
    @RequestMapping(value = "/details", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public CommonContainer details() {
        CommonContainer commonContainer = new CommonContainer();
        commonContainer.setData(service.details());
        commonContainer.setSuccess(true);
        return commonContainer;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public CommonContainer home() {
        CommonContainer commonContainer = new CommonContainer();
        commonContainer.setData(service.home());
        commonContainer.setSuccess(true);
        return commonContainer;
    }
    @RequestMapping(value = "/headerlist", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
//    @CrossOrigin("https://lgwen994-test-s3.s3-ap-southeast-2.amazonaws.com/")
    public CommonContainer headerlist() {
        CommonContainer commonContainer = new CommonContainer();
        List list = new ArrayList<String>();
        list.add("c#");
        list.add("Java");
        list.add("Coding");
        list.add("Testing");
        list.add("design");
        list.add("DevOps");
        list.add("Docker");


        commonContainer.setData(list);
        commonContainer.setSuccess(true);
        System.out.println("xxxxxxxxxxxxxxxxx");
        return commonContainer;
    }

}
