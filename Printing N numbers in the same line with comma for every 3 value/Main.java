#include <stdio.h>
int main() {
	int n,c=0,num;
    scanf("%d",&n);
    for(num=1;num<=n;num++)
    {
      printf("%d",num);
      c++;
      if(c%3==0)
        printf(",");
    }
	return 0;
}