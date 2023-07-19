package com.Ser.service;

import com.Ser.pojo.Organization;

public interface OrganizationService {

    /**
     * 志愿机构登录
     */
    Organization OrgLogin(String email,String password);

    /**
     * 志愿机构登录
     */
    int orgRegister(Organization organization);
}
