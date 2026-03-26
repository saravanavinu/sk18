import java.util.Scanner;
class linearRecu1
{
	Scanner sc=new Scanner(System.in);
	public static void main()
	{
		linearRecu1 l1=new linearRecu1();
		l1.search();
	}
	void search()
	{
		System.out.print("Enter the size of an array :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" element :");
			ar[i]=sc.nextInt();
		}
		System.out.print("Enter the target in an array :");
		int target=sc.nextInt();
		int index=0;
		int c=linear(ar,index,target);
		System.out.println("The index value for "+target+" is "+c);
	}
	int linear(int arr[],int index,int target)
	{
		if(index>=arr.length)
		{
			return -1;
		}
		if(arr[index]==target)
		{
			return index;
		}
		return linear(arr,index+1,target);
	}
}