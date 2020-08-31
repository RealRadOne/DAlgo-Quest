class Solution 
{
    public double angleClock(int hour, int minutes) 
    {
        double h_angle=(hour*60+minutes)*0.5;
        double m_angle= minutes*6;
        double angle  = Math.abs(h_angle-m_angle);
        //System.out.println(angle);
        if(angle>180)
            angle=360-angle;
        return angle;
    }
}
