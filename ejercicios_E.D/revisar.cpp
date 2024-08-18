#include <iostream>
#include <stack>
using namespace std;

int main(){
    stack<char> p;
    string c;
    cin >> c;

    bool x = true;
    // ()(
    for(int i=0; i < c.size() && x; i++){
        if(c.at(i) == '('){
            p.push(c.at(i));
        }else{
            if(p.empty()){
                x = false;
                break;
            }else{
                p.pop();
            }
        }
    }

    if(x == true && p.empty()){
        cout << " \n Correcto \n";
    } else {
        cout << " \n No esta correcto\n";
    }

    return 0;
}