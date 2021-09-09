package com.barry.Cal;

import com.barry.models.Operation;
import java.util.List;
import java.util.logging.Logger;

public class Calculator {
    Logger logger = Logger.getLogger(String.valueOf(getClass()));
    private List<Operation> operations;
    public Calculator(List<Operation> operations){
        super();
        this.operations = operations;
    }

    public void Calculate(long a, char operator, long b){
        for(Operation o: operations){
            if(o.vaild(operator)){
                long res = o.apply(a,b);
                logger.info(a + " " + operator + " " + b + " = " + res);
            }
            throw new IllegalArgumentException("Illegal operation for operator : " + operator);
        }
    }
}
