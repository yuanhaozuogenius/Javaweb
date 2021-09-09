package com.barry;

import com.barry.Cal.Calculator;
import com.barry.models.Operation;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author barry
 */
@SpringBootApplication
public class CalculatorDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculatorDemoApplication.class,args);
    }

    @Bean("cal")
    public Calculator calculator(List<Operation> operations) {
        return new Calculator(operations);
    }
    @Bean
    public ApplicationRunner applicationRunner(Calculator calculator){
        return args->{
            calculator.Calculate(100,'+',100);
            calculator.Calculate(100,'*',100);
            calculator.Calculate(100,'-',100);
        };
    }
}
