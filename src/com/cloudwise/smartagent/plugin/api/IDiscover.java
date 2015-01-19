package com.cloudwise.smartagent.plugin.api;

import java.util.List;

import com.cloudwise.smartagent.plugin.api.exception.DiscoverException;
import com.cloudwise.smartagent.plugin.api.model.ServiceInfo;



public interface IDiscover {
	 
	public int id();
	
	public String name();
	
	public List<ServiceInfo> doDiscover() throws DiscoverException;
}
