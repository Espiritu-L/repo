#include <iostream>
#include <climits>
#include <algorithm>

using namespace std;

class conjunto{
  private:
    // atributos
    int tam;
    int v[1000];
    
  public:
    // metodos
    // funcion constructora
    conjunto(){
      this->tam = 0;      
    }
    // buscar para ingresar los 
    int buscar(int d){
        // si existe el d en el v[] retorna d
        // si no existe d retorna -1
      int i = 0;
      int f = this->tam-1;
      int mid=0;
      while(i<=f){
        mid = (i+f)/2;
        if(this->v[mid]==d){
          return mid;
        }
        else if (this->v[mid]<d){
          i = mid + 1;
        }
        else{
          f = mid - 1;
        }
      }
      return -1;
    }

    bool esVacio(){    
      int cero=0;
      return this->tam==cero;
    }

    int tamaño(){
      return this->tam;
    }

    int obtener(int pos){
      return this->v[pos];
    }

    void insertar(int d){
      int p = this->buscar(d);
      if(p==-1){
        this->v[tam] = d;
        this->tam = this->tam + 1;
        sort(this->v, this->v+tam);
      }
    }  

    void eliminar(int d){
      int p = this->buscar(d); 
      if(p!=-1){
        this->v[p] = INT_MAX;
        sort(this->v, this->v+tam);
        this->tam --;
      }
    }

    void mostrar(){
      for(int i=0;i<this->tam;i++){
        cout<<this->v[i]<<" ";
      }
      cout<<endl;
    }

    conjunto union(conjunto B){
      conjunto C;
      /*
      1. Copiar todo el conjunto A al conjunto C
      2. Obtener un dato de B y buscar en C
         Si no existe insertar en C         
      */
      
      C=A;
      
      return C;
    }

    conjunto intereseccion(conjunto B){
      conjunto C;
      return C;
    }

    conjunto diferencia(conjunto B){
      conjunto C;
      return C;
    }
};

int main(){

  conjunto c;
  cout<<c.esVacio()<<endl;
  cout<<c.tamaño()<<endl;
  c.insertar(4);

  cout<<c.esVacio()<<endl;
  cout<<c.tamaño()<<endl;
  
  c.mostrar();
  c.insertar(10);
  c.mostrar();
  c.insertar(2);
  c.mostrar();
  c.insertar(1);
  c.mostrar();
  c.insertar(3);
  c.mostrar();
  c.eliminar(2);
  c.mostrar();
  c.eliminar(4);
  c.mostrar();
  c.insertar(7);
  c.mostrar();
  return 0;
}