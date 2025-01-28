package view;
import bean.Usuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author vodka
 */
public class ControllerUsuarios extends AbstractTableModel {

    private List lista;
    
    public void setLista(List lista){
        this.lista = lista;
    }
    
    public Usuarios getBean(int rowIndex){
    return (Usuarios) lista.get(rowIndex);
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
        Usuarios usuarios = (Usuarios) lista.get(rowIndex);
        if (columnIndex  == 0) {
            return usuarios.getIdusuarios();
        } 
        if (columnIndex  == 1) {
            return usuarios.getNome();
        } 
        if (columnIndex  == 2) {
            return usuarios.getCnpj();
        } 
        
        return usuarios;
        
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == 0){
            return "Código";
        }
        if(columnIndex == 1){
            return "Nome";
        }
        if(columnIndex == 2){
            return "CPF";
        }
            return "";
    }

    void setList(List lista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
