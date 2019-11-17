package com.sen.design.pattern.resposibilitychain;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 23:15
 * @Description:
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice().longValue() > 3000) {
            System.out.println("请求：" + request.getId() + "被：" + this.name + "处理");
        } else {
            approver.processRequest(request);
        }
    }
}
