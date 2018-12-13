
import java.sql.*;
import java.io.*;
import java.util.*;
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
public class BatchTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	public void initParam(String paramFile)throws Exception
	{
		// ʹ��Properties�������������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public void insertBatch(String[] sqls) throws Exception
	{
		// ��������
		Class.forName(driver);
		try(
			Connection conn = DriverManager.getConnection(url , user , pass))
		{
			// �ر��Զ��ύ����������
			conn.setAutoCommit(false);
			// ���浱ǰ���Զ����ύģʽ
			boolean autoCommit = conn.getAutoCommit();
			// �ر��Զ��ύ
			conn.setAutoCommit(false);
			try(
				// ʹ��Connection������һ��Statement����
				Statement stmt = conn.createStatement())
			{
				// ѭ�����ִ��SQL���
				for (String sql : sqls)
				{
					stmt.addBatch(sql);
				}
				// ͬʱ�ύ���е�SQL���
				stmt.executeLargeBatch();
				// �ύ�޸�
				conn.commit();
				// �ָ�ԭ�е��Զ��ύģʽ
				conn.setAutoCommit(autoCommit);
			}
			// �ύ����
			conn.commit();
		}
	}
	public static void main(String[] args) throws Exception
	{
		TransactionTest tt = new TransactionTest();
		tt.initParam("mysql.ini");
		String[] sqls = new String[]{
			"insert into student_table values(null , 'aaa' ,1)",
			"insert into student_table values(null , 'bbb' ,1)",
			"insert into student_table values(null , 'ccc' ,1)",
		};
		tt.insertInTransaction(sqls);
	}
}
