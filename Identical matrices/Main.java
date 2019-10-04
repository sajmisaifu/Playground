#include<stdio.h>
int main()
{
  int r;
  int c;
  int flag=0;
  scanf("%d", &r);
  scanf("%d", &c);
  int matrix1[r][c];
  int matrix2[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&matrix1[i][j]);
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d", &matrix2[i][j]);
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      if(matrix1[i][j]!=matrix2[i][j])
      {
        flag=1;
      break;
    }
    }
  }
    if(flag==0)
    {
      printf("Yes");
    }
  else
    printf("No");
    
  
	return 0;
}