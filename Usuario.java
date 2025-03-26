// Classe Usuario (classe base para Gerente, Cliente e Atendente)
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String nascimento;

    // Getters e Setters
   public void setId(int id) {
        this.id = id;
   }

  public int getId() {
      return this.id;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", logradouro=" + logradouro +
                ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado +
                ", nascimento=" + nascimento + "]";
    }
}
