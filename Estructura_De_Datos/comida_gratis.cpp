#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<pair<int, int>> ev;

    int n; cin >> n;

    for(int i=0; i < n; i++){
        int n1, n2;
        cin >> n1 >> n2;

        ev.push_back(make_pair(n1, n2));

    }

    vector<bool> dias(365, false);

 /*   for(int i=1; i <= 365; i++){
        for()
    }
*/


}