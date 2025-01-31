package bean;
// Generated Dec 14, 2024 5:12:36 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendasProdutos generated by hbm2java
 */
@Entity
@Table(name="vendas_produtos"
    ,catalog="db_matheuscosta"
)
public class VendasProdutos  implements java.io.Serializable {


     private int idvpro;
     private int quantidade;
     private double valorTotal;
     private Date dataVendas;

    public VendasProdutos() {
    }

	
    public VendasProdutos(int idvpro) {
        this.idvpro = idvpro;
    }
    public VendasProdutos(int idvpro, int quantidade, double valorTotal, Date dataVendas) {
       this.idvpro = idvpro;
       this.quantidade = quantidade;
       this.valorTotal = valorTotal;
       this.dataVendas = dataVendas;
    }
   
     @Id 

    
    @Column(name="idvpro", unique=true, nullable=false)
    public int getIdvpro() {
        return this.idvpro;
    }
    
    public void setIdvpro(int idvpro) {
        this.idvpro = idvpro;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataVendas", length=19)
    public Date getDataVendas() {
        return this.dataVendas;
    }
    
    public void setDataVendas(Date dataVendas) {
        this.dataVendas = dataVendas;
    }

    
    @Column(name="quantidade")
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    @Column(name="valor_total", precision=10)
    public double getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }




}


