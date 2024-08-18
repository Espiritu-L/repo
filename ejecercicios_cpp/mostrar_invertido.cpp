#include <iostream>
#include <stack>
using namespace  std;
int main (){
    
    stack<int> m;
    int n, tam; cin >> tam;
    // almacenar en la pila
    for(int i=0; i < tam; i++){
        cin >> n;
        m.push(n);
    }

    cout << "\n Imprimiendo \n";
   while (!m.empty())
   {
    cout << m.top() << "  ";
    m.pop();
   }
   
    return 0;
}
