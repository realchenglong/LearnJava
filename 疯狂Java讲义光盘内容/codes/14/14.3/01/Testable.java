
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
// ʹ@Retentionָ��ע��ı���������ʱ
@Retention(RetentionPolicy.RUNTIME)
// ʹ��@Targetָ�������ε�ע����������η���
@Target(ElementType.METHOD)
// ����һ�����ע�⣬�������κγ�Ա�����������ɴ���Ԫ����
public @interface Testable
{
}
