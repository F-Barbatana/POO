package view;

import Controller.ControllerGasto;
import Model.Objeto.GastoDedutiveis;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewTelaExtra {

    public void MostrarEEsperar(){
            MostrarEEsperar(null);
    }

    public void MostrarEEsperar(GastoDedutiveis gasto){
        FXMLLoader loader =new FXMLLoader();

        try {
            Pane graph = loader.load(getClass().getResource("./ValoresDedutiveis.fxml").openStream());
            Scene scene = new Scene(graph, 275, 175);

            ControllerGasto controle = loader.getController();
            if (gasto != null){
                controle.SetValor(gasto);
            }

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Dedutivel");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        }catch (IOException e){
            e.printStackTrace();
        }



    }

}
