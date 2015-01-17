package com.cloudwise.smartagent.schedule;

import java.util.Map;

/**
 * ScheduleEventAPI
 * 
 * @author nolan
 * 
 */
public interface IScheduleEvent {
	/**
	 * the Event's name.
	 * 
	 * @return
	 */
	public String getName();

	/**
	 * call the default method.
	 * 
	 * @param map
	 */
	public void execute(Map map);
}
