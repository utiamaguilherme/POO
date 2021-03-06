#include <iostream>

using namespace std;

class Matriz3x3 {

private:
	int mat[3][3];

public:
	Matriz3x3(int vet[]){
		int k=0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				setMat(j,i,vet[k]);
				k++;
			}
		}
	}

	Matriz3x3(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i == j)	setMat(i,j,1);
				else		setMat(i,j,0);
			}
		}
	}

	void setMat(int i, int j, int value){
		this->mat[i][j] = value;
	}

	int at(int i, int j){
		return this->mat[i][j];
	}

	void show(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				cout << this->mat[i][j] << " ";
			}
			cout << endl;
		}
	}

	Matriz3x3* soma(Matriz3x3 *b){
        Matriz3x3 *aux = new Matriz3x3();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                aux -> setMat(i,j,this->getMat(i,j)+b->getMat(i,j));
            }
        }
        return aux;
	}

	Matriz3x3 * subtracao(Matriz3x3 *b){
        Matriz3x3 *aux = new Matriz3x3();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                aux -> setMat(i,j, this -> getMat(i,j) - b -> getMat(i,j));
            }
        }
        return aux;
	}

	void multiplicacao(int value){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                this -> setMat(i,j,this->getMat(i,j)*value);
            }
        }
	}

	void troca(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                this -> setMat(i,j,getMat(i,j) * (-1));
            }
        }

    }
    Matriz3x3 *MultiplicaoMatrizes(Matriz3x3 *b){
        Matriz3x3 *c = new Matriz3x3();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int aux = this -> resultMultiplicacao(this, b, i, j);
                c -> setMat(i,j,aux);
            }
        }
        return c;
    }
	int resultMultiplicacao(Matriz3x3 *a, Matriz3x3 *b, int i, int j){
		int aux = 0;
		for(int k=0; k<3; k++){
			aux+= (a -> getMat(i,k) * b->getMat(k,j));
		}
		return aux;
	}

	int getMat(int i, int j){
		return this -> mat[i][j];
	}

};
