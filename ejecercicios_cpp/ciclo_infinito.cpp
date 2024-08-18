#include <iostream>
using namespace std;
int main(){
    int n, i = 1; cin >> n;

    for(;;){
        if(i >= n){
            break;
        }
        int j =1;
        for(;;){
            if(j >= n){
                break;
            }
            cout <<"  "<<(i*j);  j++;
        }
        i++;
    }

}
