/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springboots;

import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author kehuachao
 */
public class HpPrinter implements Printer, InitializingBean {

    private int count;

    @Override
    public void print(String message) {
        count--;
        System.out.println("Hp printer::" + message);
        System.out.println("HP printer remain::" + count);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // throw new UnsupportedOperationException("Not supported yet.");
        count = 5;
    }

}
