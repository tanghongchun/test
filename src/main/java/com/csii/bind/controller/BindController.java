package com.csii.bind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BindController {
     @Autowired
     private RestTemplate restTemplate;

     @RequestMapping("/bind/getList")
     public String getList(){
           List arr=new ArrayList();
           arr.add("11111");
           arr.add("22222");
           arr.add("33333");
           arr.add("4444444");
           System.out.println("/bind/getList");
           System.out.println(arr.toString());
          return  arr.toString();
     }

}
