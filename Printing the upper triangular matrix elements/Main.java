
#include<stdio.h>
void upper_matrix(int r, int c, int matrix[r][c]);
int main()
{
    int r;
    int c;
    scanf("%d", &r);
    scanf("%d", &c);
    int matrix[r][c];
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
           scanf("%d", &matrix[i][j]);
        }
    }
    upper_matrix(r, c, matrix);
}
    void upper_matrix(int r, int c, int matrix[r][c])
    {
        for(int k = 0; k < c; k++)
        {
              for(int i = 0, j = k; j < c ; i++, j++)
            printf("%d ", matrix[i][j]);
        }
    }




