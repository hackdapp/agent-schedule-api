package com.cloudwise.smartagent.plugin.api;

import com.cloudwise.smartagent.plugin.api.exception.CollectException;


/**
 * @author nolan
 *
 */
public interface ICollect {
	public int id();
	
	public String name();
	/**
	 * @return
	 */
	public Object doCollect() throws CollectException;
}
