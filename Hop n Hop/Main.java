#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  float result;
  std::cin>>x>>y;
  result = sqrt(pow(x-3,2)+pow(y-4,2));
  std::cout<<int(result);
  return 0;
}