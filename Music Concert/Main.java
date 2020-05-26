#include<iostream>
#include <cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,*p,male=0,female=0;
  cin>>n;
  p = (int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
    if(*(p+i)%2==1)
      male++;
    else
      female++;
  }
  cout<<male<<"\n"<<female;
  free(p);
  p = NULL;
  return 0;
}