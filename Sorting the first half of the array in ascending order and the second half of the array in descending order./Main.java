#include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d", &a[i]);
  }
  int end=n/2,temp;
  for(int i=0;i<end;i++)
  {
  for(int j=i+1;j<end;j++)
  {
    if(a[i]>a[j])
    {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
  }
}
   for(int i=n-1;i>=end;i--)
  {
    for(int j=i-1;j>=end;j--)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
   }
   for(int i=0;i<n;i++)
   {
     printf("%d ", a[i]);
   }
	return 0;
}