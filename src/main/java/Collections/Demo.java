package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Demo {

    public static void main(String[] args) {

     /*   // LIST
        List<Integer> l = new ArrayList<>();l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(110);
        l.add(110);
        System.out.println(l);

        List<String> l1 = new ArrayList<>();
        l1.add("apple");
        l1.add("banana");
        l1.add("orange");
        l1.add("avocado");
        System.out.println(l1);
        
        List<Object> l2 = new ArrayList<>();
        l2.add("apple");
        l2.add(30);
        l2.add("orange");
        l2.add(42);
        System.out.println(l2);
        
        //remove elements
        l2.remove(0);
        System.out.println(l2);
        
        /*l1.remove(3);
        System.out.println(l1);*/
        
        //searching an Element
      /*  if(l.contains("avocado")) {
        	 System.out.println("l contains 10");
        }
        else {
        	System.out.println("not there");
        }
        
        //sorting
        l1.sort(null);
        System.out.println(l1);
        */
    	/*
        //SET
     Set<Integer>s=new HashSet<>();//give unorderd collection
     s.add(20);
     s.add(30);
     s.add(40);
     s.add(50);
     s.add(110);
     s.add(110);
     System.out.println(s);
     
     Set<Integer>s1=new LinkedHashSet<>();//give orderd collection
     s1.add(20);
     s1.add(30);
     s1.add(40);
     s1.add(50);
     s1.add(110);
     System.out.println(s1);
     
     s.remove(40);
     System.out.println(s);
     
     
     Set<String>s2=new HashSet<>();//give unorderd collection
     s2.add("mango");
     s2.add("apple");
     s2.add("lichi");
     s2.add("strwbarry");
     s2.add("banana");
     System.out.println(s2);
     
     Set<Object> l2 = new HashSet<>();
     l2.add("apple");
     l2.add(30);
     l2.add("orange");
     l2.add(42);
     System.out.println(l2);
     */
  
     /* 	
        //QUEUE 
     Queue<String> q=new PriorityQueue<>();	
     q.add("mango");
     q.add("apple");
     q.add("lichi");
     q.add("strwbarry");
     q.add("banana");
     System.out.println(q);
     System.out.println(q.peek());//View 1st element
     System.out.println(q);
     System.out.println(q.poll());//remove 1st element
     System.out.println(q);
    	
    	*/
    	/*
    	//MAP
    	Map<Integer,String> m=new HashMap<>();	
        m.put(101,"mango");
        m.put(102,"apple");
        m.put(103,"lichi");
        m.put(104,"strwbarry");
        m.put(105,"banana");
        System.out.println(m);
        m.remove(103);
        System.out.println(m);
        System.out.println(m.get(104));
    	*/
    	
    	//STACK	
    	Stack<Integer>st=new Stack<>();	
    	st.push(12);
    	st.push(22);
    	st.push(32);
    	st.push(42);
    	st.push(52);
    	st.push(62);
    	System.out.println(st);
    	//st.peek();
    	System.out.println(st.peek());
    	st.pop();
    	System.out.println(st);
    	System.out.println(st.peek());
    	if(st.isEmpty())
    	{
    		System.out.println("Hello");
    	}
    	else
    	{
    		System.out.println("empty!!!");
    	}
    	
    }
    
}