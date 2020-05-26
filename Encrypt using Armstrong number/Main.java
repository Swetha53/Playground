#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int temp = n,sum = 0,count=0;
  while(temp!=0)
  {
    sum++;
    temp = temp/10;
  }
  temp = n;
  while(temp!=0)
  {
    count += power(temp%10,sum);
    temp = temp/10;
  }
  if(count==n)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}