#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string line,temp;
  int found=0,i=0;
  getline(cin,line);
  found = line.find("the",found);
  i=found;
  while(i!=-1)
  {
    temp.assign(line,0,found);
    temp.append(line,found+4,line.length());
    line.assign(temp);
    found+=1;
    found = line.find("the",found);
    i=found;
  }
  cout<<line<<endl;
  return 0;
}