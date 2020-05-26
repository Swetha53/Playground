#include<iostream>
using namespace std;
int sum(int n)
{
  if(n<=9)
    return n;
   int psum = 0;
        while(n>0){
            psum += n%10;
            n = n/10;
        }
  return sum(psum);
}
int main()
{
  int n;
  cin>>n;
  cout<<sum(n);
  return 0;
}