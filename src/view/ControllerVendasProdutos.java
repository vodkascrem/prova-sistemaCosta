package view;
import bean.VendasProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author vodka
 */
public class ControllerVendasProdutos extends AbstractTableModel {

    private List lista;
    
    public void setLista(List lista){
        this.lista = lista;
    }
    
    public VendasProdutos getBean(int rowIndex){
        return (VendasProdutos) lista.get(rowIndex);
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
        VendasProdutos vendasProdutos = (VendasProdutos) lista.get(rowIndex);
        if (columnIndex  == 0) {
            return vendasProdutos.getIdvpro();
        } 
        if (columnIndex  == 1) {
            return vendasProdutos.getQuantidade();
        } 
        if (columnIndex  == 2) {
            return vendasProdutos.getValorTotal();
        } 
        
        return vendasProdutos;
        
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == 0){
            return "Código";
        }
        if(columnIndex == 1){
            return "Quantidade";
        }
        if(columnIndex == 2){
            return "Nome";
        }
            return "";
    }
}
