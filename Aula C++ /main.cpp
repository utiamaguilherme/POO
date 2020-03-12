#include "easyfunc.hpp"

int main(void){
    Ponto2D *pa = new Ponto2D();
    Ponto2D *pb = new Ponto2D(5,9);
    pa->setCoordinate(3,4);

    cout << "pa => "; pa->show(); cout << endl;
    cout << "pb => "; pb->show(); cout << endl;
    // Ponto2D * res = new Ponto2D((pa->getX() + pb->getX()), (pa->getY()+pb->getY()));
    // Ponto2D * res = *pa+*pb;
    cout << "pa+pb => "; (*(*pa+*pb)).show(); cout << endl;
    return 0;
}
