/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dipikam
 */
//Store the Doctor's Schedule in an ArrayList
public class DoctorSchedule {
    ArrayList<String>schedDir;

    public ArrayList<String> getSchedDir() {
        return schedDir;
    }

    public void setSchedDir(ArrayList<String> schedDir) {
        this.schedDir = schedDir;
    }
    public DoctorSchedule() {
        schedDir=new ArrayList<String>();
        String[] day = {"Mon", "Tue", "Wed","Thu","Fri"};
        String[] time={"11:00AM","1:00PM","2:00PM","3:00PM","4:00PM"};
        for (int rowNum=0; rowNum<5;rowNum++) {
            for (int colGroup=0; colGroup<5; colGroup++) 
               {
                    schedDir.add(day[rowNum]+" -"+time[colGroup]);
                }
            
        }
    }
    
    public void removerow(String s)
{
   
    schedDir.remove(s);
   
} 
}
