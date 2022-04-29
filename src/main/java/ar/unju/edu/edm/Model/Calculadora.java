package ar.unju.edu.edm.Model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
private double n1;
private double n2;
public Calculadora() {	
}
public Calculadora(double n1, double n2) {
	this.n1=n1;
	this.n2=n2;
}
public double suma() {
	double resultadosuma=this.n1+this.n2;
	return resultadosuma;
}
public double resta() {
	double resultadoresta=this.n1-this.n2;
	return resultadoresta;
}
public double multiplicacion() {
	double resultadomulti=this.n1*this.n2;
	return resultadomulti;
}
public double division() {
	if (n2<=0) {
		return 0;
	}
	else {
		double resultadodiv=this.n1/this.n2;
	return resultadodiv;
	}
}
	public double potencia() {
		double resultadopot=Math.pow((double)this.n1,(double) this.n2);
		return resultadopot;
	}
	public double raiz() {
		double resultadoraiz=Math.sqrt((double)this.n1);
		return resultadoraiz;
	}
	public double getNum1() {
		return n1;
	}

	public void setNum1(double n1) {
		this.n1 = n1;
	}
	public void setNum2(double n2) {
		this.n2=n2;
	}

	public double getNum2() {
		return n2;
	}

}

