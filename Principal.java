package uscs;
public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        
        p1.setNome("Pedro");
        p2.setNome("Cláudia");
        
        p1.setIdade(32);
        p2.setIdade(23);
        
        p1.setSexo("Masculino");
        p2.setSexo("feminino");
        
        p2.setCurso("Ciência da Computação");//não pode colocar p1, pq p1 é só uma pessoa, não é aluno
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
