package com.comcast.springboot2test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FooReactiveController {

    @GetMapping("/hello")
    public Mono<String> getHello() {
        return Mono.just("hello world");
    }



}
