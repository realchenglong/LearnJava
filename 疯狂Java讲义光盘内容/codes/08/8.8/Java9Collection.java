
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
public class Java9Collection
{
	public static void main(String[] args)
	{
		// ��������4��Ԫ�ص�Set����
		Set set = Set.of("Java", "Kotlin", "Go", "Swift");
		System.out.println(set);
		// ���ɱ伯�ϣ�������뵼������ʱ����
//		set.add("Ruby");
		// ��������4��Ԫ�ص�List����
		List list = List.of(34, -25, 67, 231);
		System.out.println(list);
		// ���ɱ伯�ϣ�������뵼������ʱ����
//		list.remove(1);
		// ��������3��key-value�Ե�Map����
		Map map = Map.of("����", 89, "��ѧ", 82, "Ӣ��", 92);
		System.out.println(map);
		// ���ɱ伯�ϣ�������뵼������ʱ����
//		map.remove("����");
		// ʹ��Map.entry()������ʽ����key-value��
		Map map2 = Map.ofEntries(Map.entry("����", 89),
			Map.entry("��ѧ", 82),
			Map.entry("Ӣ��", 92));
		System.out.println(map2);
	}
}
