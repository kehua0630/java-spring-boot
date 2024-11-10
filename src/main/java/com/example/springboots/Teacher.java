package com.example.springboots;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

    // cannonPrinter: @Component創建Bean(較常見)
    @Autowired
    @Qualifier("cannonPrinter")
    private Printer cannonPrinter;

    // hpPrinter: MyConfiguration用@Configuration創建Bean
    // class HpPriner不加@Component
    @Autowired
    @Qualifier("hpPrinter")
    private Printer hpPrinter;

    public void teach() {
        System.out.println("Teacher teaches...");
        cannonPrinter.print("Cannon Printing from teacher.");
        hpPrinter.print("HP Printing from teacher.");
    }
}
