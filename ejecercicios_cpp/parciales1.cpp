#include <iostream>
#include <vector>
using namespace std;
void leer(vector<int>&v, int n){
    cout << "\n INGRESAR LOS ELEMENTOS\n";
    int a;
    for(auto i = 0u; i < n; i++){
        cout << "  Elemento "<< (1+i) << ": ";
        cin >> a;
        v.push_back(a); 
    }
}

void mostrar(const vector<int>&v){
    cout << "\n ELEMENTOS DEL VECTOR\n ";
    for(auto i=0u; i<v.size();i++){
        cout << " " << v[i];
    } cout << endl;
}
int main(){
    vector<int> v,v1,v2, v3;
    int n;
    cin >> n;
    leer(v,n);
    mostrar(v);
    return 0;
}