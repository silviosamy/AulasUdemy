package oo.composicao;

public class Carro {

	Motor motor = new Motor(); //declarando como instância, como cada carro terá um motor.
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6)
			motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5)
			motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
