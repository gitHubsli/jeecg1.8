package com.jeecg.sysVal.service;
import com.jeecg.sysVal.entity.SysValEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface SysValServiceI extends CommonService{
	
 	public void delete(SysValEntity entity) throws Exception;
 	
 	public Serializable save(SysValEntity entity) throws Exception;
 	
 	public void saveOrUpdate(SysValEntity entity) throws Exception;
 	
}
