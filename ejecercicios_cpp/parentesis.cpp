#include <iostream>
#include <stack>

using namespace std;

int main(){
	stack<char> p;
	string s;
	bool aux = true;
	cin>>s;
	for(int i=0;i<s.length() && aux ;i++){
		if(s.at(i)=='('){
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
	if(p.empty() && aux==true){
		cout<<"Correcto";
	}
	else{
		cout<<"Incorrecto";
	}
}
