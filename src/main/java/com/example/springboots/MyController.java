/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springboots;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kehuachao
 */
@RestController
public class MyController {
// IoC(控制反轉):將object的控制權交給Spring容器管理(將object存放Spring容器) ->@Component
// DI(依賴注入):將存放在Spring容器中的bean(HpPrinter)交給class使用(取得存放在Spring容器的object) ->@Autowired
// Bean:由Spring創建並存放在Spring容器的object

    // 加在變數上，取得Spring容器中的bean(CannonPrinter)
    @Autowired
    // 加在class變數上，指定要使用的bean的名字，與@Autowired一起使用
    @Qualifier("cannonPrinter")
    private Printer cannoPrinter;

    // for localhost:8080/test
    @RequestMapping("/test")
    public String test() {
        // System.out.println("Hello World");
        cannoPrinter.print("print");
        return "Hello World from return";
    }
}

