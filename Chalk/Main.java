#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  float n,root,count=0.00;
  int val=1,days,ans;

cin>>n;

root=(1/sqrt(n));

cout<<setprecision(2);

for(int i=0;i<n;i++)

count=root+count;

days=int(count);

ans=n+days;

cout<<ans+1;

}