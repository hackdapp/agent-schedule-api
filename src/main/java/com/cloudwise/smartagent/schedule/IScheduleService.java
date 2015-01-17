package com.cloudwise.smartagent.schedule;

import java.util.Map;

/**
 * ScheduleServiceAPI
 * 
 * @author nolan
 * 
 */
public interface IScheduleService {

	/**
	 * @param id
	 * @return
	 * @see
	 */
	public boolean exist(String id);

	/**
	 * add the schedule
	 * 
	 * @param id
	 * @param name
	 * @param expression
	 * @param event
	 * @param param
	 * @see
	 */
	public void addSchedule(String id, String name, String expression,
			IScheduleEvent event, Map<String, ?> param);

	/**
	 * update the schedule's define
	 * 
	 * @param id
	 * @param name
	 * @param expression
	 * @param event
	 * @param param
	 * @see
	 */
	public void updateSchedule(String id, String name, String expression,
			IScheduleEvent event, Map<String, ?> param);

	/**
	 * delete the schedule
	 * 
	 * @param id
	 * @see
	 */
	public void deleteSchedule(String id);

	/**
	 * run now
	 * 
	 * @param id
	 *            id
	 * @param name
	 *            scheduleName
	 * @param expression
	 *            the cron expression
	 * @param event
	 *            scheduleEvent
	 * @param param
	 * @see
	 */
	public void runNow(String id, String name, String expression,
			IScheduleEvent event, Map<String, ?> param);
}
