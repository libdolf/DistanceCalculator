package br.com.libdolf.distancecalculator.gateway.controller;

import br.com.libdolf.distancecalculator.gateway.request.Request;
import br.com.libdolf.distancecalculator.gateway.response.Response;
import br.com.libdolf.distancecalculator.service.DCService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Distance_Calculator/v1/")
@AllArgsConstructor
public class DCController {

    private DCService service;

    @PostMapping
    public ResponseEntity<Response> getDistanceBetweenTwoPoints(@RequestBody Request request) {
        return ResponseEntity.ok(service.findDistanceBetweenTwoPoints(request));
    }
}
