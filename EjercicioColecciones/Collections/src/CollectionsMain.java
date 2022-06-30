import java.util.*;

public class CollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  
		 ArrayList al=new ArrayList();  // creating array list
		 al.add("Jack");                // adding elements    
		 al.add("Tyler");
		 Iterator itr=al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
		
		 
	
		         LinkedList<String> al1=new LinkedList<String>();// creating linked list 
		         al1.add("Rachit"); // adding elements 
		         al1.add("Rahul"); 
		         al1.add("Rajat"); 
		         Iterator<String> itr1 = al1.iterator();
		         while(itr1.hasNext()){ 
		             System.out.println(itr1.next());
		         }
		         
		         
		         PriorityQueue<String> queue=new PriorityQueue<String>(); 
		         // creating priority queue 
		         queue.add("Amit"); 
		         // adding elements 
		         queue.add("Rachit");
		         queue.add("Rahul"); 
		         System.out.println("head:"+queue.element()); 
		         System.out.println("head:"+queue.peek()); 
		         System.out.println("iterating the queue elements:"); 
		         Iterator itr2=queue.iterator(); 
		         while(itr2.hasNext()){ 
		             System.out.println(itr2.next()); 
		         } 
		         queue.remove(); 
		         queue.poll(); 
		         System.out.println("after removing two elements:"); 
		         Iterator<String> itr3=queue.iterator(); 
		         while(itr3.hasNext()){
		             System.out.println(itr3.next());
		         }
		         
		         
		         //HashSet
		         //HashSet set=new HashSet(); set.add("Ravi");
		         
		         //HashSet&amp;amp;lt;String&amp;amp;gt;
		         HashSet al3=new HashSet(); // creating hashSet
		         al3.add("Rachit");                 // adding elements
		         al3.add("Amit");
		         al3.add("jack");
		         //Iterator&amp;amp;lt;String&amp;amp;gt;
		         Iterator itr4=al3.iterator();
		         while(itr4.hasNext()){
		         System.out.println(itr4.next());
		         }
		         
		      
		         
		         //Linked HashSet
		         //LinkedHashSet&amp;amp;lt;String&amp;amp;gt; 
		         LinkedHashSet al5=new LinkedHashSet(); // creating linkedhashset
		         al5.add("Mariana");                            // adding elements 
		         al5.add("Rick");
		         al5.add("Sam");
		         //Iterator&amp;amp;lt;String&amp;amp;gt; 
		         Iterator itr5=al5.iterator();
		         while(itr5.hasNext()){
		         System.out.println(itr5.next());
		         }
		         
		         
		         //TeeSet
		        // TreeSet&amp;amp;lt;String&amp;amp;gt;
		         TreeSet al6=new TreeSet();
		        		 //TreeSet&amp;amp;lt;String&amp;amp;gt;();  // creating treeSet
		         al6.add("John");                            // adding elements
		         al6.add("Sam");
		         al6.add("Rick");
		         //Iterator&amp;amp;lt;String&amp;amp;gt;
		         Iterator itr6=al6.iterator();
		         while(itr6.hasNext()){
		         System.out.println(itr6.next());
		         }

		 
	}

}
