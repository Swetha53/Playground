#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,fact = 1;
  cin>>n;
  while(n!=0)
  {
   fact = fact*n;
    n--;
  }
  cout<<fact;
  return 0;
}