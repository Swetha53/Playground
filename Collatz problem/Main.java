#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,seq,count=0;
  cin>>n;
  seq = n;
  while(seq!=1)
  {
    cout<<seq<<"\n";
    if(seq%2==0)
      seq = seq/2;
    else
      seq = 3*seq + 1;
    count++;
  }
  cout<<seq<<"\n"<<count;
  return 0;
}