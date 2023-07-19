package com.Ser.service;

import com.Ser.dao.OrganizationListMapper;
import com.Ser.pojo.Organization;

public class OrganizationServiceImp implements OrganizationService {
    private OrganizationListMapper organizationListMapper;

    public void setOrganizationListMapper(OrganizationListMapper organizationListMapper){
        this.organizationListMapper = organizationListMapper;
    }

    @Override
    public Organization OrgLogin(String email, String password) {
        return organizationListMapper.OrgLogin(email,password);
    }

    @Override
    public int orgRegister(Organization organization) {
        return organizationListMapper.orgRegister(organization);
    }
}
