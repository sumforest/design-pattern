package com.sen.design.pattern.resposibilitychain;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 23:15
 * @Description:
 */
public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice().longValue() <= 1000) {
            System.out.println("请求：" + request.getId() + "被：" + this.name + "处理");
        } else {
            approver.processRequest(request);
        }
    }
}
