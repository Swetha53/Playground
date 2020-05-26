#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum;
	//Type your code here
  int found;
  std::cin>>fnum;
  found = fnum.find(".");
  if(found!=std::string::npos)
  {
    fnum.assign(fnum.begin()+found+1,fnum.end());
    std::cout<<"Floating part is : "<<fnum;
  }
  else
    std::cout<<"Floating part is :";
  return 0;
}