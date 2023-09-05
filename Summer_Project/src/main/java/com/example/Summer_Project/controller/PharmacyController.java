package com.example.Summer_Project.controller;


import com.example.Summer_Project.entity.Pharmacy;
import com.example.Summer_Project.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    //save Information
    @PostMapping("/pharmacy")
    public Pharmacy savePharmacy(@RequestBody Pharmacy pharmacy){
        return pharmacyService.savePharmacy(pharmacy);
    }
    // read information
    @GetMapping("/pharmacys")
    public List<Pharmacy> pharmacyList(){ return pharmacyService.pharmacyList();}

    //Find information
    @GetMapping("/pharmacy/{id}")
    public Pharmacy getBox(@PathVariable("id") Long id){
        return pharmacyService.getBox(id);
    }

    //Find drugName
    @GetMapping("/drugName/{id}")
    public Pharmacy getdrugName(@PathVariable("id") String id){
        return pharmacyService.getdrugName(id);
    }

    //Update

    @PutMapping("/drugNames/{id}")
    public Pharmacy updateQuantity(@RequestBody Pharmacy pharmacy, @PathVariable("id") Long Box){
        return pharmacyService.updateQuantity(pharmacy,Box);
    }











}
