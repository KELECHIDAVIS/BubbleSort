
public class BSMain
{
	public static boolean end = false; 
	public static int a,b;
	public static int dummy;
	public static int[] firstArr = new int[] {2, 1, 4, 17, 7, 9, 4, 3, 5, 6 ,10, 4};
	public static void main(String[] args)
	{
		for(int i =0; i<firstArr.length; i++)
		{
			System.out.print(firstArr[i]+" ");
		}
		System.out.println();
		sorter(firstArr);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		for(int i =0; i<firstArr.length; i++)
		{
			System.out.print(firstArr[i]+" ");
		}
	}
	public static void sorter(int[] arr)
	{
		for(int i=0; i<arr.length;i++) 
		{
			a=i;
			b=i+1;
			if(a==arr.length||b==arr.length)
			{
				i = 0; a=i; b=i+1;
				if(arr[a]>arr[b])
				{
					swap(firstArr, a, b);
					i=0; 
				}else
				{
					break;
				}
			}
			if(arr[b]<arr[a]) 
			{
				swap(firstArr, a, b);
				i=0; 
			}
		}	
	}
	public static void swap(int[] arr, int a, int b)
	{
		dummy = arr[a];
		arr[a] = arr[b];
		arr[b]=dummy;
	}
}