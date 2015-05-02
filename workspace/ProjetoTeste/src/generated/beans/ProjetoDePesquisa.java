

package generated.beans;

/* Esta classe foi gerada! */
public class ProjetoDePesquisa {
	// id field
	private long projetoDePesquisaId;

	// fields

	private String titulo;

	private String descricao;

	private java.util.Date dataInicio;

	private java.util.Date dataFim;


	// references

	private generated.beans.Suporte apoio;

	private generated.beans.AreaDePesquisa area;


	// default constructor
	public ProjetoDePesquisa() {
	}
	
	// id fields setter and getter
	public void setProjetoDePesquisaId(long projetoDePesquisaId) { this.projetoDePesquisaId = projetoDePesquisaId; }    
	public long getProjetoDePesquisaId() { return this.projetoDePesquisaId; }    

	// fields setters and getters

	public void setTitulo(String titulo) { this.titulo = titulo; }    
	public String getTitulo() { return this.titulo; }    

	public void setDescricao(String descricao) { this.descricao = descricao; }    
	public String getDescricao() { return this.descricao; }    

	public void setDataInicio(java.util.Date dataInicio) { this.dataInicio = dataInicio; }    
	public java.util.Date getDataInicio() { return this.dataInicio; }    

	public void setDataFim(java.util.Date dataFim) { this.dataFim = dataFim; }    
	public java.util.Date getDataFim() { return this.dataFim; }    


	// references setters and getters

	public void setApoio(generated.beans.Suporte apoio) { this.apoio = apoio; }    
	public generated.beans.Suporte getApoio() { return this.apoio; }    

	public void setArea(generated.beans.AreaDePesquisa area) { this.area = area; }    
	public generated.beans.AreaDePesquisa getArea() { return this.area; }    



    // summary getter
    public String getSummary() {
        return getTitulo();
    }
    // generic id getter
    public long getId() {
        return getProjetoDePesquisaId();
    }
    
    public String toString() {
        return getSummary();
    }    
}
