package datastructur.com;
import java.util.LinkedList;
public class UC2 {

		
		public static void main(String args[]) {
			

			LinkedList<Integer>number = new LinkedList<Integer>();
			//PUsh method call
			number.push(70);
			number.push(30);
			number.push(56);
			System.out.println(number);
		    
		    System.out.println(number.peek());
		   //pop method call 
	       number.pop();
	       System.out.println(number);
	       
	       number.pop();
	       number.pop();
	       System.out.println(number);
		   
		    }
		}

