package com.demo.csrfb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallService {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private Browser browser;

  public void callSendMoney() {
    browser.callUrl("http://localhost:8080/sendMoney");
//    ResponseEntity entity = restTemplate
//        .getForEntity("http://localhost:8080/sendMoney", String.class);
//    if (entity.getStatusCode().equals(HttpStatus.UNAUTHORIZED) ||
//        entity.getBody().equals(HttpStatus.NOT_FOUND) || entity.getBody().toString()
//        .contains("to access this page")) {
//      return "NiceDay";
//    } else {
//      return "Thanks";
//    }
  }
}
