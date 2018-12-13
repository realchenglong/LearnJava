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
public class AutoCloseTest2
{
	public static void main(String[] args)
		throws IOException
	{
		// ��final���ε���Դ
		final BufferedReader br = new BufferedReader(
			new FileReader("AutoCloseTest.java"));
		// û����ʽʹ��final���Σ���ֻҪ���Ըñ������¸�ֵ�����ñ���������Ч��final
		PrintStream ps = new PrintStream(new
			FileOutputStream("a.txt"));
		// ֻҪ��������Դ����try���Բ�����ڼ���
		try (br;ps)
		{
			// ʹ��������Դ
			System.out.println(br.readLine());
			ps.println("ׯ�������Ժ���");
		}
	}
}
