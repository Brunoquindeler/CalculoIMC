
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(1.70, 72);
		Paciente p2 = new Paciente(1.90, 115);
		Paciente p3 = new Paciente(1.30, 65);
		
		System.out.println("IMC: "+String.format("%.2f",p1.calcularIMC()));
		System.out.println(p1.diagnostico());
		
		System.out.println("IMC: "+String.format("%.2f",p2.calcularIMC()));
		System.out.println(p2.diagnostico());
		
		System.out.println("IMC: "+String.format("%.2f",p3.calcularIMC()));
		System.out.println(p3.diagnostico());
	}

}