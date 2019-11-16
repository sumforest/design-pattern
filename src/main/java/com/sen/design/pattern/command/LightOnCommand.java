package com.sen.design.pattern.command;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 18:09
 * @Description:
 */
public class LightOnCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execu() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
