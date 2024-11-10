/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springboots;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/**
 *
 * @author kehuachao
 */
// 加在class上，將class變成Spring容器所管理的bean
@Component("cannonPrinter")
public class CannonPrinter implements Printer {

    private int count;
    // 取得application.properties中指定的key的值
    // 格式為"${key:預設值}"(如果找不到對應的key就會使用預設值)
    // 類型要一致(String)
    @Value("${printer.canonPrinter:Canon Printer}")
    private String name;

    // Spring創建CannonPrinter object時執行initialize，初始化CannonPrinter內容
    // PostConstruct: 一定要是public & void; 方法名稱任意，但不可有參數(常用)
    @PostConstruct
    public void initialize() {
        count = 5;
    }

    @Override
    public void print(String message) {
        if (count > 0) {
            count--;
            System.out.println(name + "::" + message);
            System.out.println(name + "remain::" + count);
        } else {
            System.out.println(name + "remain::" + count);
        }

    }

}
