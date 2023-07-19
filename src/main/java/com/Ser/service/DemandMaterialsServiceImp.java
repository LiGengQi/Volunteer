package com.Ser.service;

import com.Ser.dao.DemandMaterialsMapper;
import com.Ser.pojo.DemandIssue;
import com.Ser.pojo.DemandList;
import com.Ser.pojo.DonateList;

import java.util.List;

public class DemandMaterialsServiceImp implements DemandMaterialsService {
    private DemandMaterialsMapper demandMaterialsMapper;
    public void setDemandMaterialsMapper(DemandMaterialsMapper demandMaterialsMapper){
        this.demandMaterialsMapper = demandMaterialsMapper;
    }

    @Override
    public List<DemandList> findAllDemand() {
        return demandMaterialsMapper.findALlDemand();
    }

    @Override
    public int updateNowNum(DonateList donateList) {
        return demandMaterialsMapper.updateNowNum(donateList);
    }

    @Override
    public int demandMaterial(List<DemandIssue> demands) {
        return demandMaterialsMapper.demandMaterial(demands);
    }
}
