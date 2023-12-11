package br.com.mfer;

public class Programa {

    public static void main (String args[]){

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Matheus Ferreira");
        pessoaFisica.setCpf(218434834L);
        imprimir(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Microsoft");
        pessoaJuridica.setCnpj(547839184824342L);
        imprimir(pessoaJuridica);

    }

    private static void imprimir(Pessoa pessoa) {

        if (pessoa instanceof PessoaFisica) {
            PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
            System.out.println("Nome: " + pessoaFisica.getNome() +
                    "\nCPF: " + pessoaFisica.getCpf());
        } else {
            PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
            System.out.println("\nNome: " + pessoaJuridica.getNome() +
                    "\nCNPJ: " + pessoaJuridica.getCnpj());
        }

    }


}
