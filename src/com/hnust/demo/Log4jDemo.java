package com.hnust.demo;

import org.apache.log4j.Logger;

public class Log4jDemo {
	static Logger logger=Logger.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("������Ϣ");
		logger.info("��ͨ��Ϣ");
		logger.warn("������Ϣ");
		logger.error("������Ϣ");
		logger.fatal("������Ϣ");
	}

}
