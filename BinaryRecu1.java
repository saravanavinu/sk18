import java.util.Scanner;
class BinaryRecu1
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		BinaryRecu1 B1=new BinaryRecu1();
		B1.search();
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
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("Array after Sorted");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int left=0;
		int right=ar.length-1;
		System.out.print("Enter the target value of an array :");
		int target=sc.nextInt();
		int a=Binary2(ar,left,right,target);
		System.out.println("The index value for "+target+" is "+a);
	}
	int Binary2(int arr[],int left,int right,int target)
	{
		if(left>right)
		{
			return -1;
		}
		int mid=(left+right)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		if(arr[mid]>target)
		{
			return Binary2(arr,left,mid-1,target);
		}
		
		return Binary2(arr,mid+1,right,target);
	}
}