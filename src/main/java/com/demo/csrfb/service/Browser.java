package com.demo.csrfb.service;

/**
 * Created by guptaavi on 2/6/2021
 */

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.stereotype.Service;

@Service
public class Browser {

  public void callUrl(String url) {
//    if(Desktop.isDesktopSupported()){
    Desktop desktop = Desktop.getDesktop();
    try {
      desktop.browse(new URI(url));
    } catch (IOException | URISyntaxException e) {
      e.printStackTrace();
    }
//    }
  }
}