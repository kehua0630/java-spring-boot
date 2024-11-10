/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springboots;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author kehuachao
 */
// Configuration:將class變成設定Spring用的class
@Configuration
public class MyConfiguration {

    // 創建Bean
    @Bean("hpPrinter")
    public Printer hpPrinter() {
        return new HpPrinter();
    }

    // @Bean
    // public Printer cannonPrinter() {
    //     return new CannonPrinter();
    // }
}
