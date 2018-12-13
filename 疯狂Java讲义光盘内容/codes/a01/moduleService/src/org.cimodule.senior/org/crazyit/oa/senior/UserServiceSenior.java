package org.crazyit.oa.senior;

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
public class UserServiceSenior implements UserService
{
	static final String IMPL_NAME = "senior user service";
	// ������˽��
	private UserServiceSenior(){}
	// ͨ��static�ġ��޲�����provider���������ط���ʵ���߶���
	public static UserService provider()
	{
		return new UserServiceSenior();
	}
	public Integer addUser(String name)
	{
		System.out.println("===�߼���UserServiceʵ������û���" + name);
		return 29;
	}
	@Override
	public String getImplName()
	{
		return IMPL_NAME;
	}
}
