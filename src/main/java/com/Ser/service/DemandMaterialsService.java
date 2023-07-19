package com.Ser.service;

import com.Ser.pojo.DemandIssue;
import com.Ser.pojo.DemandList;
import com.Ser.pojo.DonateList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DemandMaterialsService {

    /**
     * 查询所有需求
     */
    List<DemandList> findAllDemand();
    /**
     * 捐赠物资，改变物资现有数量
     */
    int updateNowNum(DonateList donateList);
    /**
     * 发布物资需求
     */
    int demandMaterial(List<DemandIssue> demands);
}
