/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author dipikam
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
     public ArrayList<WorkRequest> getFilteredListbyName(String name)
     {
         ArrayList<WorkRequest> list = new ArrayList<WorkRequest>();
         
        for(WorkRequest req:workRequestList)
        {
            if(req.getPatient()!=null && req.getPatient().equalsIgnoreCase(name))
            {
                list.add(req);
               
            }
        }
        return list;
     }
    
}
