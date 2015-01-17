package com.cloudwise.smartagent.schedule;

/**
 * @author nolan
 *
 */
public interface ScheduleListener {
    /**
     * 调度监听名称
     * 
     * @see
     */
    public String getName();

    /**
     * 调度执行前
     * 
     * @param id 事件ID
     * @see
     */
    public void beginEvent(String id);

    /**
     * 调度执行后
     * 
     * @param id 事件ID
     * @see
     */
    public void finishEvent(String id);
}
