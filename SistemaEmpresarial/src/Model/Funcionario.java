package Model;
		
		/**
		 * Essa classe tem como objetivo definir os atributos e metódos padrões para todos os tipos de funcionários.
		 * 	  
		 * @author Pedro Henrique
		 * @version 3.0 nov. 2020
		 *
		 */

	    public abstract class Funcionario  {
	    //atributos	
	    protected String identificador;
        protected String nome ;
	    protected int cpf;
	    protected int identidade;
	    protected String filiacao ;        
	    protected String sexo;
        protected String estadoCivil ;
	    protected String naturalidade;
	    protected String endereco;
        protected String telefone;
        protected String email;
        protected String escolaridade;
        protected String cargo  ; 
	    protected int codigo;
	    protected int cargaHoraria;  
	    protected double comissao;
	    protected double salario;
	    protected String departamento;
	    protected String dataNascimento;
	   	    
	    //metodos especiais
	    
	    /**
	     * O construtor de funcionário sem argumentos é necessário para que possa ser utilizado em suas classes
	     * derivadas com o intuito de aplicar alguma funcionalidade específica.
	     */
	    
	    public Funcionario(){
        }
	    /**
	     * O construtor com todos os parâmetros de funcionários tem como objetivo inicializar as variáveis diretamente
	     * e definir o mínimo de atributos que cada classe derivada de funcionário terá que ter.
	     * @param codigo Codigo do Funcionario
	     * @param nome Nome do Funcionario
	     * @param filiacao Filiação do Funcionario
	     * @param cargaHoraria Carga Horaria do Funcionario
	     * @param comissao Comissao do Funcionario
	     * @param cargo Cargo do Funcionario
	     * @param telefone Telefone do Funcionario
	     * @param endereco Endereço do do Funcionario
	     * @param salario Salário do Funcionario
	     * @param departamento Departamento do Funcionario
	     * @param sexo Sexo do Funcionario
	     * @param dataNascimento Data de Nascimento do Funcionario
	     */
	    public Funcionario(int codigo, String nome,String filiacao, int cargaHoraria, double comissao, String cargo,
	             String telefone, String endereco,double salario, String departamento,String sexo,String dataNascimento) {
	      this.nome=nome ;
	      this.codigo=codigo;
	      this.filiacao=filiacao;
	      this.cargaHoraria=cargaHoraria;
	      this.comissao=comissao;
	      this.cargo=cargo;
	      this.telefone=telefone;
	      this.endereco=endereco;
	      this.salario=salario;
	      this.departamento=departamento;
	      this.sexo=sexo;
	      this.dataNascimento=dataNascimento;
	    }

	    //metodos getters e setter
	    
		public String getIdentificador() {
			return identificador;
		}


		public void setIdentificador(String identificador) {
			this.identificador = identificador;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getCpf() {
			return cpf;
		}


		public void setCpf(int cpf) {
			this.cpf = cpf;
		}


		public int getIdentidade() {
			return identidade;
		}


		public void setIdentidade(int identidade) {
			this.identidade = identidade;
		}


		public String getFiliacao() {
			return filiacao;
		}


		public void setFiliacao(String filiacao) {
			this.filiacao = filiacao;
		}


		public String getSexo() {
			return sexo;
		}


		public void setSexo(String sexo) {
			this.sexo = sexo;
		}


		public String getEstadoCivil() {
			return estadoCivil;
		}


		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}


		public String getNaturalidade() {
			return naturalidade;
		}


		public void setNaturalidade(String naturalidade) {
			this.naturalidade = naturalidade;
		}


		public String getEndereco() {
			return endereco;
		}


		public void setEndereco(String endereco) {
			this.endereco = endereco;
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


		public String getEscolaridade() {
			return escolaridade;
		}


		public void setEscolaridade(String escolaridade) {
			this.escolaridade = escolaridade;
		}


		public String getCargo() {
			return cargo;
		}


		public void setCargo(String cargo) {
			this.cargo = cargo;
		}


		public int getCodigo() {
			return codigo;
		}


		public void setCodigo(int dodigo) {
			this.codigo = codigo;
		}


		public int getCargaHoraria() {
			return cargaHoraria;
		}


		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}


		public double getComissao() {
			return comissao;
		}


		public void setComissao(double comissao) {
			this.comissao = comissao;
		}


		public double getSalario() {
			return salario;
		}


		public void setSalario(double salario) {
			this.salario = salario;
		}


		public String getDepartamento() {
			return departamento;
		}


		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
                public String getDataNascimento(){
                    return dataNascimento;
                }
                public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
	}


