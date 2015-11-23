

package generated.beans;

/* Esta classe foi gerada! */
public class Publicacao {
	// id field
	private long publicacaoId;

	// fields

	private String autores;

	private String local;

	private String data;


	// references

	private generated.beans.AreaDePesquisa area;


	// default constructor
	public Publicacao() {
	}
	
	// id fields setter and getter
	public void setPublicacaoId(long publicacaoId) { this.publicacaoId = publicacaoId; }    
	public long getPublicacaoId() { return this.publicacaoId; }    

	// fields setters and getters

	public void setAutores(String autores) { this.autores = autores; }    
	public String getAutores() { return this.autores; }    

	public void setLocal(String local) { this.local = local; }    
	public String getLocal() { return this.local; }    

	public void setData(String data) { this.data = data; }    
	public String getData() { return this.data; }    


	// references setters and getters

	public void setArea(generated.beans.AreaDePesquisa area) { this.area = area; }    
	public generated.beans.AreaDePesquisa getArea() { return this.area; }    



    // summary getter
    public String getSummary() {
        return getAutores() + ". In: " + getLocal() + ". " + getData();
    }
    // generic id getter
    public long getId() {
        return getPublicacaoId();
    }
    
    public String toString() {
        return getSummary();
    }    
}
