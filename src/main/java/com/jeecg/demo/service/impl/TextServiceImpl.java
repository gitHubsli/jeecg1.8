package com.jeecg.demo.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jeecg.demo.service.TextServiceI;
@Service("TextService")
@Transactional
public class TextServiceImpl implements TextServiceI {
	@Transactional
 public void testDo (){
		System.out.print("+++++++++++++++测试+++++++++++++++++++++");
		
 }
	

}