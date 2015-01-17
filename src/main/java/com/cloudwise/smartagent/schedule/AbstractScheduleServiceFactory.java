package com.cloudwise.smartagent.schedule;

import java.util.ArrayList;
import java.util.List;

/**
 * 调度服务工厂类，负现调度窗口的初始化工作.
 * @author nolan
 *
 */
public abstract class AbstractScheduleServiceFactory {
	/**
	 * 调度全局监听类<br>
	 */
	protected static List<ScheduleListener> lisenterList = new ArrayList<ScheduleListener>();

	/**
	 * 添加监听类
	 * 
	 * @param listener
	 * @see
	 */
	public void addListener(ScheduleListener listener) {
		lisenterList.add(listener);
	}

	/**
	 * 启动
	 * 
	 * @see
	 */
	public abstract void startup();

	/**
	 * 启动后执行
	 * 
	 * @see
	 */
	public void doAfterStartService() {
	}

	/**
	 * 销毁
	 * 
	 * @see
	 */
	public abstract void destory();
}
