#include <stdio.h>
int main()
{
  int n,c=0;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(c==0)
      {
      printf("*");
        c=1;
      }
      else
      {
        printf("#");
        c=0;
      }
    }
    printf("\n");
  }
  	return 0;
}