
import javax.swing.*;

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
public class AllLookAndFeel
{
	public static void main(String[] args)
	{
		System.out.println("��ǰϵͳ���õ�����LAF:");
		for (UIManager.LookAndFeelInfo info :
			UIManager.getInstalledLookAndFeels())
		{
			System.out.println(info.getName()
				+ "--->" + info);
		}
	}
}
