package com.Ser.controller;


import com.Ser.pojo.DemandIssue;
import com.Ser.pojo.DemandList;
import com.Ser.pojo.DonateList;
import com.Ser.service.DemandMaterialsService;
import com.Ser.service.DonateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemandListController {

    @Autowired
    @Qualifier("DemandMaterialsServiceImp")
    private DemandMaterialsService demandMaterialsService;

    @Autowired
    @Qualifier("DonateListServiceImp")
    private DonateListService donateListService;

//    查询需求列表
    @RequestMapping(value = "/demandList",method = RequestMethod.GET)
    public @ResponseBody
    List<DemandList> getDemandList(){
        List<DemandList> list = demandMaterialsService.findAllDemand();
        return list;
    }
//  捐赠物资
    @RequestMapping(value = "/donateMaterial",method = RequestMethod.POST)
    public String DonateMaterial(DonateList donateList){
        donateListService.donateMaterials(donateList);
        demandMaterialsService.updateNowNum(donateList);
        System.out.println(donateList);
        return "success";
    }
    //    物资需求发布
    @RequestMapping(value = "/demandMaterial",method = RequestMethod.POST)
    public String demandMaterial(@RequestBody List<DemandIssue> demandList){
        demandMaterialsService.demandMaterial(demandList);
        return "success";
    }
}
