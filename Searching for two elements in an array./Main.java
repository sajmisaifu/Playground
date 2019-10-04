#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int search_el_1;
  scanf("%d",&search_el_1);
  int search_el_2;
  scanf("%d",&search_el_2);
  int element_1_idx=-1;
  int element_2_idx=-1;
  for(int idx=0;idx<=arr_size-1;idx++)
    {
      if(search_el_1==arr[idx])
      {
        element_1_idx=idx;
      }
      if(search_el_2==arr[idx])
       {
         element_2_idx=idx;
       }
     }
     printf("%d\n",element_1_idx);
     printf("%d\n",element_2_idx);
     return 0;
}