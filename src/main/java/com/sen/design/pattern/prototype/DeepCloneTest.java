package com.sen.design.pattern.prototype;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 02:58
 * @Description:
 */
public class DeepCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepClone deepClone = new DeepClone();
        DeepCloneTarget deepCloneTarget = new DeepCloneTarget("大傻", "傻大");
        deepClone.setName("松江");
        deepClone.setTarget(deepCloneTarget);

        // DeepClone clone = (DeepClone) deepClone.clone();
        DeepClone clone = deepClone.cloneBySerializable();
        System.out.println("原对象：" + deepClone + "target：" + deepClone.getTarget().hashCode());
        System.out.println("深拷贝对象：" + clone + "target：" + clone.getTarget().hashCode());
    }
}
