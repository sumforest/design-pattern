package com.sen.design.pattern.resposibilitychain;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 23:29
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, new BigDecimal("50000"), 1);

        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("王院长");
        ViceSchoolMasterApprover viceapprover = new ViceSchoolMasterApprover("刘副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("李校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceapprover);
        viceapprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(request);
    }
}
