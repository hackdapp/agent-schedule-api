package com.cloudwise.smartagent.schedule;

import java.util.Map;

/**
 * @author nolan
 * 
 */
public interface IScheduleListener {
	/**
	 * 调度监听名称
	 * 
	 * @see
	 */
	public String getName();

	/**
	 * 调度执行前
	 * 
	 * @param id
	 *            事件ID
	 * @see
	 */
	public void beginEvent(Map eventMap);

	/**
	 * 调度执行后
	 * 
	 * @param id
	 *            事件ID
	 * @see
	 */
	public void finishEvent(Map eventMap);
}
