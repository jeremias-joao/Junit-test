package br.com.alura.tdd;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTestes {
	
	@Test
	public void testaSoma() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(4, 6);
		
		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void testaSubrtracao() {
		Calculadora calc = new Calculadora();
		int subtrai = calc.subtrair(9, 3);
		
		Assert.assertEquals(6, subtrai);
	}
	
	@Test
	public void testaDivisao() {
		Calculadora calc = new Calculadora();
		int didive = calc.didivir(10, 2);
		
		Assert.assertEquals(5, didive);
	}
	
	
	@Test
	public void testaMultiplicacao() {
		Calculadora calc = new Calculadora();
		int multiplica = calc.multiplicar(3, 7);
		
		Assert.assertEquals(21, multiplica);
	}
	
}


