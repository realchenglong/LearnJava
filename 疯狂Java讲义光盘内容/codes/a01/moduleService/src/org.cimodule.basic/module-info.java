
import org.crazyit.oa.UserService;
import org.crazyit.oa.impl.UserServiceImpl;
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
module org.cimodule.basic
{
	// ָ����������ӿ����ڵ�ģ��
	requires org.cimodule;
	// ΪUserService����ӿ��ṩUserServiceImplʵ����
	provides UserService with UserServiceImpl;
}
