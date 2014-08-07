/*
 * ExceptionAction
 * V 1.0.0
 * 2012/8/29
 *
 * Copyright © 2012 中国电信股份有限公司增值业务运营中心 版权所有
 *
 * 所有文字、代码资料，版权均属中国电信股份有限公司增值业务运营中心
 * 所有，任何公司或个人未经本司协议授权，不得复制、下载、存储或公开
 * 显示。违者本公司将依法追究责任。
 */

package com.jrds.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jrds.action.base.BaseAction;


/**
 * 处理Action异常
 * 
 * @author LiuTong
 * 
 */
public class ExceptionAction extends BaseAction {
	private Exception exception;
	@Override
	public String execute() {
		try {
			logger.error(exception.getMessage());
		} catch (Exception e) {
			logger.error("输出错误日志异常！", e);
		}
		return ERROR;
	}

	public Exception getException() {
		return exception;
	}
	public void setException(Exception exception) {
		this.exception = exception;
	}
	
	final Logger logger = LoggerFactory.getLogger(ExceptionAction.class);
	private static final long serialVersionUID = 1461747420299280284L;
}
