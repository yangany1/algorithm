package hdu.edu.acm;

import java.util.Scanner;

public class Problem1048 {

	/**
	 * author : luoyang
	 * 2013-4-12
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String s=null;
		String text;
		
		while(!(s=input.next()).equals("ENDOFINPUT"))
		{
			//s=input.next();
			if(s.equals("START"))
			{
				input.nextLine();
				text=input.nextLine();
				
				for(char c:text.toCharArray())
				{
					if(c>='A'&&c<='Z')
					{
						int code=c-5;
						if(code<'A')
						{
							code=c+26-5;
						}
						System.out.print((char)(code));
					}
					else
					  System.out.print(c);
				}
					
				input.nextLine();
				
				System.out.println();
				
			}
		}

	}

}
