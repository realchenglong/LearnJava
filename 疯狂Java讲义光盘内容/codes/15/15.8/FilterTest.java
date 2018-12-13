
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
public class FilterTest
{
	public static void main(String[] args)
	{
		try(
			// ����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("object.txt")))
		{
			ois.setObjectInputFilter((info) -> {
				System.out.println("===ִ�����ݹ���===");
				ObjectInputFilter serialFilter = ObjectInputFilter.Config.getSerialFilter();
					if (serialFilter != null) {
						// ����ʹ��ObjectInputFilterִ��Ĭ�ϵļ��
						ObjectInputFilter.Status status = serialFilter.checkInput(info);
						// ���Ĭ�ϼ��Ľ������Status.UNDECIDED
						if (status != ObjectInputFilter.Status.UNDECIDED) {
							// ֱ�ӷ��ؼ����
							return status;
						}
					}
					// ���Ҫ�ָ��Ķ�����1��
					if(info.references() != 1)
					{
						// ������ָ�����
						return ObjectInputFilter.Status.REJECTED;
					}
					if (info.serialClass() != null &&
						// ����ָ��Ĳ���Person��
						info.serialClass() != Person.class)
					{
						// ������ָ�����
						return ObjectInputFilter.Status.REJECTED;
					}
					return ObjectInputFilter.Status.UNDECIDED;
				});
			// ���������ж�ȡһ��Java���󣬲�����ǿ������ת��ΪPerson��
			Person p = (Person)ois.readObject();
			System.out.println("����Ϊ��" + p.getName()
				+ "\n����Ϊ��" + p.getAge());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
