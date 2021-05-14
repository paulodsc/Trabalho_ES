package Projeto;

public class Livro {
	private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
  //testando
    
    public Livro() 
    {  }

    public Livro(int codigo, String titulo, String autor, 
                    int anoPublicacao,String editora) 
    {
            
            setCodigo(codigo);
            setTitulo(titulo);
            setAutor(autor);
            setEditora(editora);
            setAnoPublicacao(anoPublicacao);
            
    }

    public int getCodigo() 
    {
            return codigo;
    }

    public String getTitulo() 
    {
            return titulo;
    }

    public String getAutor() 
    {
            return autor;
    }

       
    public void setCodigo(int codigo) 
    {
            this.codigo = codigo;
    }

    public void setTitulo(String titulo) 
    {
            this.titulo = titulo;
    }

    public void setAutor(String autor) 
    {
            this.autor = autor;
    }
    
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

 
    
}
