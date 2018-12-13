package org.crazyit.oa.best;

import org.crazyit.oa.UserService;
/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
public class UserServiceBest
{
	static final String IMPL_NAME = "best user service";
	// ͨ��static�ġ��޲�����provider���������ط���ʵ���߶���
	public static UserService provider()
	{
		return new UserService(){
			public Integer addUser(String name)
			{
				System.out.println("======��õ�UserServiceʵ������û���" + name);
				return 47;
			}
			@Override
			public String getImplName()
			{
				return IMPL_NAME;
			}
		};
	}
}