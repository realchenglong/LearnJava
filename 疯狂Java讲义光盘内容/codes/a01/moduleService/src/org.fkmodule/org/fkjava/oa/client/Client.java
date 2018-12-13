package org.fkjava.oa.client;

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
public class Client
{
	public static void main(String[] args)
	{
		// ʹ��Ĭ�ϵķ����ṩ�ߣ�����ʹ���ĸ���ȷ��
		UserService us1 = UserService.newInstance();
		System.out.println(us1.addUser("yeeku"));
		// ��ȡ"basic user service"����ʵ����
		UserService us2 = UserService.newInstance("basic user service");
		System.out.println(us2.addUser("yeeku"));
		// ��ȡ"senior user service"����ʵ����
		UserService us3 = UserService.newInstance("senior user service");
		System.out.println(us3.addUser("yeeku"));
		// ��ȡ"best user service"����ʵ����
		UserService us4 = UserService.newInstance("best user service");
		System.out.println(us4.addUser("yeeku"));
	}
}
