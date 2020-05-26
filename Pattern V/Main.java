#include<iostream>
using namespace std;
int main()
{
  int n,i,j,left=1,right=0;
  cin>>n;
  right = n*n+1;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<i;j++)
      cout<<"--";
    for(j=1;j<=n-i+1;j++)
    {
      cout<<left<<"*";
      left++;
    }
    for(j=1;j<=n-i;j++)
    {
      cout<<right<<"*";
      right++;
    }
    cout<<right<<endl;
    right = right - (n-i+1)- (n-i)+1;
  }
  return 0;
}