#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int amta,amts,amtf,disca,discf,discs,shipa,ships,shipf,amazon,flip,snap;
  cin>>amtf>>discf>>shipf;
  flip = (amtf*(100-discf))/100 +shipf;
  cin>>amts>>discs>>ships;
  snap = (amts*(100-discs))/100 +ships;
  cin>>amta>>disca>>shipa;
  amazon = (amta*(100-disca))/100 +shipa;
  cout<<"In Flipkart Rs."<<flip;
  cout<<"\nIn Snapdeal Rs."<<snap;
  cout<<"\nIn Amazon Rs."<<amazon;
  if(amazon<flip && amazon<snap)
    cout<<"\nHe will prefer Amazon";
  else if(flip<=snap)
    cout<<"\nHe will prefer Flipkart";
  else
    cout<<"\nHe will prefer Snapdeal";
}