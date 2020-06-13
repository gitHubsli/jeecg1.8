package com.jeecg.tstimetask.service.impl;


import org.jeecgframework.web.system.sms.service.TSSmsServiceI;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jeecg.tstimetask.service.impl.TSTimetaskServiceI;

@Service("TSTimetaskServiceImpl")
public class TSTimetaskServiceImpl implements Job {
	/**
	 * 
	 * @ClassName:SmsSendTask 
	 * @Description: 消息推送定时任务
	 * @date 2014-11-13 下午5:06:34
	 * 
	 */
		public void run() {
		long start = System.currentTimeMillis();
		org.jeecgframework.core.util.LogUtil.info("===================推送消息定时任务开始1===================");
		System.out.print("++++++111111+++++");
		org.jeecgframework.core.util.LogUtil.info("===================推送消息定时任务结束1===================");
		long end = System.currentTimeMillis();
		long times = end - start;
		org.jeecgframework.core.util.LogUtil.info("总耗时"+times+"毫秒");
	}

	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		run();
	}


}