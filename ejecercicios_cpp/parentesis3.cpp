#include <iostream>
#include <stack>
using namespace std;

int main(){

    stack<char> p;
    string s; cin >> s;
    bool x = true;
    for(auto i = 0u; i < s.length() && x; i++){
        if(s.at(i) == '('){

            p.push(s.at(i));

        } else {
            if(!p.empty() && (s.at(i) == ')')){
                p.pop();
            }

            else{
                x = false; break;
            }

        }
    }

    if(p.empty() && x == true){
        cout << "\n CORRECTO\n ";
    } else{
        cout << "\n INCORRECTO \n";
    }
    

}