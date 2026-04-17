package com.duytv4.demo.projfordocker.controllers;

import com.duytv4.demo.projfordocker.models.MainModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface MainController {

    @GetMapping("/user")
    ResponseEntity<MainModel> getMainController();
}
