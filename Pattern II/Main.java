#include<iostream>
using namespace std;
int main()
{
  int n,col,num=0;
  cin>>n;
  for (int row = 1; row <= n; row++) { 
              
            // when row number is odd,then print in increasing order.
            if (row % 2 != 0) { 
              
                // printing in ascending order
                for (col = num + 1; col < num + row; col++) 
                    cout<<col<<"*"; 
                cout<<col++<<endl; 
  
                // update value of 'num' 
                num = col; 
            } 
  
         // when row number is odd,then print in decending order.
            else { 
                 
                // update value of 'num' 
                num = num + row - 1; 
  
                // print numbers with the '*' in 
                // decreasing order 
                for (col = num; col > num - row + 1; col--) 
                    cout<<col<<"*"; 
                cout<<col<<endl; 
            } 
        } 
  return 0;
}