
import java.util.*;
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
public class GenericAndArray
{
	public static void main(String[] args)
	{
//		// ����������ʱ�С�[unchecked] δ������ת��������
//		List<String>[] lsa = new ArrayList[10];
//		// ��lsa����ת��ΪObject[]���͵ı���
//		Object[] oa = lsa;
//		List<Integer> li = new ArrayList<>();
//		li.add(3);
//		oa[1] = li;
//		// �����������ClassCastException�쳣
//		String s = lsa[1].get(0);              // ��

		List<?>[] lsa = new ArrayList<?>[10];
		Object[] oa = lsa;
		List<Integer> li = new ArrayList<>();
		li.add(3);
		oa[1] = li;
		Object target = lsa[1].get(0);
		if (target instanceof String)
		{
			// ������밲ȫ��
			String s = (String) target;
		}
	}
}
