package hdu.edu.acm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Problem4505 {

	/**
	 * author : luoyang
	 * 2013-4-3
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num;
		while((n--)!=0)
		{
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			int p=input.nextInt();
			for(int j=1;j<=p;j++)
			{
				int x=input.nextInt();
				if(map.containsKey(x))
				{
					int value=map.get(x);
					map.put(x, value+1);
				}
				else
				{
					map.put(x, 1);
				}
			}
			int maxhigh=Integer.MIN_VALUE;
			Iterator<Integer> it=map.keySet().iterator();
			while(it.hasNext())
			{
				int k=it.next();
				if(maxhigh<k)
					maxhigh=k;
			}
			int cost=maxhigh*10+map.size()*5;
			Collection<Integer> c=map.values();
			it=c.iterator();
			while(it.hasNext())
			{
				cost+=it.next();
			}
			System.out.println(cost);
		}
	}

}
