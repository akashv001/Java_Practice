package javacoursePractice.hashmap;

import java.util.HashMap;
import java.util.*;
public class intersection {

	public static void main(String[] args) {
		// to find the intersection of these two arrays
		int [] one= {5,1,3,4,7};
        int [] two= {2,4,3,5,7,10,15};
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<one.length;i++) {
        	map.put(one[i], 1);
        }
        
        for(int i=0;i<two.length;i++) {
        	if(map.containsKey(two[i])) {
        		int val=map.get(two[i]);
        		val=val+1;
        		map.put(two[i], val);
        	}else {
        		map.put(two[i], 1);
        	}
        }
        
        Set<Map.Entry<Integer,Integer>> entries=map.entrySet();
        
        for(Map.Entry<Integer,Integer> entry:entries) {
        	if(entry.getValue()>1) {
        		System.out.print(entry.getKey()+" ");
        	}
        }
        System.out.println("End");
	}

}
