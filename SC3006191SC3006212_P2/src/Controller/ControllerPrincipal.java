package Controller;

import Model.Abstract.ImpostoRendaPessoaFisica;
import Model.ConcreteClasse.CompletaDeclara;
import Model.ConcreteClasse.SimplesDeclara;
import Model.Objeto.Dados;
import Model.Objeto.GastoDedutiveis;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import view.ViewTelaExtra;


public class ControllerPrincipal {

    @FXML TableView<GastoDedutiveis> tvDedutivel;
    @FXML TableColumn<GastoDedutiveis, String> cNome;
    @FXML TableColumn<GastoDedutiveis, String> cTipo;
    @FXML TableColumn<GastoDedutiveis, String> cValor;
    @FXML TextField TFpago;
    @FXML TextField TFRecebimento;
    @FXML ToggleGroup declara;
    @FXML Label TotalShow;

    private ObservableList<GastoDedutiveis> gastos;

    @FXML
    private void initialize(){
        ligarTabelaaoModelo();
        ligarFonteDeDados();
        carregarDadosTabela();

    }

    private void ligarFonteDeDados() {
        gastos = FXCollections.observableArrayList();
        tvDedutivel.setItems(gastos);
    }

    private void carregarDadosTabela() {
        gastos.clear();
        gastos.addAll(Dados.gastos);
        tvDedutivel.refresh();
    }

    private void ligarTabelaaoModelo() {
        cNome.setCellValueFactory(new PropertyValueFactory<>("name"));
        cTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        cValor.setCellValueFactory(new PropertyValueFactory<>("valor"));

    }

    @FXML
    private void Deletar(ActionEvent event){
        GastoDedutiveis gasto = tvDedutivel.getSelectionModel().getSelectedItem();
        if(gasto != null){
            Dados.gastos.remove(gasto);
            carregarDadosTabela();
        }
    }


    @FXML
    private void Editar(ActionEvent event){
        GastoDedutiveis gasto = tvDedutivel.getSelectionModel().getSelectedItem();
        if(gasto != null){
            ViewTelaExtra janeja = new ViewTelaExtra();
            try {
                janeja.MostrarEEsperar(gasto);
            } catch (Exception e) {
                e.printStackTrace();
            }
            carregarDadosTabela();
        }
    }

    @FXML
    private void Adcionar(ActionEvent event){
        ViewTelaExtra janeja = new ViewTelaExtra();
        janeja.MostrarEEsperar();
        carregarDadosTabela();

    }

    @FXML
    private void ReLoad(){
        tvDedutivel.refresh();
    }


    @FXML
    private void DeclararImposto(ActionEvent event){
        double valor = 0.0;
        String ValorPago= TFpago.getText();
        String ValorRecebimento=TFRecebimento.getText();
        RadioButton radio = (RadioButton)declara.getSelectedToggle();
        String tipo = radio.getId();


        if(tipo.equals("RBdsim")){
            ImpostoRendaPessoaFisica declaraSimples = new SimplesDeclara();
            valor = declaraSimples.ImpostoRendaPessoaFisica(ValorRecebimento,ValorPago,gastos);

        }else {
            if(tipo.equals("RBdcom")){
                ImpostoRendaPessoaFisica completo = new CompletaDeclara();
                valor = completo.ImpostoRendaPessoaFisica(ValorRecebimento,ValorPago,gastos);
            }
        }

        TotalShow.setVisible(true);
        TotalShow.setText("R$:"+valor);

    }

}
