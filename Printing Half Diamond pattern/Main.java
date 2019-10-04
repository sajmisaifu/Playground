#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
      for(int space=1;space<=n-i;space++)
      {
        printf(" ");
      }
      for(int b=1;b<=2*i-1;b++)
      {
        printf("*");
      }
      printf("\n");
    }
	return 0;
}