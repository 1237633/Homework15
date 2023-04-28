package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.MathsService;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    MathsService mathsService;

    public CalcController(MathsService mathsService) {
        this.mathsService = mathsService;
    }


    @GetMapping
    public String Hello() {
        return "Welcome to ze best calculator! Calculate Your destiny! (accuracy 0%)";
    }

    @GetMapping("/sum")
    public String sum(@RequestParam float a, @RequestParam float b) {
        return mathsService.toString(mathsService.sum(a, b));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam float a, @RequestParam float b) {
        return mathsService.toString(mathsService.multiply(a, b));
    }

    @GetMapping("/substract")
    public String substract(@RequestParam float a, @RequestParam float b) {
        return mathsService.toString(mathsService.substract(a, b));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam float a, @RequestParam float b) {
        return mathsService.toString(mathsService.divide(a, b));
    }

}
