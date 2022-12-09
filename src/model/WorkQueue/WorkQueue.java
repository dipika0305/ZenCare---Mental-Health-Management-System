/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
         ArrayList<WorkRequest> list=new ArrayList<WorkRequest>();
         
        for(WorkRequest req:workRequestList)
        {
            //PatientWorkRequest p=(PatientWorkRequest)req;
            if(req.getPatient()!=null && req.getPatient().equalsIgnoreCase(name))
            {
                list.add(req);
               
            }
        }
        return list;
     }
}