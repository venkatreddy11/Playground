#include<stdio.h>
int pattern(int n)
{
   //Your code goes here
     int row,column;
  for(row=1;row<=n;row++){
    for(column=1;column<=n;column++){
      if(row==1 || row==n || column==1 || column==n)
        printf("1");
      else
        printf(" ");
     }
    printf("\n");
  }
}
void main()
{
    int n;
    scanf("%d",&n);
    pattern(n);
}
