package com.sen.design.pattern.command;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 18:13
 * @Description: 空实现，对于发送的命令什么也不做，避免对于空命令的判断
 */
public class NoCommand implements Command {
    @Override
    public void execu() {

    }

    @Override
    public void undo() {

    }
}
