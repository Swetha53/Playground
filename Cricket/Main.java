#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int total_balls,total_run,run,ball;
  float total_over,over,run_rate,total_run_rate;
  cin>>total_balls>>total_run>>run>>ball;
  total_over = (total_balls%6)/10;
  total_over += int(total_balls/6);
  over = (ball%6);
  over /=10;
  over += int(ball/6);
  run_rate = run/over;
  total_run_rate = total_run/total_over;
  cout<<total_over<<"\n";
  cout<<fixed<<setprecision(1)
    <<over<<"\n"
    <<run_rate<<"\n"
    <<total_run_rate<<"\n";
  if(run_rate>=total_run_rate)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  return 0;
  
}