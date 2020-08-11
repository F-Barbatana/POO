package Controller;

import Essentials.BancoDados;
import Essentials.Dados;
import Essentials.Produtos;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Random;

public class Controller{



    @FXML private TableView<Produtos> tabel;

    @FXML private TableColumn<Produtos,String> cName;

    @FXML private TableColumn<Produtos, Double> cPrice;

    @FXML private TableColumn<Produtos, Integer> cQuantity;

    @FXML
    private TextField Nome_prod;

    @FXML
    private TextField Price;

    @FXML
    private TextField Quant;


    private ObservableList<Produtos> prod;

    @FXML
    private void initialize(){
        ligarTabelaaoModelo();
        ligarFonteDeDados();
        carregarDadosTabela();

    }

    private void ligarFonteDeDados() {
        prod = FXCollections.observableArrayList();
        tabel.setItems(prod);
    }

    private void carregarDadosTabela() {
        prod.clear();
        prod.addAll(BancoDados.leitura());
        tabel.refresh();
    }

    private void ligarTabelaaoModelo() {
        cName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        cPrice.setCellValueFactory(new PropertyValueFactory<>("val"));
        cQuantity.setCellValueFactory(new PropertyValueFactory<>("quant"));
        tabel.setItems(prod);
        tabel.setOnMouseClicked(event -> loadRowData());

    }

    private void loadRowData() {
        Produtos produto = tabel.getSelectionModel().getSelectedItem();
        if(produto != null){
            Nome_prod.setText(produto.getName());
            Price.setText(produto.getVal()+"");
            Quant.setText(produto.getQuant()+"");

        }


    }


    @FXML
    private void acaoBotao(ActionEvent event){
        Produtos produto = tabel.getSelectionModel().getSelectedItem();

        String A=Nome_prod.getText();
        String B=Price.getText();
        String bt=Quant.getText();
        long code = 1;
        boolean teste = false;

        if (!A.equals("") && !B.equals("") && !bt.equals("")) {

            long L = new Random().nextLong();
            double b = Double.parseDouble(B);
            int i = Integer.parseInt(bt);

            Produtos pro = new Produtos(A,i,b,L);


            if(produto != null){
                System.out.println("Editado");
                BancoDados.update(pro,produto);


            }else{

                for (Produtos p : prod) {
                    if (p.getName().equals(A)){
                        System.out.println("Editado");
                        BancoDados.update(pro,p);
                        teste = true;
                    }
                }

                if (!teste) {
                    System.out.println("Adicionado");
                    BancoDados.save(pro);

                }

            }


            carregarDadosTabela();
        }
    }
    @FXML
    private void clear(ActionEvent event){
        System.out.println("limpo");
        Nome_prod.setText("");
        Price.setText("");
        Quant.setText("");

    }

    @FXML
    private void delete(ActionEvent event){
        Produtos produto = tabel.getSelectionModel().getSelectedItem();
        if(produto != null){
            BancoDados.delete(produto.getCode());
            System.out.println("deletado");
            carregarDadosTabela();



        }
    }
}
