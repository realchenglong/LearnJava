package org.fkjava.main;

import org.crazyit.user.User;
import java.lang.reflect.*;

import java.sql.*;
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
public class Main
{
	public static void main(String[] args)throws Exception
	{
		// org.crazyit.shop������ֻ������Ϊ��������exports������
		// ��˿������ɷ���User��
		User user = new User();
		System.out.println(user.addUser("yeeku"));
		// org.crazyit.shop������ֻ������Ϊ�����ţ�opens������
		// ���ֻ��ͨ��������ʸð��е�Item��
		Class<?> clazz = Class.forName("org.crazyit.shop.Item");
		Object im = clazz.getConstructor().newInstance();
		Method mtd = clazz.getMethod("showInfo");
		mtd.invoke(im);
	}
}
