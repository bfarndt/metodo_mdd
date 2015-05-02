

package generated.beans;

/* Esta classe foi gerada! */
public class Link {
	// id field
	private long linkId;

	// fields

	private String titulo;

	private String url;


	// references


	// default constructor
	public Link() {
	}
	
	// id fields setter and getter
	public void setLinkId(long linkId) { this.linkId = linkId; }    
	public long getLinkId() { return this.linkId; }    

	// fields setters and getters

	public void setTitulo(String titulo) { this.titulo = titulo; }    
	public String getTitulo() { return this.titulo; }    

	public void setUrl(String url) { this.url = url; }    
	public String getUrl() { return this.url; }    


	// references setters and getters



    // summary getter
    public String getSummary() {
        return getTitulo();
    }
    // generic id getter
    public long getId() {
        return getLinkId();
    }
    
    public String toString() {
        return getSummary();
    }    
}
