// Programa en C++ para verificar si los corchetes están balanceados.

#include <bits/stdc++.h>

using namespace std;

// Función para verificar si los corchetes están balanceados
bool CBalanceados(string expr)
{

    // Declarar una pila para contener los corchetes anteriores.

    stack<char> temp;

    for (int i = 0; i < expr.length(); i++) {

        if (temp.empty()) { // caso verdadero esta vacio 

            // Si la pila está vacía

            // simplemente inserta el corchete actual

            temp.push(expr[i]); //valido los dos casos para almacenar
            //temp.push(expr.at(i));

        }

        else if ((temp.top() == '(' && expr[i] == ')')

                 || (temp.top() == '{' && expr[i] == '}')

                 || (temp.top() == '[' && expr[i] == ']')) {

            temp.pop();

        }

        else {

            temp.push(expr[i]);

        }

    }

    if (temp.empty()) {
         

        // Si la pila está vacía, devuelve true

        return true;

    }

    return false;
}
 
// Código principal

int main()
{
    string expr = "{()}[]";
 
    // Llamada a la función

    if (CBalanceados(expr)) // caso true

        cout << "\n Balanceados\n\n"; 

    else                // caso false

        cout << "\n No Balanceados\n\n";

    return 0;
}
