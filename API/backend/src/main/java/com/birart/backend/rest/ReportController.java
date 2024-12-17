package com.birart.backend.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @RequestMapping("/reports")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> getReports() {
        return ResponseEntity.ok("REPORT INFO");
    }
}
