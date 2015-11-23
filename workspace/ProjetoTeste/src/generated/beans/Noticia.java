

package generated.beans;

/* Esta classe foi gerada! */
public class Noticia {
	// id field
	private long noticiaId;

	// fields

	private String titulo;

	private String resumo;

	private String conteudo;

	private byte[] imagem;

	private java.util.Date data;

	private String imagemContentType;


	// references


	// default constructor
	public Noticia() {
	}
	
	// id fields setter and getter
	public void setNoticiaId(long noticiaId) { this.noticiaId = noticiaId; }    
	public long getNoticiaId() { return this.noticiaId; }    

	// fields setters and getters

	public void setTitulo(String titulo) { this.titulo = titulo; }    
	public String getTitulo() { return this.titulo; }    

	public void setResumo(String resumo) { this.resumo = resumo; }    
	public String getResumo() { return this.resumo; }    

	public void setConteudo(String conteudo) { this.conteudo = conteudo; }    
	public String getConteudo() { return this.conteudo; }    

	public void setImagem(byte[] imagem) { this.imagem = imagem; }    
	public byte[] getImagem() { return this.imagem; }    

	public void setData(java.util.Date data) { this.data = data; }    
	public java.util.Date getData() { return this.data; }    

	public void setImagemContentType(String imagemContentType) { this.imagemContentType = imagemContentType; }    
	public String getImagemContentType() { return this.imagemContentType; }    


	// references setters and getters



    // summary getter
    public String getSummary() {
        return getTitulo();
    }
    // generic id getter
    public long getId() {
        return getNoticiaId();
    }
    
    public String toString() {
        return getSummary();
    }    
}
