

package generated.beans;

/* Esta classe foi gerada! */
public class Colega {
	// id field
	private long colegaId;

	// fields

	private String nome;

	private String homepage;


	// references


	// default constructor
	public Colega() {
	}
	
	// id fields setter and getter
	public void setColegaId(long colegaId) { this.colegaId = colegaId; }    
	public long getColegaId() { return this.colegaId; }    

	// fields setters and getters

	public void setNome(String nome) { this.nome = nome; }    
	public String getNome() { return this.nome; }    

	public void setHomepage(String homepage) { this.homepage = homepage; }    
	public String getHomepage() { return this.homepage; }    


	// references setters and getters



    // summary getter
    public String getSummary() {
        return "Colegas de trabalho";
    }
    // generic id getter
    public long getId() {
        return getColegaId();
    }
    
    public String toString() {
        return getSummary();
    }    
}
