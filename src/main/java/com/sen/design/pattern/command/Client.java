package com.sen.design.pattern.command;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 18:24
 * @Description: 命令模式
 */
public class Client {

    public static void main(String[] args) {
        //创建命令接收者
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯开、关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //创建命令发布者
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("--------------打开电灯-------------");
        remoteController.on(0);
        System.out.println("--------------关闭电灯-------------");
        remoteController.off(0);
        System.out.println("--------------取消操作-------------");
        remoteController.undo();

        System.out.println("=========操作电视 ============");
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("--------------打开TV-------------");
        remoteController.on(1);
        System.out.println("--------------关闭TV--------------");
        remoteController.off(1);
        System.out.println("--------------取消操作-------------");
        remoteController.undo();
    }
}
