

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
interface Foo<T>
{
	void test(T t);
}
public class AnnoymousDiamond
{
	public static void main(String[] args)
	{
		// ָ��Foo���з���ΪString
		Foo<String> f = new Foo<>()
		{
			// test()�����Ĳ�������ΪString
			public void test(String t)
			{
				System.out.println("test������t����Ϊ��" + t);
			}
		};
		// ʹ�÷���ͨ�������ʱ�൱��ͨ���������ΪObject
		Foo<?> fo = new Foo<>()
		{
			// test()�����Ĳ�������ΪObject
			public void test(Object t)
			{
				System.out.println("test������Object����Ϊ��" + t);
			}
		};
		// ʹ�÷���ͨ�����ͨ���������ΪNumber
		Foo<? extends Number> fn = new Foo<>()
		{
			// ��ʱtest()�����Ĳ�������ΪNumber
			public void test(Number t)
			{
				System.out.println("test������Number����Ϊ��" + t);
			}
		};
	}
}
