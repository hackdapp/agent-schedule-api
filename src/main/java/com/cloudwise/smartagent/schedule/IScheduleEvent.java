package com.cloudwise.smartagent.schedule;

import java.util.Map;

/**
 * 调度接口
 * 
 * @author nolan
 * 
 */
public interface IScheduleEvent {
	public String getName();

	public void execute(Map map);
}
