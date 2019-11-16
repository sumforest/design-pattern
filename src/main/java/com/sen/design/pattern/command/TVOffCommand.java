package com.sen.design.pattern.command;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 18:09
 * @Description:
 */
public class TVOffCommand implements Command {

    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execu() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
