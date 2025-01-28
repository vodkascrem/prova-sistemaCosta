package view;
import bean.MbcMusica;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author vodka
 */
public class ControllerMusica extends AbstractTableModel {

    private List lista;
    
    public void setLista(List lista){
        this.lista = lista;
    }
    
    public MbcMusica getBean(int rowIndex){
        return (MbcMusica) lista.get(rowIndex);
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
        MbcMusica musica = (MbcMusica) lista.get(rowIndex);
        if (columnIndex  == 0) {
            return musica.getMbcIdmusica();
        } 
        if (columnIndex  == 1) {
            return musica.getMbcTitulo();
        } 
        if (columnIndex  == 2) {
            return musica.getMbcGenero();
        } 
        
        return musica;
        
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
