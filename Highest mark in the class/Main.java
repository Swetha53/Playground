#include<iostream>
#include<limits.h>
using namespace std;
int main()
{
  // Type your code here
  int n,mark=INT_MIN;
  cin>>n;
  int st[n];
  for(int i=0;i<n;i++)
  {
    cin>>st[i];
    if(mark<st[i])
      mark = st[i];
  }
  cout<<mark;
  return 0;
}