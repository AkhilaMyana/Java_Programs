package java_oops;

import java.util.Scanner;
public class LinearSearch1 {
    public static void main(String[] args)
    {
    	System.out.println("Enter size of Array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");//40
        int searchValue = sc.nextInt();
        int result = (int) linearing(arr,searchValue);
        if(result==-1)
        {
            System.out.println("Element not in the array");
        } 
        else 
        {
            System.out.println("Element found at "+result+" and the search key is "+arr[result]);
        }
    }
    public static int linearing(int arr[], int x)
    {
        int arrlength = arr.length;
        for (int i = 0; i < arrlength ; i++)
        {
            if (arr[i] == x) 
            {
                return i;
            }
        }
        return -1;
    }
}
