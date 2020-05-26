#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,x,pos;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  if(pos>n)
  {
    cout<<"Invalid Input";
    return 0;
  }
  cout<<"Enter the value to insert\n";
  cin>>x;
  if(pos==n)
  {
    a[n]=x;
    n++;
  }
  else
  {
  for(i=n-1;i>=pos-1;i--)
  {
    a[i+1]=a[i];
  }
  a[i+1]=x;
  n++;
  }
  cout<<"Array after insertion is\n";
  for(i=0;i<n;i++)
    cout<<a[i]<<endl;
  return 0;
}