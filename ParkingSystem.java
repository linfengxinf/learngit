package git;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ParkingSystem implements IParking{
	int big,medium,small;
	public ParkingSystem(int big, int medium, int small) {
		// TODO Auto-generated constructor stub
		this.big=big;
		this.medium=medium;
		this.small=small;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("[null,");
	}

	@Override
	public boolean addCar(int carType) {
		// TODO Auto-generated method stub
		boolean sign=false;
		if(carType==1)
		{
			if(big>0)
			{
				big=big-1;
				sign=true;
			}
		}
		if(carType==2)
		{
			
			if(medium>0)
			{
				medium--;
				sign=true;
			}
				
		}
		if(carType==3)
		{
			
			if(small>0)
			{
				small--;
				sign=true;
			}
		}
		return sign;
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		Scanner a=new Scanner(System.in);
		String x=a.next();
		String y=a.next();
		StringTokenizer sy=new StringTokenizer(y,"[,]");
		while(sy.hasMoreTokens())
 		{
 			String b=sy.nextToken();
 			int num=Integer.parseInt(b);
 			arraylist.add(num);
 		}
		IParams iParams=IParking.parse();
		ParkingSystem ps=new ParkingSystem(arraylist.get(0),arraylist.get(1),arraylist.get(2));
		ps.print();
		for(int i=3;i<arraylist.size();i++)
		{
			if(i==arraylist.size()-1)
			{
				System.out.println(ps.addCar(arraylist.get(i))+"]");
				break;
			}
			System.out.print(ps.addCar(arraylist.get(i))+",");
		}
	}
}
