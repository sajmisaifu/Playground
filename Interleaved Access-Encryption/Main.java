#include<stdio.h>
#include<string.h>
int main()
{
  char sentence_str[100];
  scanf("%s",sentence_str);
  int str_len=strlen(sentence_str);
  int i,j;
  scanf("%d", &i);
  j=(str_len/i);
  if((str_len%i)>0)
  {
   j=j+1;
  }
  int i_idx,j_idx;
  for(i_idx=0;i_idx<i;i_idx++)
  {
    for(j_idx=0;j_idx<j;j_idx++)
    {
      int curr_char_idx=i_idx+(j_idx*i);
      if((j_idx%2)==0)
      {
      }
      else
      {
        int last_col_elem_index_in_curr_row = (i-1) + (j_idx*i);
        curr_char_idx = last_col_elem_index_in_curr_row-i_idx;
      }
      char ch;
      if(curr_char_idx>=str_len)
      {
        ch='X';
      }
      else
      {
        ch=sentence_str[curr_char_idx];
      }
      printf("%c", ch);
    }
  }
 return 0;
}