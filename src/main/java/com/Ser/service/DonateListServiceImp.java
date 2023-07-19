package com.Ser.service;

import com.Ser.dao.DonateListMapper;
import com.Ser.pojo.DonateList;

public class DonateListServiceImp implements DonateListService {
    private DonateListMapper donateListMapper;
    public void setDonateListMapper(DonateListMapper donateListMapper){
        this.donateListMapper = donateListMapper;
    }

    @Override
    public int donateMaterials(DonateList donateList) {
        return donateListMapper.donateMaterials(donateList);
    }
}
