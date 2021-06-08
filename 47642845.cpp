#include <iostream>
using namespace std;

int main() {
    long long t,p,q,sum,D,d;
    cin>>t;
    while(t)
    {
    cin>>D>>d>>p>>q;
    if(D%d==0)
    {
       sum=p*(D/d)*d+q*(D/d)*d*((D/d)-1)/2;
       cout<<sum<<"\n";
    }
    else if(D%d!=0)
    {
        sum=p*(d*(D/d)+D%d)+q*((D/d)*d*((D/d)-1)/2+(D/d)*(D%d));
        cout<<sum<<"\n";
    }
    t--;
    }
	return 0;
}
