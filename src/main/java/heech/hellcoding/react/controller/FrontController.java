package heech.hellcoding.react.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class FrontController {

    @GetMapping("/api/home")
    public String getHome() {
        System.out.println("안녕하세요!");
        return "안녕하세요. 현재 서버시간은 " + new Date() + "입니다.";
    }
}
