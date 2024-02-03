package com.workmode.restapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.workmode.restapi.model.CloudVendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController




@RequestMapping("/cloudvendor")
public class CloudVendorAPI {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendor(String vendorId){
        return new CloudVendor("C1", "hexa","AD1","5894375");
    }
}
