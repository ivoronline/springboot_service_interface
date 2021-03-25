package com.ivoronline.springboot_service_interface.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImplementation implements MyServiceInterface {

  public String hello() {
    return "Hello from Service";
  }

}
