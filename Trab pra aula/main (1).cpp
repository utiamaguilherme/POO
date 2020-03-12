#include "Matriz3x3.cpp"

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	Matriz3x3 *a = new Matriz3x3();
	int vet[] = {1,2,3,4,5,6,7,8,9};
	Matriz3x3 *b = new Matriz3x3(vet);
	Matriz3x3 *c = new Matriz3x3();
    c = a->soma(b);
    c->setMat(1,2,100);
    c->multiplicacao(3);
    c->troca();
    c = a->MultiplicaoMatrizes(b);
    c->show();
}
