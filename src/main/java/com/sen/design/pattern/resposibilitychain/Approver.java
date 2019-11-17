package com.sen.design.pattern.resposibilitychain;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 23:12
 * @Description:
 */
public abstract class Approver {

    protected Approver approver;

    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理请求的方法
     * @param request
     */
    public abstract void processRequest(PurchaseRequest request);

}
