package bean;
// Generated Dec 14, 2024 5:12:36 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Album generated by hbm2java
 */
@Entity
@Table(name="album"
    ,catalog="db_matheuscosta"
)
public class Album  implements java.io.Serializable {


     private int idalbum;
     private String titulo;
     private String genero;
     private String nomeArtista;
     private Date dataLanc;
     private String descricao;
     private String imagem;

    public Album() {
    }

	
    public Album(int idalbum) {
        this.idalbum = idalbum;
    }
    public Album(int idalbum, String titulo, String genero, String nomeArtista, Date dataLanc, String descricao, String imagem) {
       this.idalbum = idalbum;
       this.titulo = titulo;
       this.genero = genero;
       this.nomeArtista = nomeArtista;
       this.dataLanc = dataLanc;
       this.descricao = descricao;
       this.imagem = imagem;
    }
   
     @Id 

    
    @Column(name="idalbum", unique=true, nullable=false)
    public int getIdalbum() {
        return this.idalbum;
    }
    
    public void setIdalbum(int idalbum) {
        this.idalbum = idalbum;
    }

    
    @Column(name="titulo", length=100)
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    @Column(name="genero", length=50)
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    @Column(name="nomeArtista", length=45)
    public String getNomeArtista() {
        return this.nomeArtista;
    }
    
    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataLanc", length=10)
    public Date getDataLanc() {
        return this.dataLanc;
    }
    
    public void setDataLanc(Date dataLanc) {
        this.dataLanc = dataLanc;
    }

    
    @Column(name="descricao", length=50)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="imagem", length=100)
    public String getImagem() {
        return this.imagem;
    }
    
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}


