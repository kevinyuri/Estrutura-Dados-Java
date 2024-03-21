import java.util.HashMap;

public class ClienteSupermecado {

  private HashMap<String, Cliente> tabelaClientes;

  public ClienteSupermecado() {
    tabelaClientes = new HashMap<>();
  }

  public void adicionarCliente(String cpf, Cliente cliente) {
    tabelaClientes.put(cpf, cliente);
  }

  public Cliente getClientePorCPF(String cpf) {
    return tabelaClientes.get(cpf);
  }
}

class Cliente {
  private String nome;
  private String cpf;

  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public String getCPF() {
    return cpf;
  }
}
