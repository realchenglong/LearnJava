
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.annotation.*;
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
// ����һ���򵥵�����ע�⣬�����κγ�Ա����
@Target(ElementType.TYPE_USE)
@interface NotNull{}
// ������ʱʹ������ע��
@NotNull
public class TypeAnnotationTest
	implements @NotNull /* implementsʱʹ������ע�� */ Serializable
{
	// �����β���ʹ������ע��
	public static void main(@NotNull String[] args)
		// throwsʱʹ������ע��
		throws @NotNull FileNotFoundException
	{
		Object obj = "fkjava.org";
		// ǿ������ת��ʱʹ������ע��
		String str = (@NotNull String)obj;
		// ��������ʱʹ������ע��
		Object win = new @NotNull JFrame("������");
	}
	// ������ʹ������ע��
	public void foo(List<@NotNull String> info){}
}