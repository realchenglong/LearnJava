
import java.awt.event.*;
import javax.swing.*;
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
public class AnnotationTest
{
	private JFrame mainWin = new JFrame("ʹ��ע����¼�������");
	// ʹ��@ActionListenerForע��Ϊok��ť���¼�������
	@ActionListenerFor(listener=OkListener.class)
	private JButton ok = new JButton("ȷ��");
	// ʹ��@ActionListenerForע��Ϊcancel��ť���¼�������
	@ActionListenerFor(listener=CancelListener.class)
	private JButton cancel = new JButton("ȡ��");
	public void init()
	{
		// ��ʼ������ķ���
		JPanel jp = new JPanel();
		jp.add(ok);
		jp.add(cancel);
		mainWin.add(jp);
		ActionListenerInstaller.processAnnotations(this);     // ��
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new AnnotationTest().init();
	}
}
// ����ok��ť���¼�������ʵ����
class OkListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "������ȷ�ϰ�ť");
	}
}
// ����cancel��ť���¼�������ʵ����
class CancelListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "������ȡ����ť");
	}
}