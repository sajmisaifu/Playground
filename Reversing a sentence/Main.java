#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 
int main()
{
    char str[100],rvrs[100];
    int l,i,idx,wordStart,wordEnd;
    gets(str);
    l=strlen(str);
    idx =0;
    wordStart= l-1;
    wordEnd= l-1;
    while(wordStart > 0)
    {
     if(str[wordStart] == ' ')
      {
        i = wordStart + 1;
        while(i <= wordEnd)
         {
           rvrs[idx] = str[i];
           i++;
           idx++;
         }
            rvrs[idx++] = ' ';
            wordEnd = wordStart - 1;
        }
          wordStart--;
    }
    for(i=0; i<=wordEnd; i++)
    {
      rvrs[idx] = str[i];
      idx++;
    }
    rvrs[idx] = '\0'; 
    printf("%s",rvrs);
    return 0;
}