

package generated.beans;

/* Esta classe foi gerada! */
public class Suporte {
	// id field
	private long suporteId;

	// fields

	private String agencia;

	private byte[] icone;

	private String iconeContentType;


	// references


	// default constructor
	public Suporte() {
	}
	
	// id fields setter and getter
	public void setSuporteId(long suporteId) { this.suporteId = suporteId; }    
	public long getSuporteId() { return this.suporteId; }    

	// fields setters and getters

	public void setAgencia(String agencia) { this.agencia = agencia; }    
	public String getAgencia() { return this.agencia; }    

	public void setIcone(byte[] icone) { this.icone = icone; }    
	public byte[] getIcone() { return this.icone; }    

	public void setIconeContentType(String iconeContentType) { this.iconeContentType = iconeContentType; }    
	public String getIconeContentType() { return this.iconeContentType; }    


	// references setters and getters



    // summary getter
    public String getSummary() {
        return getAgencia();
    }
    // generic id getter
    public long getId() {
        return getSuporteId();
    }
    
    public String toString() {
        return getSummary();
    }    
}
