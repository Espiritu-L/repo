#include <iostream>
using namespace std;
bool isPrime(int n){
    int cont=0;
    for(int i = 1;i<=n; i++){
        cont+=(n%i==0);
    }
    return ((cont == 2)?true:false);
}
int main(){
    int t; cin >> t;
    while (t--)
    {
        int n; cin>>n;
        bool band = false;
        for(int i = 2; i<=n && !band; i++){
            for(int j = 2; j<=n; j++){
                if(isPrime(i) && isPrime(j)){
                    if(i+j==n){
                        cout<<i<<" "<<j<<endl;
                        band=true;
                    }
                }
            }
        }
    }
    
    
} 

