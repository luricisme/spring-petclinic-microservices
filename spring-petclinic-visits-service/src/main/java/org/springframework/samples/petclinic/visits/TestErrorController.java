package org.springframework.samples.petclinic.visits;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// ✅ Đây là Controller riêng, tách khỏi VisitsServiceApplication
@RestController
@RequestMapping("/test")
public class TestErrorController {

    @GetMapping("/fail")
    public ResponseEntity<String> fail() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Simulated error");
    }
}
