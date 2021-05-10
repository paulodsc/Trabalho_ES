package br.ufba.idp;

public class Pessoa implements IPessoa{
private String nome;
private String  codPessoa;

public Pessoa(String nome, String codPessoa) {
	this.nome = nome;
	this.codPessoa = codPessoa;
}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public String  getCodPessoa() {
		// TODO Auto-generated method stub
		return codPessoa;
	}

}
