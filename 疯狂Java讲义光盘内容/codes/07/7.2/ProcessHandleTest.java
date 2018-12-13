
import java.util.concurrent.*;
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
public class ProcessHandleTest
{
	public static void main(String[] args)
		throws Exception
	{
		Runtime rt = Runtime.getRuntime();
		// ���м��±�����
		Process p = rt.exec("notepad.exe");
		ProcessHandle ph = p.toHandle();
		System.out.println("�����Ƿ�����: " + ph.isAlive());
		System.out.println("����ID: " + ph.pid());
		System.out.println("������: " + ph.parent());
		// ��ȡProcessHandle.Info��Ϣ
		ProcessHandle.Info info = ph.info();
		// ͨ��ProcessHandle.Info��Ϣ��ȡ���������Ϣ
		System.out.println("��������: " + info.command());
		System.out.println("���̲���: " + info.arguments());
		System.out.println("��������ʱ��: " + info.startInstant());
		System.out.println("�����ۼ�����ʱ��: " + info.totalCpuDuration());
		// ͨ��CompletableFuture�ڽ��̽���ʱ����ĳ������
		CompletableFuture<ProcessHandle> cf = ph.onExit();
		cf.thenRunAsync(()->{
			System.out.println("�����˳�");
		});
		Thread.sleep(5000);
	}
}
