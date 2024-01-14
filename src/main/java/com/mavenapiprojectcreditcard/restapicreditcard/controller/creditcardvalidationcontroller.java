/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavenapiprojectcreditcard.restapicreditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mavenapiprojectcreditcard.restapicreditcard.service.creditcardvalidationservice;

/**
 *
 * @author roy.lee
 */
@RestController
@RequestMapping("/card/number")
@Validated
public class creditcardvalidationcontroller {
    
    @Autowired
    creditcardvalidationservice service;


    @GetMapping(path = "/{number}")
    Boolean validcardnumber(@PathVariable String number)
    {
        return service.isValid(number);
    }   
}
