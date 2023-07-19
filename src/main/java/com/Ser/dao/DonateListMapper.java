package com.Ser.dao;

import com.Ser.pojo.DonateList;
import org.apache.ibatis.annotations.Param;

public interface DonateListMapper {

    /**
     * 捐赠物资
     */
    int donateMaterials(DonateList donateList);
}
