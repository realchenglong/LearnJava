
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.rowset.*;
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
public class RowSetFactoryTest
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
    public void update(String sql)throws Exception
    {
        // ��������
        Class.forName(driver);
        // ʹ��RowSetProvider����RowSetFactory
        RowSetFactory factory = RowSetProvider.newFactory();
        try(
            // ʹ��RowSetFactory����Ĭ�ϵ�JdbcRowSetʵ��
            JdbcRowSet jdbcRs = factory.createJdbcRowSet())
        {
            // ����SQL��ѯ���
            jdbcRs.setCommand(sql);
            // ���ñ�Ҫ��������Ϣ
            jdbcRs.setUrl(url);
            jdbcRs.setUsername(user);
            jdbcRs.setPassword(pass);

            // ִ�в�ѯ
            jdbcRs.execute();
            jdbcRs.afterLast();
            // ��ǰ���������
            while (jdbcRs.previous())
            {
                System.out.println(jdbcRs.getString(1)
                    + "\t" + jdbcRs.getString(2)
                    + "\t" + jdbcRs.getString(3));
                if (jdbcRs.getInt("student_id") == 3)
                {
                    // �޸�ָ����¼��
                    jdbcRs.updateString("student_name", "�����");
                    jdbcRs.updateRow();
                }
            }
        }
    }
    public static void main(String[] args)throws Exception
    {
        RowSetFactoryTest jt = new RowSetFactoryTest();
        jt.initParam("mysql.ini");
        jt.update("select * from student_table");
    }
}

