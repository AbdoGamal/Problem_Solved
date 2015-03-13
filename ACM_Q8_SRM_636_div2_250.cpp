#include <bits/stdc++.h>

using namespace std;

class GameOfStones  {

public : int count(vector <int> stones) {
    int store =0,sum=0;
    double avg=0;
    sort(stones.begin(),stones.end());
    for(int i =0; i<stones.size();i++) sum+=stones[i];
     int cont =0;
    avg=(double)sum/stones.size();

    if(   avg == (double) ceil(avg))
        {
            //cout<<"------------"<<endl;
            for(int i =stones.size()-1; i>=0;i--){
                cont=max(store/2 , cont);
                if(stones[i]>avg)
                {
                    if((int)(stones[i]-avg)%2 == 0)
                       store+=(stones[i]-avg) ;
                    else return -1;
                }else if(stones[i]<avg)
                {
                    if((int)(avg-stones[i])%2 == 0)
                       store-=(avg-stones[i] );
                    else return -1;
                }
            }

    }else
            return -1;

    return cont;
};

};
int main()
{
    GameOfStones o ;
    vector <int > x ;
    x.push_back(2);
    x.push_back(4);
    x.push_back(8);
    cout << o.count(x) << endl;
    return 0;
}