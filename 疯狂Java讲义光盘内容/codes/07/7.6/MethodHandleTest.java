
import java.lang.invoke.*;
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
public class MethodHandleTest
{
	// ����һ��private���෽��
	private static void hello()
	{
		System.out.println("Hello world!");
	}
	// ����һ��private��ʵ������
	private String hello(String name)
	{
		System.out.println("ִ�д�������hello" + name);
		return name + ",����";
	}
	public static void main(String[] args) throws Throwable
	{
		// ����һ������ֵΪvoid�������βεķ�������
		MethodType type = MethodType.methodType(void.class);
		// ʹ��MethodHandles.Lookup��findStatic��ȡ�෽��
		MethodHandle mtd = MethodHandles.lookup()
			.findStatic(MethodHandleTest.class, "hello", type);
		// ͨ��MethodHandleִ�з���
		mtd.invoke();
		// ʹ��MethodHandles.Lookup��findVirtual��ȡʵ������
		MethodHandle mtd2 = MethodHandles.lookup()
			.findVirtual(MethodHandleTest.class, "hello",
			// ָ����ȡ����ֵΪString, �β�ΪString�ķ�������
			MethodType.methodType(String.class, String.class));
		// ͨ��MethodHandleִ�з�����������������Ͳ���
		System.out.println(mtd2.invoke(new MethodHandleTest(), "�����"));
	}
}
