package view;
import bean.Album;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author vodka
 */
public class ControllerAlbum extends AbstractTableModel {

    private List lista;
    
    public void setLista(List lista){
        this.lista = lista;
    }
    
    public Album getBean(int rowIndex){
        return (Album) lista.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Album album = (Album) lista.get(rowIndex);
        if (columnIndex  == 0) {
            return album.getIdalbum();
        } 
        if (columnIndex  == 1) {
            return album.getTitulo();
        } 
        if (columnIndex  == 2) {
            return album.getNomeArtista();
        } 
        
        return album;
        
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == 0){
            return "Código";
        }
        if(columnIndex == 1){
            return "Titulo";
        }
        if(columnIndex == 2){
            return "Nome";
        }
            return "";
    }
}
