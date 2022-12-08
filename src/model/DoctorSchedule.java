/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dipikam
 */
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
        String[] time={"10:00AM","11:00AM","12:00PM","1:00PM","2:00PM"};
        for (int rowNum=0; rowNum<5;rowNum++) {
            for (int colGroup=0; colGroup<5; colGroup++) 
               {
                    schedDir.add(day[rowNum]+" -"+time[colGroup]);
                }
            
        }
    }
    
    public void removerow(String s){
        schedDir.remove(s);
    }
    
}
