package exercicio34_vcRiquinho;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //adicionando Clientes e suas contas
        List<Cliente> tatalClientes = new ArrayList<>();
        List<Conta> contasA = new ArrayList<>();
        ContaCorrente cc = new ContaCorrente(1000.0);
        contasA.add(cc);
        Cliente clienteA = new PessoaFisica("Joaquim", "joaquim@vc.com", "123.456.789-00" ,contasA);

        List<Conta> contasB = new ArrayList<>();
        ContaCdi cc2 = new ContaCdi(2000.0, 0.01);
        contasB.add(cc2);
        Cliente clienteB = new PessoaJuridica("Maria", "maria@vc.com", "123.456.789-00", contasB);

        List<Conta> contasC = new ArrayList<>();
        ContaInvestimento cc3 = new ContaInvestimento(3000.0, 0.01);
        contasC.add(cc3);
        ContaCdi cc4 = new ContaCdi(4000.0, 0.01);
        contasC.add(cc4);
        Cliente clienteC = new PessoaFisica("Joana", "joana@vc.com", "222.456.789-00", contasC);

        tatalClientes.add(clienteA);
        tatalClientes.add(clienteB);
        tatalClientes.add(clienteC);

        clienteB.adicionarConta(new ContaCorrente(5000.0));

        
        System.out.println("Total de clientes: " + tatalClientes.size() + "\n");
         for (Cliente cliente : tatalClientes) {
            System.out.println("Cliente: " + cliente.getNome());
            for (Conta conta : cliente.getContas()) { 
                System.out.println("  - " + conta);
            }
            System.out.println(); 
        }

        
    }
}
