package com.cros.adaptor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CROSController {

    @CrossOrigin(origins = "http://localhost:9090")
    public ResponseEntity getResponse(){
        return ResponseEntity.ok("Allowing object");
    }
}
