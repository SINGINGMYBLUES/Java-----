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
// 1��ArrayList:
		
/*		  ArrayList list=new ArrayList();
		  list.add("ƻ��");
		  list.add("�㽶");
		  list.add("��֦");
		  list.add("����");
		  list.add("����");
		  list.remove("����");//ɾ��

		  System.out.println(list);
		  for(int i=0;i<list.size();i++)
		  {
			  System.out.println(list.get(i));
		  }
		  //������:
		  //�б������:
		  System.out.println(list);
		  ListIterator it=list.listIterator();//Iterator�����Խ��д������
		  while(it.hasNext())//�������
		  {
			Object obj=it.next();
					if(obj.equals("�㽶"))
					{
						it.set("hhaaa");
					}
		  }
		  System.out.println(list);
		  
		  while(it.hasPrevious())//�������
		  {
			  System.out.println(it.previous());
		  }
*/
		
//2��linkedList:
		
/*		LinkedList<String> lList = new LinkedList<String>();  
	    lList.add("1");  
	    lList.add("2");  
	    lList.add("3");  
	    lList.add("4");  
	    lList.add("5");  
	  
	  
	    System.out.println("����ĵ�һ��Ԫ���� : " + lList.getFirst());  
	    System.out.println("�������һ��Ԫ���� : " + lList.getLast());  
*/

//3��HashSet:
		
/*		HashSet set=new HashSet();
		set.add(123);
		set.add(1212);
		set.add("lalala");
		set.add("���");
		set.add("Peter");
		set.add("�ؼ�");
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
*/
		
//4��TreeSet��
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

//5��HashTable��
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
	

//6��HashMap��
	
/*	  HashMap hsMap=new HashMap();
	  hsMap.put("С��","18");
	  hsMap.put("С��","19");
	  hsMap.put("����","16");
	  hsMap.put("С��","20");
	  Iterator it=hsMap.entrySet().iterator();
	  while(it.hasNext())
	  {
		  Map.Entry e=(Map.Entry)it.next();
		  System.out.println("Key:"+e.getKey()+"    value:"+e.getValue());
	  }
	  */
		
//7��Vector(Vector��ʵ����һ����̬���顣��ArrayList������):
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
	      
//8��Stack ջ��Vector��һ�����࣬��ʵ����һ����׼�ĺ���ȳ���ջ��
		
        Stack stack = new Stack(); // ������ջ���� 
        System.out.println("11111, absdder, 29999.3 ����Ԫ����ջ"); 
        stack.push(new Integer(11111)); //�� ջ�� ѹ������ 11111
        printStack(stack);  //��ʾջ�е�����Ԫ��

        stack.push("absdder"); //�� ջ�� ѹ��
        printStack(stack);  //��ʾջ�е�����Ԫ��

        stack.push(new Double(29999.3)); //�� ջ�� ѹ��
        printStack(stack);  //��ʾջ�е�����Ԫ��

        String s = new String("absdder");
        System.out.println("Ԫ��absdder�ڶ�ջ��λ��"+stack.search(s));      
        System.out.println("Ԫ��11111�ڶ�ջ��λ��"+stack.search(11111));

        System.out.println("11111, absdder, 29999.3 ����Ԫ�س�ջ"); //���� ջ��Ԫ�� 
        System.out.println("Ԫ��"+stack.pop()+"��ջ");
        printStack(stack);  //��ʾջ�е�����Ԫ��
        System.out.println("Ԫ��"+stack.pop()+"��ջ");
        printStack(stack);  //��ʾջ�е�����Ԫ��
        System.out.println("Ԫ��"+stack.pop()+"��ջ");
        printStack(stack);  //��ʾջ�е�����Ԫ��
	}

	private static void printStack(Stack stack) {
		// TODO �Զ����ɵķ������
		   if (stack.empty())
	            System.out.println("��ջ�ǿյģ�û��Ԫ��");
	            else {
	                System.out.print("��ջ�е�Ԫ�أ�");
	                Enumeration items = stack.elements(); // �õ� stack �е�ö�ٶ��� 
	                while (items.hasMoreElements()) //��ʾö�٣�stack �� �е�����Ԫ��
	                    System.out.print(items.nextElement()+" ");
	            }
	        System.out.println(); //����
	}
        	
	}

