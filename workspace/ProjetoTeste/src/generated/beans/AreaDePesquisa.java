

package generated.beans;

/* Esta classe foi gerada! */
public class AreaDePesquisa {
	// id field
	private long areaDePesquisaId;

	// fields

	private String nome;

	private String descricao;


	// references


	// default constructor
	public AreaDePesquisa() {
	}
	
	// id fields setter and getter
	public void setAreaDePesquisaId(long areaDePesquisaId) { this.areaDePesquisaId = areaDePesquisaId; }    
	public long getAreaDePesquisaId() { return this.areaDePesquisaId; }    

	// fields setters and getters

	public void setNome(String nome) { this.nome = nome; }    
	public String getNome() { return this.nome; }    

	public void setDescricao(String descricao) { this.descricao = descricao; }    
	public String getDescricao() { return this.descricao; }    


	// references setters and getters



    // summary getter
    public String getSummary() {
        return getNome();
    }
    // generic id getter
    public long getId() {
        return getAreaDePesquisaId();
    }
    
    public String toString() {
        return getSummary();
    }    
}
