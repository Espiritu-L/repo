/*codigo para convertir una cadena de caracteres a un vector*/
#include<bits/stdc++.h>
using namespace std;

int main(){
    string n;
    getline(cin,n);
    string m;
    getline(cin,m);
    vector<string> v1;
    vector<string> ::iterator it;
    vector<string> v2;
    size_t pos = 0; //para longitudes de una cadena
    while((pos = n.find(' ')) != string::npos){
        v1.push_back(n.substr(0,pos));
        n.erase(0,pos+1);
    }
    v1.push_back(n);
    for(string c : v1){
        cout<<c<<endl;
    }
}