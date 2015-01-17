package com.cloudwise.smartagent.schedule;

import java.util.Map;

public interface IScheduleService {
	/**
	 * @param scheduleId
	 * @return
	 * @see
	 */
	public boolean exist(String scheduleId);

	/**
	 * add the schedule
	 * 
	 * @param scheduleId
	 * @param name
	 * @param cronExp
	 * @param event
	 * @param param
	 * @see
	 */
	public void addSchedule(String scheduleId, String name, String cronExp,
			IScheduleEvent event, Map param);

	/**
	 * update the schedule's define
	 * 
	 * @param scheduleId
	 * @param name
	 * @param cronExp
	 * @param event
	 * @param param
	 * @see
	 */
	public void updateSchedule(String scheduleId, String name, String cronExp,
			IScheduleEvent event, Map<String, ?> param);

	/**
	 * delete the schedule
	 * 
	 * @param scheduleId
	 * @see
	 */
	public void deleteSchedule(String scheduleId);

	/**
	 * run now
	 * 
	 * @param scheduleId
	 *            scheduleId
	 * @param name
	 *            scheduleName
	 * @param cronExp
	 *            the cron expression
	 * @param event
	 *            scheduleEvent
	 * @param param
	 * @see
	 */
	public void runNow(String scheduleId, String name, String cronExp,
			IScheduleEvent event, Map param);
}
