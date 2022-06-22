#include<iostream>
#include<string>

using namespace std;

int main(){
    int n;
    cin>>n;
    int ans = 0;
    while(n--){
        string op;
        cin>>op;
        if (op[1] == '+')
            ans++;
        else
            ans--;
    }
    cout<<ans<<endl;
    
    return 0;
}


