#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      for(j=1;j<n;j++)
        cout<<i;
      cout<<i+1<<endl;
    }
    else
    {
      cout<<i+1;
      for(j=1;j<n;j++)
        cout<<i;
      cout<<endl;
    }
  }
    return 0;
}