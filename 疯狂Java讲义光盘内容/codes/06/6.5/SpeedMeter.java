

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
public abstract class SpeedMeter
{
    // ת��
    private double turnRate;
    public SpeedMeter(){}
    // �Ѽ��㳵���ܳ��ķ�������ɳ��󷽷�
    public abstract double calGirth();
    public void setTurnRate(double turnRate)
    {
        this.turnRate = turnRate;
    }
    // ��������ٶȵ�ͨ���㷨
    public double getSpeed()
    {
        // �ٶȵ��� �ܳ� * ת��
        return calGirth() * turnRate;
    }
}
