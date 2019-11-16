package com.sen.design.pattern.command;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 18:14
 * @Description: 遥控器
 */
public class RemoteController {
    /**
     * 开命令数组
     */
    private Command[] onCommands;

    /**
     * 关闭命令数组
     */
    private Command[] offCommands;

    /**
     * 用于记录当前要取消的命令
     */
    private Command unCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 添加初始化命令
     * @param index
     * @param on
     * @param off
     */
    public void setCommand(int index, Command on, Command off) {
        onCommands[index] = on;
        offCommands[index] = off;
    }

    public void on(int index) {
        onCommands[index].execu();
        unCommand = onCommands[index];
    }

    public void off(int index) {
        offCommands[index].execu();
        unCommand = offCommands[index];
    }

    public void undo() {
        unCommand.undo();
    }
}
