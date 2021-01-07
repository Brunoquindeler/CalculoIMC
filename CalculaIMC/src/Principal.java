class Principal {
    public static void main(String[] args) {
        
        // Instâncias
        Paciente p1 = new Paciente(1.70, 72, "José");
        Paciente p2 = new Paciente(1.90, 115, "Joãozinho");
        Paciente p3 = new Paciente(1.30, 65, "Maria");
        
        // Print do resultado P1
        System.out.println("Nome: "+p1.nome);
        System.out.println("IMC: "+String.format("%.2f",p1.calcularIMC()));
        System.out.println(p1.diagnostico()+"\n");
        
        // Print do resultado P2
        System.out.println("Nome: "+p2.nome);
        System.out.println("IMC: "+String.format("%.2f",p2.calcularIMC()));
        System.out.println(p2.diagnostico()+"\n");
        
        // Print do resultado P3
        System.out.println("Nome: "+p3.nome);
        System.out.println("IMC: "+String.format("%.2f",p3.calcularIMC()));
        System.out.println(p3.diagnostico()+"\n");
    }
}
