#include <bits/stdc++.h>

using namespace std;

class Ponto2D {

private:
    int x;
    int y;

public:
    Ponto2D(){
        setCoordinate(0,0);
    }
    Ponto2D(int x, int y){
        setCoordinate(x,y);
    }
    void setCoordinate(int x, int y){
        this -> setX(x);
        this -> setY(y);
    }
    int getX(){
        return this->x;
    }
    int getY(){
        return this->y;
    }
    void setX(int x){
        this->x = x;
    }
    void setY(int y){
        this->y = y;
    }
    void show(){
        cout << "(" << this->getX() << "," << this->getY() << ")" << endl;
    }
    Ponto2D * soma(Ponto2D b){
        Ponto2D * tmp = new Ponto2D();
        tmp->setX(this->getX()+b.getX());
        tmp->setY(this->getY()+b.getY());
        return tmp;
    }

    Ponto2D * operator+(Ponto2D b){
        return this->soma(b);
    }
};
