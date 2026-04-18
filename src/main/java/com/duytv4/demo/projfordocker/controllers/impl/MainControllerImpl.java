package com.duytv4.demo.projfordocker.controllers.impl;

import com.duytv4.demo.projfordocker.controllers.MainController;
import com.duytv4.demo.projfordocker.models.MainModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class MainControllerImpl implements MainController {

    @Override
    public ResponseEntity<MainModel> getMainController() {
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            System.out.println("Server IP: " + ip);
             MainModel mainModel = new MainModel();
            mainModel.setName("DuyTV");
            mainModel.setId("IP: " + ip);
        return ResponseEntity.ok(mainModel);
        } catch (Exception e) {
            System.out.println("Could not retrieve IP: " + e.getMessage());
        }
        return ResponseEntity.ok(new MainModel("DuyTV", "Could not retrieve IP"));
    }
}
