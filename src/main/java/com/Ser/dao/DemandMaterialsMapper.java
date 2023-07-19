package com.Ser.dao;


import com.Ser.pojo.DemandIssue;
import com.Ser.pojo.DemandList;
import com.Ser.pojo.DemandMaterials;
import com.Ser.pojo.DonateList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DemandMaterialsMapper {

    /**
     * 查询所有的需求信息
     */
    List<DemandList> findALlDemand();

    /**
     * 捐赠物资，改变物资现有数量
     */
    int updateNowNum(DonateList donateList);

    /**
     * 发布物资需求
     */
    int demandMaterial(@Param("demands") List<DemandIssue> demands);
}
