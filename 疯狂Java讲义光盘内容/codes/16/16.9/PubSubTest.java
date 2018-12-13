
import java.util.concurrent.Flow.*;
import java.util.*;
import java.util.concurrent.*;
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
public class PubSubTest
{
	public static void main(String[] args)
	{
		// ����һ��SubmissionPublisher��Ϊ������
		SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
		// ����������
		MySubscriber<String> subscriber = new MySubscriber<>();
		// ע�ᶩ����
		publisher.subscribe(subscriber);
		// ��������������
		System.out.println("������������...");
		List.of("Java", "Kotlin", "Go", "Erlang", "Swift", "Lua")
			.forEach(im -> {
			// �ύ����
			publisher.submit(im);
			try
			{
				Thread.sleep(500);
			}
			catch (Exception ex){}
		});
		// ��������
		publisher.close();
		// ����������Ϊ���÷������̲߳�����������ͣ�߳�
		synchronized("fkjava")
		{
			try
			{
				"fkjava".wait();
			}
			catch (Exception ex){}
		}
	}
}
// ����������
class MySubscriber<T> implements Subscriber<T>
{
	// �������붩����֮���Ŧ��
	private Subscription subscription;
	@Override  // ����ʱ�����÷���
	public void onSubscribe(Subscription subscription)
	{
		this.subscription = subscription;
		// ��ʼ��������
		subscription.request(1);
	}
	@Override  // ���յ�����ʱ�����÷���
	public void onNext(T item)
	{
		System.out.println("��ȡ������: " + item);
		// ������һ������
		subscription.request(1);
	}
	@Override // ���ĳ���ʱ�����÷���
	public void onError(Throwable t)
	{
		t.printStackTrace();
		synchronized("fkjava")
		{
			"fkjava".notifyAll();
		}
	}
	@Override  // ���Ľ���ʱ�����÷���
	public void onComplete()
	{
		System.out.println("���Ľ���");
		synchronized("fkjava")
		{
			"fkjava".notifyAll();
		}
	}
}