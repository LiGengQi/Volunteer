package com.Ser.controller;

import com.Ser.pojo.Organization;
import com.Ser.service.OrganizationServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrganizationController {
    @Autowired
    @Qualifier("OrganizationServiceImp")
    public OrganizationServiceImp organizationServiceImp;


//    机构注册
    @RequestMapping(value = "/OrgRegister",method = RequestMethod.POST)
    public String OrgRegister(Organization organization){
        organizationServiceImp.orgRegister(organization);
        return "success";
    }

    //    机构登录
    @RequestMapping(value = "/orgLogin",method = RequestMethod.GET)
    public @ResponseBody
    Organization OrganizationLogin(@RequestParam("id") String id, @RequestParam("pw") String pw){
        Organization organization = organizationServiceImp.OrgLogin(id,pw);
        if (organization.getEmail() == null){
            return organization;
        }else {
            organization.setLogRight(true);
            return organization;
        }
    }


}
