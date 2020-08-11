package View;

import Essentials.Dados;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExibirTela  extends Application {


        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("PainelLoja.fxml"));
            primaryStage.setTitle("Produtos");
            primaryStage.setScene(new Scene(root, 750, 500));
            primaryStage.show();

        }



        public static void main(String[] args) {
            Dados.gerarGastos();
            launch(args);
        }

    }

