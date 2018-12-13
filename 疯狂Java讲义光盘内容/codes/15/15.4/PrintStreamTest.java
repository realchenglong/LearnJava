
import java.io.*;
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
public class PrintStreamTest
{
	public static void main(String[] args)
	{
		try(
			FileOutputStream fos = new FileOutputStream("test.txt");
			PrintStream ps = new PrintStream(fos))
		{
			// ʹ��PrintStreamִ�����
			ps.println("��ͨ�ַ���");
			// ֱ��ʹ��PrintStream�������
			ps.println(new PrintStreamTest());
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}

