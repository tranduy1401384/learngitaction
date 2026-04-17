package com.duytv4.demo.projfordocker.controllers.impl;

import com.duytv4.demo.projfordocker.controllers.MainController;
import com.duytv4.demo.projfordocker.models.MainModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllerImpl implements MainController {

    @Override
    public ResponseEntity<MainModel> getMainController() {
        MainModel mainModel = new MainModel();
        mainModel.setName("DuyTV");
        mainModel.setId("3d2bb5f6-e8b3-4173-b802-4388ead05ea1");
        return ResponseEntity.ok(mainModel);
    }
}
