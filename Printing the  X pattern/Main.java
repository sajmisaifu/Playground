#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
      for(int a=1;a<=n;a++)
      {
        if((i==a)||(i+a==n+1))
        {
          printf("*");
        }
        else
          printf(" ");
      }
    
  printf("\n");
}
	return 0;
}