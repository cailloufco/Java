package Faculdade.AtividadeTratamentoDeErros.q7;

public class cadastroIdade {
    int idade;

    public cadastroIdade(int idade) {
        if (idade > 120 || idade < 0){
         throw new idadeInvalidaException("A idade deve estar entre 0 e 120 anos.");
        }else {
            System.out.println("idade de " + idade + " anos cadastrada.");
            this.idade = idade;
        }
    }
}
