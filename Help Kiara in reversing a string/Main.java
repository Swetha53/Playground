#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
//Your code goes here
  std::cin.getline(str,30);
  for(i=0;str[i]!='\0';i++)
    count++;
  for(i=0,end=count-1;end>=0;i++,end--)
    rev[i]=str[end];
std::cout<<rev;
}