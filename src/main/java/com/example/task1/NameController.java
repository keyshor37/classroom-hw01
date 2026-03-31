package com.example.task1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @PostMapping("/name")
    public NameResponse getFullName(@RequestBody NameRequest request) {
        return new NameResponse(request.getFirstName() + " " + request.getLastName());
    }
}