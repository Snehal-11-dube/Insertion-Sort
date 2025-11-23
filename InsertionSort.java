package dsa;

import java.util.Scanner;
public class InsertionSort
{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements to sort: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter Elements to sort: ");
        for(int i=0; i<n; i++)
        {
            A[i] = sc.nextInt();
        }
        for(int i=1; i<n; i++)
        {
            int key = A[i];
            int j = i-1;
            while(j>=0 && A[j]>key)
            {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }

        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(A[i] +" ");
        }
    }
}
