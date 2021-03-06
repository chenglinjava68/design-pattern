package com.pattern.command.player;

/**
 * User: shijingui
 * Date: 2016/8/3
 */
public interface MacroCommand extends Command {

    /**
     * 移出命令
     *
     * @param command
     */
    public void remove(Command command);

    /**
     * 添加命令
     *
     * @param command
     */
    public void add(Command command);
}
