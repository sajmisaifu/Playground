#include <stdio.h>
int main() {
    int n;
    scanf("%d",&n);
    int val=n;
    for(int i=1;i<=n;i++)
    {
      for(int a=val;a>=1;a--)
      {
        printf("%d",a);
      }
      val--;
      printf("\n");
    }
	return 0;
}