package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathsService {

    @Override
    public float sum(float a, float b) {
        return a + b;
    }

    @Override
    public float multiply(float a, float b) {
        return a * b;
    }

    @Override
    public float substract(float a, float b) {
        return a-b;
    }

    @Override
    public float divide(float a, float b) {
            return a / b;  //float'ы классно делятмя на нуль
    }

    @Override
    public String toString(float result) {
        return "<b>Your destiny says " + result + "!</b>";

    }
}
