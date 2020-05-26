#include<iostream>
using namespace std;
int type(int n,int *p)
{
  int i,odd=0,even=0;
  for(i=0;i<n;i++)
  {
    if(p[i]%2==0)
      even++;
    else if(p[i]%2==1)
      odd++;
    if(odd>0 && even>0)
      break;
  }
  if(odd == n)
    return 2;
  else if(even == n)
    return 1;
  return 3;
}
int main()
{
  //Type your code here.
  int i,n,res;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n"; 
  for(i=0;i<n;i++)
    cin>>a[i];
  res=type(n,a);
  if(res==1)
    cout<<"The array is Even";
  else if(res==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
  return 0;
}