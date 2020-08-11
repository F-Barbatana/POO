package Controller;


import Model.Objeto.Dados;
import Model.Objeto.GastoDedutiveis;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.util.List;


public class ControllerGasto {
    private GastoDedutiveis gasto;

    @FXML ToggleGroup tipo;
    @FXML TextField FTvalor;
    @FXML TextField TFNome;
    @FXML RadioButton Sau;
    @FXML RadioButton Esc;
    @FXML Button btnExecutar;



    public void SetValor(GastoDedutiveis G){
        this.gasto = G;

        FTvalor.setText(""+gasto.getValor());
        TFNome.setText(gasto.getName());

        if (gasto.getTipo().equals("Escola")){
            Esc.setSelected(true);
        }else {
            Sau.setSelected(true);
        }
        setAttDedutivel();

    }

    private void setAttDedutivel(){
        btnExecutar.setText("Atualizar");
    }

    public void executar(ActionEvent actionEvent){
        if(gasto == null){
            gasto = new GastoDedutiveis();
        }

        RadioButton radioButton = (RadioButton)tipo.getSelectedToggle();
        String tipoDeGasto = radioButton.getText();
        gasto.setTipo(tipoDeGasto);

        gasto.setName(TFNome.getText());

        double valor = Double.parseDouble(FTvalor.getText());
        gasto.setValor(valor);

        addOuAtt();
        closeWindow();
    }

    private void addOuAtt() {
        List<GastoDedutiveis> Gastos = Dados.gastos;
        if (Gastos.contains(gasto)) {
            int idx = Gastos.indexOf(gasto);
            Gastos.set(idx, gasto);
        } else {
            Gastos.add(gasto);

        }
    }

    private void closeWindow(){
        Stage stage = (Stage)btnExecutar.getScene().getWindow();
        stage.close();
    }

}
