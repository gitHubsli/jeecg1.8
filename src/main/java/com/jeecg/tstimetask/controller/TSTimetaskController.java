package com.jeecg.tstimetask.controller;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public interface TSTimetaskController {
	
	 public void work (JobExecutionContext jobExecutionContext)throws JobExecutionException;
}
