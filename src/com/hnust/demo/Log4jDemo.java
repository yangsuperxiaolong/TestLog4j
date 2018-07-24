package com.hnust.demo;

import org.apache.log4j.Logger;

public class Log4jDemo {
	static Logger logger=Logger.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("调试信息");
		logger.info("普通信息");
		logger.warn("警告信息");
		logger.error("错误信息");
		logger.fatal("致命信息");
	}

}
