package com.cloudwise.smartagent.schedule;

import java.util.ArrayList;
import java.util.List;

/**
 * 调度服务工厂类，负现调度窗口的初始化工作.
 * 
 * @author nolan
 * 
 */
public abstract class AbstractScheduleServiceFactory {
	/**
	 * 调度全局监听类<br>
	 */
	protected static List<IScheduleListener> lisenterList = new ArrayList<IScheduleListener>();

	/**
	 * 添加监听类
	 * 
	 * @param listener
	 * @see
	 */
	public void addListener(IScheduleListener listener) {
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
	public abstract void doAfterStartService();

	/**
	 * 销毁
	 * 
	 * @see
	 */
	public abstract void destory();

	/**
	 * @return
	 */
	public abstract boolean isStarted();
	
	/**
	 * @return
	 */
	public abstract IScheduleService getIScheduleService();
	
}
