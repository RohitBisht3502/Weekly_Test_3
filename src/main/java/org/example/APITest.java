package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APITest {
    @Autowired
    Car car;



    @GetMapping("my/api")
    public Car getCar() {
        return car;
    }
}
