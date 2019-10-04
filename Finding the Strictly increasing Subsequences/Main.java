#include<stdio.h>
int increasing_sub_seq(int n,int arr[],int sum_arr[]);
int main()
{
  int n;
  scanf("%d", &n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d", &arr[i]);
  }
  int sum_arr[3*n];
  increasing_sub_seq(n,arr,sum_arr);
  return 0;
}
int increasing_sub_seq(int n,int arr[],int sum_arr[])
{
  for(int i=0;i<n-1;i++)
  {
    int key=arr[i];
    int flag=1;
    for(int j=i+1;j<=n-1;j++)
    {
      if(arr[j]>key)
      {
        for(int k=i;k<=j;k++)
        {
          if(arr[k]>arr[j])
          flag=0;
        }
        if(flag==1)
        {
          printf("%d,%d\n", key,arr[j]);
        }
        flag=1;
      }
    }
  }
    return 0;
  
}