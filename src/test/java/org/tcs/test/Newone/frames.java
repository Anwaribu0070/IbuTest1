package org.tcs.test.Newone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class frames {
	public static void main(String[] args) {
		
		List<Integer> li= new ArrayList(); 
		
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(10);
		
		System.out.println(li);
		
		
		
		int size = li.size();
		System.out.println(size);
		
		//to pick the particular value from the list 
		Integer i1 = li.get(1);
		System.out.println(i1);
		
		
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		
		
		li.add(5, 60);
		System.out.println(li);
		
		
//		li.remove(6);
//		System.out.println(li);
		
		
		li.set(6, 70);
		System.out.println(li);
		
		
		
		List<Integer> l1 = new LinkedList<Integer>();
	l1.addAll(li);
	
	l1.add(80);
	System.out.println(l1);
	
	
//	l1.removeAll(li);
//	System.out.println(l1);
	
	
	//iterate
	
	for(int i=0; i<li.size(); i++) {
		System.out.println(li.get(i));
	}
	
	
	//enhanced for each 
	
	
	for(Integer x : l1)
		System.out.println(x);
	}
		
		
				
		
		
	
	}


