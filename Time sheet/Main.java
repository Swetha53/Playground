#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int day[7];
  int i,sal = 0,sum=0;
  for(i=0;i<=6;i++)
    cin>>day[i];
  i=0;
  switch(i)
  {
    case 0: sal+=(100*day[0])+(day[0]*50);
      sum+=day[0];
      if(day[0]>8)
      {
        sal+=(day[0]-8)*15;
      }
    case 1: sal+=100*day[1];
      sum+=day[1];
       if(day[1]>8)
      {
        sal+=(day[1]-8)*15;
      }
    case 2: sal+=100*day[2];
      sum+=day[2];
       if(day[2]>8)
      {
        sal+=(day[2]-8)*15;
      }
    case 3: sal+=100*day[3];
      sum+=day[3];
       if(day[3]>8)
      {
        sal+=(day[3]-8)*15;
      }
    case 4: sal+=100*day[4];
      sum+=day[4];
       if(day[4]>8)
      {
        sal+=(day[4]-8)*15;
      }
    case 5: sal+=100*day[5];
      sum+=day[5];
       if(day[5]>8)
      {
        sal+=(day[5]-8)*15;
      }
    case 6: sal+=(100*day[6])+(day[6]*25);
      sum+=day[6];
       if(day[6]>8)
      {
        sal+=(day[6]-8)*15;
      }
    default: if(sum>40 && day[0]==0 &&day[6]==0)
    {
      sal+=(sum-40)*25;
    }
  }
  cout<<sal;
  return 0;
}