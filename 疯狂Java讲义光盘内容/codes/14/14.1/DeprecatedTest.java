

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
class Apple
{
	// ����info�����ѹ�ʱ
	// since����ָ�����ĸ��汾��ʼ��forRemovalָ����API�����ᱻɾ��
	@Deprecated(since="9", forRemoval=true)
	public void info()
	{
		System.out.println("Apple��info����");
	}
}
public class DeprecatedTest
{
	public static void main(String[] args)
	{
		// ����ʹ��info����ʱ���ᱻ����������
		new Apple().info();
	}
}

