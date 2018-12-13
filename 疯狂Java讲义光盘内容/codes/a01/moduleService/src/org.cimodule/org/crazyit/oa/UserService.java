package org.crazyit.oa;

import java.util.ServiceLoader;
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
public interface UserService
{
	Integer addUser(String name);
	String getImplName();
	static UserService newInstance(){
		// ͨ��ServiceLoader�������з���ʵ����
		return ServiceLoader.load(UserService.class)
			// ���ص�һ������ʵ����
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException(
				"�Ҳ���Ĭ�ϵķ���ʵ���ţ�"));
	}
	static UserService newInstance(String providerName){
		// ͨ��ServiceLoader�������з���ʵ����
		ServiceLoader<UserService> sl = ServiceLoader.load(UserService.class);
		// �������з���ʵ����
		for (UserService us : sl)
		{
			if (us.getImplName().equalsIgnoreCase(providerName))
			{
				return us;
			}
		}
		throw new IllegalArgumentException("�޷��ҵ���Ϊ'"
			+ providerName + "'�ķ���ʵ���ߣ�");
	}
}
