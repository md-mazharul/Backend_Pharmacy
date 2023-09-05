package com.example.Summer_Project.service;


import com.example.Summer_Project.entity.Pharmacy;
import com.example.Summer_Project.repositoty.PharmacyRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PharmacyServiceImpl implements PharmacyService{

    @Autowired
    private PharmacyRepositoty pharmacyRepositoty;

    // save information

    @Override
    public Pharmacy savePharmacy(Pharmacy pharmacy){return pharmacyRepositoty.save(pharmacy);}


    @Override
    public List<Pharmacy>pharmacyList(){return (List<Pharmacy>) pharmacyRepositoty.findAll();}

    @Override
    public Pharmacy getBox(Long pharmacyBox){
        List<Pharmacy> names = pharmacyList();
        for(Pharmacy pharmacy: names){
            if(pharmacy.getBox() == pharmacyBox){
                return pharmacy;
            }
        }
        return null;
    }

    @Override


    public Pharmacy getdrugName(String drugName){
        List<Pharmacy> names = pharmacyList();
        for(Pharmacy pharmacy: names){
            if(pharmacy.getDrugName().equals(drugName)){
                return pharmacy;
            }
        }
        return null;
    }



//    public List<Pharmacy>getdrugName(String id){
//        List<Pharmacy> medicine = pharmacyList();
//        List<Pharmacy> tempmedicine = new ArrayList<>();
//
//        for(Pharmacy name:medicine ){
//            if(name.getDrugName().equals(id)){
//                tempmedicine.add(name);
//            }
//        }
//        return tempmedicine;
//    }

    @Override
    public Pharmacy updateQuantity(Pharmacy pharmacy, Long Box){

        Pharmacy depDB = pharmacyRepositoty.findById(Box).get();

        if( Objects.nonNull(pharmacy.getDrugName() )&& !"".equalsIgnoreCase(pharmacy.getDrugName())){
            depDB.setDrugName(pharmacy.getDrugName());
        }

        if(Objects.nonNull(pharmacy.getQuantity() )&& !"".equalsIgnoreCase(String.valueOf(pharmacy.getQuantity()))){
            depDB.setQuantity(pharmacy.getQuantity());
        }

        return pharmacyRepositoty.save(depDB);

    }


}
