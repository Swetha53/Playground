#include<iostream>
#include<math.h>
using namespace std;
int bacteria(int m,int n,int req)
{
  if(pow(m,n)>=req)
    return 1;
  else
    return 0;
}
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  if(bacteria(m,n,req)==1)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}