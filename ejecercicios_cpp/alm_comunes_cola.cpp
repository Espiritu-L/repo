#include <iostream>
#include <queue>
#include <vector>
using namespace std;

void mostrar(vector<string> v){
	cout << "\n";
	for(auto i = 0u; i < v.size(); i++){
		cout << v[i] << "  ";
	} cout << "\n";
	
}
// buscador auxiliar
bool existe(vector<string> v, string s){
	bool e = false;
	
	for(auto i = 0u; i < v.size(); i++){
		if(s == v[i]){
			e = true; break;
		}
	}
	return e;
}

	
/*creando una funcion para alamacenar elementos no reapetidos*/
queue<string> ejercicio(vector<string> v, vector<string> v1){
	queue<string> r;
	vector<string> menor, mayor;
	if(v.size() < v1.size()){
		
		menor = v;  mayor = v1;
		
	} else{
		
		menor = v1;  mayor =  v;
		
	}
	
	for(auto i = 0u; i < menor.size(); i++){
		if(existe(menor, menor[i]) && existe(mayor, v[i])){
			r.push(menor[i]);
		}
	}
	
	return r;

}
int main(){
	queue<string> c;
	vector<string> v, v1;
	int n, m; cin >> n >> m;
	
	for(int i = 0; i < n; i++){
		string a; cin >> a;
		v.push_back(a);
	}

	for(int i = 0; i < m; i++){
		string a; cin >> a;
		v1.push_back(a);
	}
	mostrar(v);
	mostrar(v1);
	
	c = ejercicio(v,v1); 
	cout << "\n ";
	while(!c.empty()){
		cout << c.front() << " ";
		c.pop();
	}

}
