package hdu.edu.acm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem1022 {

	/**
	 * author : luoyang
	 * 2013-3-22
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		String s1,s2;
		Stack<Character> stack=new Stack<Character>();
		
		Scanner input=new Scanner(System.in);
		while (input.hasNext())
		{
			n=input.nextInt();
			ArrayList<String> output=new ArrayList<String>();
			
			s1=input.next();
			s2=input.next();
			int i=0;
			int j=0;
			while(i<s1.length())
			{
				if(!stack.empty()&&s2.charAt(j)==stack.peek())
				{
					stack.pop();
					output.add("out");
					j++;
				}
				else if(s1.charAt(i)==s2.charAt(j))
				{
					output.add("in");
					output.add("out");
					i++;
					j++;
				}
			
				else
				{
					stack.push(s1.charAt(i));
					output.add("in");
					i++;
				}
				
			}
			
			while(!stack.empty()&&s2.charAt(j)==stack.peek()&&j<s2.length())
			{
				stack.pop();
				output.add("out");
				j++;
				
			}
			
			if(j<s2.length()||!stack.empty())
			{
				System.out.println("No.");
				System.out.println("FINISH");
			}
			else
			{
				System.out.println("Yes.");
				for(String s:output)
				{
					System.out.println(s);
				}
				System.out.println("FINISH");
			}
			stack.clear();
		}
	}

}
