package view;

import Model.Objeto.Dados;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainDeclarar extends Application {

    @Override
    public void start(Stage grafico) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("PaginaPrincipal.fxml"));
        grafico.setTitle("Simulador de declaração");
        grafico.setScene(new Scene(root, 450, 550));
        grafico.show();
    }


    public static void main(String[] args) {
        Dados.gerarGastos();
        launch(args);
    }
}
