public class Paciente {
	
	// Atributos
	double altura;
	double peso;
	String nome;
	
	// Construtor
	public Paciente(double a, double p, String n) {
		this.altura = a;
		this.peso = p;
		this.nome = n;
	}
	
	// Função para calcular e retornar o IMC
	public double calcularIMC() { 
		return this.peso / (this.altura * this.altura);
	}
	
	// Função para retornar o diagnóstico do paciente.
	public String diagnostico() {
		if(this.calcularIMC() < 16) 
			return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		else if(this.calcularIMC() < 17)
			return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		else if(this.calcularIMC() < 18.50)
			return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		else if(this.calcularIMC() < 25)
			return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		else if(this.calcularIMC() < 30)
			return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		else if(this.calcularIMC() < 35)
			return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		else if(this.calcularIMC() < 40)
			return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		else
			return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
	}
}
