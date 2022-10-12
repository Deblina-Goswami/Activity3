package com.acc.lkm.mavendemo.Activity2;
import java.util.*;
public class TreeMapAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> treemap =new TreeMap<String, String>(Collections.reverseOrder());
		treemap.put("1", "Akash"); 
        treemap.put("2", "Arjun"); 
        treemap.put("3", "Bhawna"); 
        treemap.put("4", "Gaurav"); 
        treemap.put("5", "Zaina");
treemap.put("5", "Zaina");
        Set set = treemap.entrySet(); 
        Iterator i = set.iterator();
        while (i.hasNext()) { 
            Map.Entry me = (Map.Entry)i.next(); 
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        } 

	}

}
