package com.ivoronline.springboot_service_interface.controllers;

import com.ivoronline.springboot_service_interface.services.MyServiceImplementation;
import com.ivoronline.springboot_service_interface.services.MyServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  MyServiceInterface myService = new MyServiceImplementation();

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {

    //CALL SERVICE
    String result = myService.hello();

    //RETURN RESULT
    return result;

  }

}
