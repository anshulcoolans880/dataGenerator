package com.poc.datagenerator.controller;

import com.poc.datagenerator.dto.GenerateRequestDto;

import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/request")
@Log4j2
public class GenerationRequestController {


    private static final Logger log = LoggerFactory.getLogger(GenerationRequestController.class);



    @PostMapping("/generate")
    public ResponseEntity generateRequestHandler(GenerateRequestDto requestDto){
        log.info("request receinved "+requestDto);

       // Gen.net();
            return new ResponseEntity(HttpStatus.OK);

    }
}
