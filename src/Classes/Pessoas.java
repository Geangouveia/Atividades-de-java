package Classes;

public class Pessoas {
//Atributos de uma Pessoa
private String nome;
private String sobrenome;
private String telefone;
private String email;
private static int total;

//Construtor
public Pessoas(){
    System.out.println("Criando o Cadastro de uma Pessoa");
    Pessoas.total++;
}

//Get e Set

public void setNome(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public String getSobrenome() {
    return sobrenome;
}

public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public int getTotal() {
    return Pessoas.total;
}
}
public class Endereco {
    //Atributos de Endereco
    private String logradouro;
    private int numero;
    private String cep;
    private String complemento;
    
    
    //Get e Set dos atributos Endereco.
    public String getLogradouro() {
        return this.logradouro;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getComplemento(){
        return this.complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }COPIAR CODIGO
    }
    public class CadastroCliente {
        public static void main(String[] args) {
        
            //New no Objeto Pessoa
            Pessoas cliente1 = new Pessoas();
            cliente1.setNome("Jefferson");
            cliente1.setSobrenome("Cruz");
            cliente1.setEmail("jefferson.henrique.cruz@gmail.com");
            cliente1.setTelefone("(15) 99656-8380");
        
        
            //New Objeto Endereco
        
            Endereco endereco1 = new Endereco();
            endereco1.setLogradouro("Rua Seraphim Banietti");
            endereco1.setNumero(850);
            endereco1.setCep("18072-856");
            endereco1.setComplemento("Residencial Santinon");
        
            cliente1.setEndereco(endereco1);
        
        
            //Sysoutprintln no objeto Pessoa
            System.out.println("--------------- Cliente 1 ------------------------------");
            System.out.println();
            System.out.println("Primeiro Nome: "+cliente1.getNome());
            System.out.println("Sobrenome: "+cliente1.getSobrenome());
            System.out.println("Correio Eletronico: "+cliente1.getEmail());
            System.out.println("Telefone: "+cliente1.getTelefone());
            System.out.println("Endereco: "+cliente1.getEndereco().getLogradouro());
            System.out.println("Numero: "+cliente1.getEndereco().getNumero());
            System.out.println("Cep: "+cliente1.getEndereco().getCep());
            System.out.println("Complemento: "+cliente1.getEndereco().getComplemento());
            System.out.println();
            System.out.println("--------------------------------------------------------");
            System.out.println("O Total de Cadastro é: " + cliente1.getTotal());
        }COPIAR CÓDIGO
        }