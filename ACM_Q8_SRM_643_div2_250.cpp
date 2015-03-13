#include <bits/stdc++.h>

#include <vector>

using namespace std;


class TheKingsArmyDiv2
{

public :
    int getNumber(vector <string> state)
    {

        int cont =0;
        int s=state.size();
        for(int i=0;i<s ;i++){


            string x=state[i];
            for(int j=0;j<x.length();j++){

                 if(x[j]=='H')
                   {
                       if(i<s-1)         { string newX=state[i+1];  if(newX[j]=='H')return 0; }
                     if(i<x.length()-1){ string newX=state[i];  if(newX[j+1]=='H')return 0; }
                      
                       cont=1;
                   }

            }
        }
        if(cont==1)return 1;
        return 2;

    }
};
int main()
{
vector    <string> state;
    state. push_back("SSSSSSS");
    state. push_back("SSSSSHS");
    state. push_back("SSSSSSS");
    state. push_back("SSSSSSS");

  TheKingsArmyDiv2 x;
  cout<<x.getNumber (state);
    return 0;
}