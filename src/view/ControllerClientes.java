package view;
import bean.Clientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author vodka
 */
public class ControllerClientes extends AbstractTableModel {

    private List lista;
    
    public void setLista(List lista){
        this.lista = lista;
    }
    
    public Clientes getBean(int rowIndex){
        return (Clientes) lista.get(rowIndex);
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
        Clientes clientes = (Clientes) lista.get(rowIndex);
        if (columnIndex  == 0) {
            return clientes.getIdclientes();
        } 
        if (columnIndex  == 1) {
            return clientes.getNome();
        } 
        if (columnIndex  == 2) {
            return clientes.getEmail();
        } 
        
        return clientes;
        
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
            return "Email";
        }
            return "";
    }
}
