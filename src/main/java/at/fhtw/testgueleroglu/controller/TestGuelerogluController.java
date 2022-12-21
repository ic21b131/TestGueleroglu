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

             /*           if ((percentageValue >= 75) && percentageValue < 88)) {
            return "2";
        }

            if ((percentageValue >= 63) && percentageValue < 75))
            return "3";

            if ((percentageValue >= 50) && percentageValue < 63))           nicht fertig geworden, wegen der Zeit
            return "4";

            if (percentageValue < 50)
            return "5"; */

        } else
            return "ausnahme";
    }

}