package at.fhtw.testgueleroglu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestGuelerogluController {
    @GetMapping("/restapi")
    public String GetGrade(@RequestParam int percentageValue) {

        if (percentageValue >= 88) {
            return "1";

        } else
            return "ausnahme";
    }

}