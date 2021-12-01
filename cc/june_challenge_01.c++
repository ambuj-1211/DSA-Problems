#include <iostream>
using namespace std;

int main() {
	int t,xa,xb,Xa,Xb,na,nb;
	cin>>t;
	
	while(t)
	{
	    cin>>xa>>xb>>Xa>>Xb;
	    na=Xa/xa;
	    nb=Xb/xb;
	    cout<<na+nb<<"\n";
	    t--;
	}
	
	return 0;
}
