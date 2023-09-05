package com.example.Summer_Project.service;

import com.example.Summer_Project.entity.Pharmacy;

import java.util.List;

public interface PharmacyService {
    Pharmacy savePharmacy(Pharmacy pharmacy);

    List<Pharmacy> pharmacyList();

    Pharmacy getBox(Long pharmacyBox);

    Pharmacy getdrugName(String drugName);

    Pharmacy updateQuantity(Pharmacy pharmacy, Long Box);
}
