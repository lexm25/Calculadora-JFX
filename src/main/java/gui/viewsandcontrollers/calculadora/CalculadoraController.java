package gui.viewsandcontrollers.calculadora;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculadoraController {

	@FXML
	private TextField resultado;

	@FXML
	private TextField num1;

	@FXML
	private TextField num2;

	public void initialize() {
	}

	@FXML
	private void sumar(ActionEvent event) throws IOException {
		try {
			double n1 = Double.parseDouble(num1.getText());
			double n2 = Double.parseDouble(num2.getText());
			double rs = n1 + n2;
			resultado.setText(rs + "");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			resultado.setText("No se admiten carcarteners NO numéricos");
		}
	}

	@FXML
	private void restar(ActionEvent event) {
		try {
			double n1 = Double.parseDouble(num1.getText());
			double n2 = Double.parseDouble(num2.getText());
			double rs = n1 - n2;
			resultado.setText(rs + "");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			resultado.setText("No se admiten carcarteners NO numéricos");
		}
	}

	@FXML
	private void multiplicar(ActionEvent event) {
		try {
			double n1 = Double.parseDouble(num1.getText());
			double n2 = Double.parseDouble(num2.getText());
			double rs = n1 * n2;
			resultado.setText(rs + "");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			resultado.setText("No se admiten carcarteners NO numéricos");
		}
	}

	@FXML
	private void dividir(ActionEvent event) {
		try {
			double n1 = Double.parseDouble(num1.getText());
			double n2 = Double.parseDouble(num2.getText());
			double rs = n1 / n2;
			if (n2 == 0) {
				resultado.setText("La división entre 0 esta excluida");
			} else {
				resultado.setText(rs + "");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			resultado.setText("No se admiten carcarteners NO numéricos");
		}
	}
}