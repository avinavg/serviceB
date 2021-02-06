package com.demo.csrfb.controller;

import com.demo.csrfb.service.CallService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by guptaavi on 2/6/2021
 */
@Controller
public class AppController {

  private final Logger logger = LogManager.getLogger(this.getClass());

  @Autowired
  public CallService callService;
//
//  @RequestMapping("/clickToWin")
//  public ModelAndView clickToWin() {
//    logger.info("Click to win Endpoint called");
//    callService.callSendMoney();
//    return getView("Thanks");
//  }

  @RequestMapping("/sayHi")
  public ModelAndView callServiceB() {
    logger.info("Test Endpoint called");
    return getView("Hello");
  }

  private ModelAndView getView(String name) {
    ModelAndView view = new ModelAndView();
    view.setViewName(name);
    return view;
  }
}
