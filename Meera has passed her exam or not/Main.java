#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,reg;
  cin>>n;
  int res[n];
  for(int i=0;i<n;i++)
    cin>>res[i];
  cin>>reg;
  for(int i=0;i<n;i++)
    if(res[i]==reg)
    {
      cout<<"She passed her exam";
      return 0;
    }
  cout<<"She failed";
  return 0;
}