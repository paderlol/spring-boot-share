package com.paderlol;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author paderlol
 * @date: 2019-05-10 22:02
 */
@RestController
public class HelloController {
    @GetMapping("/say")
    public String say(){
        return "hello world";
    }
}
