import java.util.*;
import java.io.*;
class MergeSort
{
public static void merge(int a[],int l,int r,int m)
{
	int st1=l;
	int st2=m;
	int c=0;
	int sup[]=new int[r-l+1];
	while(st1<m && st2<r)
	{
		if(a[st1]<a[st2])
		{sup[c]=a[st1];c++;st1++;}
		else
		sup[c]=a[st2];c++;st2++;	
	}
	for(int i=0;i<c;i++)
	{
		a[i+l]=sup[i];
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
}
public static void sort(int a[],int l,int r)
{
	if(l<r)
    {
	int m=(l+r)/2;
	sort(a,l,m);
	sort(a,m+1,r);
	merge(a,l,r,m);
    }
}
public static void main(String args[])
{
int a[]={2,6,8,4};
sort(a,0,a.length);

}
}