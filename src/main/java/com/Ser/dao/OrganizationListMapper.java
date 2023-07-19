package com.Ser.dao;

import com.Ser.pojo.Organization;
import org.apache.ibatis.annotations.Param;

public interface OrganizationListMapper {

    /**
     * 志愿机构登录
     */
    Organization OrgLogin(@Param("email")String email,@Param("password")String password);

    /**
     * 志愿机构登录
     */
    int orgRegister(Organization organization);
}
