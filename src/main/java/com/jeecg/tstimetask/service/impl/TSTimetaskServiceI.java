package com.jeecg.tstimetask.service.impl;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public interface TSTimetaskServiceI {
	
	 public void work (JobExecutionContext jobExecutionContext)throws JobExecutionException;
}
