#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,x3,y1,y2,y3;
  float x4,y4;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  x4 = (x1+x2+x3)/3.0;
  y4 = (y1+y2+y3)/3.0;
  std::cout<<x4<<"\n"<<y4;
  return 0;
}