public class Bubble{
static void bubble(int[] a)
{
	int n=a.length;
	int temp=0;
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<(n-i);j++)
		{
			if(a[j-1]>a[j])
			{
			temp=a[j-1];
			a[j-1]=a[j];
			a[j]=temp;;
			}
		}
	}
}
public static void main(String[] args)
{
	int a[]={12,13,34,45,67,89,78,97,89,24};
	System.out.println("Before sorting array was :");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i] + " ");
	}
	System.out.println();
	bubble(a);
	System.out.println("Array after Sorting is:");
	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i] + " ");
	}
}
} 