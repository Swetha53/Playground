#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,flag = 0;
  float score = 0;
  while(flag!=3)
  {
    cin>>n;
    if(n<0)
    {
      score -=1;
      break;
    }
    else
    {
      if(n%2==0)
        score -= 0.5;
      else
      {
        score +=1;
        flag++;
      }
    }
  }
  cout<<score;
  return 0;
}