#include <iostream>
#include <stack>
using namespace std;

int main(){
    stack<char> p;
    string s;
    bool aux = true;
    cin >> s;
    for(auto i = 0u; i < s.length(); i++){
        if(s.at(i) == '('){
            p.push(s.at(i));
        }
        else{
            if(p.empty()){
                aux = false;
            }
            else{
                p.pop();
            }
            
        }
    }

    if(p.empty() && aux == true){
        cout << "\n Correcto";
    }else{
        cout << "\n Incorrecto";
    }
    return 0;
}