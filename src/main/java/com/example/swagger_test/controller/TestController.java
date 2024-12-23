package com.example.swagger_test.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    @GetMapping()
    public ResponseEntity<String> stringGet(@RequestParam String text) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(text);
    }

    @PostMapping()
    public ResponseEntity<String> saveString(@RequestParam String text) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(text);
    }

    @PutMapping()
    public ResponseEntity<String> updateString(@RequestParam String text) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(text);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteString(@RequestParam String text) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(text);
    }
}
