package Num6;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Test6 {

	public static void main(String[] args) {
// 1、ArrayList:
		
/*		  ArrayList list=new ArrayList();
		  list.add("苹果");
		  list.add("香蕉");
		  list.add("荔枝");
		  list.add("菠萝");
		  list.add("西瓜");
		  list.remove("西瓜");//删除

		  System.out.println(list);
		  for(int i=0;i<list.size();i++)
		  {
			  System.out.println(list.get(i));
		  }
		  //迭代器:
		  //列表迭代器:
		  System.out.println(list);
		  ListIterator it=list.listIterator();//Iterator不可以进行此类操作
		  while(it.hasNext())//正向遍历
		  {
			Object obj=it.next();
					if(obj.equals("香蕉"))
					{
						it.set("hhaaa");
					}
		  }
		  System.out.println(list);
		  
		  while(it.hasPrevious())//逆向遍历
		  {
			  System.out.println(it.previous());
		  }
*/
		
//2、linkedList:
		
/*		LinkedList<String> lList = new LinkedList<String>();  
	    lList.add("1");  
	    lList.add("2");  
	    lList.add("3");  
	    lList.add("4");  
	    lList.add("5");  
	  
	  
	    System.out.println("链表的第一个元素是 : " + lList.getFirst());  
	    System.out.println("链表最后一个元素是 : " + lList.getLast());  
*/

//3、HashSet:
		
/*		HashSet set=new HashSet();
		set.add(123);
		set.add(1212);
		set.add("lalala");
		set.add("你好");
		set.add("Peter");
		set.add("回家");
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
*/
		
//4、TreeSet：
/*		
		TreeSet tree=new TreeSet();
		tree.add("China");
		tree.add("America");
		tree.add("Japan"); 
		tree.add("Chinese"); 
		
		Iterator iterator=tree.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		*/

//5、HashTable：
/*		
		Hashtable table=new Hashtable();
		table.put(1, "China");
		table.put(3, "USA");
		table.put(2, "UN");
		table.put(4, "Australia");
		
		Iterator iterator=table.entrySet().iterator();
		while(iterator.hasNext())
		{
			 Map.Entry e=(Map.Entry)iterator.next();
			 System.out.println("Key:"+e.getKey()+"    value:"+e.getValue());
		}
*/
	

//6、HashMap：
	
/*	  HashMap hsMap=new HashMap();
	  hsMap.put("小明","18");
	  hsMap.put("小丽","19");
	  hsMap.put("花花","16");
	  hsMap.put("小陈","20");
	  Iterator it=hsMap.entrySet().iterator();
	  while(it.hasNext())
	  {
		  Map.Entry e=(Map.Entry)it.next();
		  System.out.println("Key:"+e.getKey()+"    value:"+e.getValue());
	  }
	  */
		
//7、Vector(Vector类实现了一个动态数组。和ArrayList和相似):
/*		
		  Vector v = new Vector(3, 2);
	      System.out.println("Initial size: " + v.size());
	      System.out.println("Initial capacity: " +
	      v.capacity());
	      v.addElement(new Integer(1));
	      v.addElement(new Integer(2));
	      v.addElement(new Integer(3));
	      v.addElement(new Integer(4));
	      System.out.println("Capacity after four additions: " +
	          v.capacity());

	      v.addElement(new Double(5.45));
	      System.out.println("Current capacity: " +
	      v.capacity());
	      v.addElement(new Double(6.08));
	      v.addElement(new Integer(7));
	      System.out.println("Current capacity: " +
	      v.capacity());
	      v.addElement(new Float(9.4));
	      v.addElement(new Integer(10));
	      System.out.println("Current capacity: " +
	      v.capacity());
	      v.addElement(new Integer(11));
	      v.addElement(new Integer(12));
	      System.out.println("First element: " +
	         (Integer)v.firstElement());
	      System.out.println("Last element: " +
	         (Integer)v.lastElement());
	      if(v.contains(new Integer(3)))
	         System.out.println("Vector contains 3.");
	      // enumerate the elements in the vector.
	      Enumeration vEnum = v.elements();
	      System.out.println("\nElements in vector:");
	      while(vEnum.hasMoreElements())
	         System.out.print(vEnum.nextElement() + " ");
	      System.out.println();
*/
	      
//8、Stack 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
		
        Stack stack = new Stack(); // 创建堆栈对象 
        System.out.println("11111, absdder, 29999.3 三个元素入栈"); 
        stack.push(new Integer(11111)); //向 栈中 压入整数 11111
        printStack(stack);  //显示栈中的所有元素

        stack.push("absdder"); //向 栈中 压入
        printStack(stack);  //显示栈中的所有元素

        stack.push(new Double(29999.3)); //向 栈中 压入
        printStack(stack);  //显示栈中的所有元素

        String s = new String("absdder");
        System.out.println("元素absdder在堆栈的位置"+stack.search(s));      
        System.out.println("元素11111在堆栈的位置"+stack.search(11111));

        System.out.println("11111, absdder, 29999.3 三个元素出栈"); //弹出 栈顶元素 
        System.out.println("元素"+stack.pop()+"出栈");
        printStack(stack);  //显示栈中的所有元素
        System.out.println("元素"+stack.pop()+"出栈");
        printStack(stack);  //显示栈中的所有元素
        System.out.println("元素"+stack.pop()+"出栈");
        printStack(stack);  //显示栈中的所有元素
	}

	private static void printStack(Stack stack) {
		// TODO 自动生成的方法存根
		   if (stack.empty())
	            System.out.println("堆栈是空的，没有元素");
	            else {
	                System.out.print("堆栈中的元素：");
	                Enumeration items = stack.elements(); // 得到 stack 中的枚举对象 
	                while (items.hasMoreElements()) //显示枚举（stack ） 中的所有元素
	                    System.out.print(items.nextElement()+" ");
	            }
	        System.out.println(); //换行
	}
        	
	}

