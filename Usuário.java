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

// Classe Cliente (herda de Usuario)
public class Cliente extends Usuario {
    private String cpf;

    // Getter e Setter
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

// Classe Atendente (herda de Usuario)
public class Atendente extends Usuario {
    private String matricula;

    // Getter e Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

// Classe Gerente (herda de Usuario)
public class Gerente extends Usuario {
    private String cnpj;

    // Getter e Setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

// Classe Protocolo
public class Protocolo {
    private String assunto;
    private String data;
    private String horario;

    // Getters e Setters
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
