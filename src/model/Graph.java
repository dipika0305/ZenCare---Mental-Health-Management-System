/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.HashMap;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;


/**
 *
 * @author Dipika
 */
public class Graph extends javax.swing.JFrame {
    
    public ChartFrame create(HashMap<String,Integer> map){
        DefaultPieDataset dataset = new DefaultPieDataset();
        int total=0;
        double value=0.0;
        
        for(String s:map.keySet())
            total+=map.get(s);
        
        for(String s:map.keySet()){
            value=(map.get(s)*100)/total;
            dataset.setValue(s,value );
        }
        
        JFreeChart chart = ChartFactory.createPieChart("New", dataset);
        
        ChartFrame yourFrame = new ChartFrame("New", chart);

        yourFrame.setSize(600, 600);

        yourFrame.setVisible(true);
        return yourFrame;
    }
}
