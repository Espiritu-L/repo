#include <iostream>
#include <stack>
using namespace std;
int main(){
    stack<int> p;
    int n,m;
    cin >> n;
    while (n--)
    {
        int b;
        cin >> b;
        if(b == 1){
            cin >> m;
            if(p.empty()){
                p.push(m);
            } else if(m > p.top()){
                p.push(m);
            } else{
                p.push(p.top());
            }

        } else if(b == 2){
            cout << "  " << p.top(); 

        }else if(b == 3){
            p.pop();

        }
    }
    

}