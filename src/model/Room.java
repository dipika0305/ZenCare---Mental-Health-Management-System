/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Mitali
 */
public class Room {
    ArrayList<String>roomDir;

    public ArrayList<String> getRoomDir() {
        return roomDir;
    }

    public void setRoomDir(ArrayList<String> roomDir) {
        this.roomDir = roomDir;
    }

   
    public Room() {
        roomDir=new ArrayList<String>();
        String[] floor = {"First", "Second", "Third"};
        roomDir.add("First Floor Room 1");
        roomDir.add("First Floor Room 2");
        roomDir.add("First Floor Room 3");
        roomDir.add("First Floor Room 4");
        
        roomDir.add("Second Floor Room 1");
        roomDir.add("Second Floor Room 2");
        roomDir.add("Second Floor Room 3");
        roomDir.add("Second Floor Room 4");
        
        roomDir.add("Third Floor Room 1");
        roomDir.add("Third Floor Room 2");
        roomDir.add("Third Floor Room 3");
        roomDir.add("Third Floor Room 4");
//        for (int rowNum=0; rowNum<5;rowNum++) {
//            for (int colGroup=1; colGroup<=10; colGroup++) 
//               {
//                    roomDir.add(floor[rowNum]+" - Room"+colGroup);
//                }
//            
//        }
    }
    
    public void removerow(String s){
        roomDir.remove(s);
   } 
}
