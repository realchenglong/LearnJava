package org.crazyit.main;

import org.crazyit.domain.*;
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
public class Hello
{
	public void info()
	{
		System.out.println("Hello��info����");
	}
	public static void main(String[] args)
	{
		//  ��ȡHello��
		Class<Hello> cls = Hello.class;
		// ��ȡHello�����ڵ�ģ��
        Module mod = cls.getModule();
		// ���ģ����
        System.out.println(mod.getName());
		new Hello().info();
		// ����User�����ʵ�������������ķ���
		System.out.println(new User().sayHi("�����"));
	}
}
