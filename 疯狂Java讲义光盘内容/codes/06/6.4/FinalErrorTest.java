

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FinalErrorTest
{
	// ����һ��final���ε�ʵ������
	// ϵͳ�����final��Ա��������Ĭ�ϳ�ʼ��
	final int age;
	{
		// ageû�г�ʼ�������Դ˴����뽫�������
//		System.out.println(age);
		printAge();
		age = 6;
		System.out.println(age);
	}
	public void printAge(){
		System.out.println(age);
	}
	public static void main(String[] args)
	{
		new FinalErrorTest();
	}
}
