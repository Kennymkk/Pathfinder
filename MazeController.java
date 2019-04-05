package application;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MazeController {
	List<String> listMaze = new ArrayList<String>();
	

String indexFile;
	@FXML
	private Button Browse;
	@FXML
	private ComboBox<?> ListFiles;
	
	@FXML
	public void actionListFile() {
		
	}
		
	@FXML
    public void actionBrowseButton(ActionEvent ae) {
		   // création de la boîte de dialogue
	    JFileChooser dialogue = new JFileChooser("C:\\Users\\basti\\Desktop\\DM");
	    dialogue.setCurrentDirectory(new java.io.File("C:\\Users\\basti\\Desktop\\DM"));
	    dialogue.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

	    FileNameExtensionFilter ff = new FileNameExtensionFilter("Fichiers texte", "txt");
        dialogue.setFileFilter(ff);
 

	    // affichage
	    dialogue.showOpenDialog(null);
	     
	    // récupération du fichier sélectionné
	    System.out.println("Fichier choisi : " + dialogue.getSelectedFile());
	    indexFile = dialogue.getSelectedFile().getPath();
	    System.out.println(indexFile);
    }
	@FXML
	 public void  indexFiles() {
	while (indexFile != null){
		
		listMaze.add(indexFile);
		
	}

	
	}
	@FXML
	private Button Resolution;
	
	//@FXML
	//private Spinner<T> ListSolution;
	
	@FXML
	private Label SolutionCount;
	
	@FXML
	private Label StepCount;
	
	@FXML
	private Label ResolutionDuration;
	
	@FXML
	private Label Pathlength;
	
	@FXML
	private Label ElementsExplored;
	@FXML
	private Pane Maze;
	
	//@FXML
	//private <T> ChoiceBox<T> BoxAlgo() {
		
	//}
	//@FXML
	//private <T> ChoiceBox<T> BoxMaze() {
		
	//}
	
	@FXML
	private void DrawMaze(){
		
	}
	@FXML
	private void DrawSolution(){
		
	}
	@FXML
	private void SelectAlgorithm(){
		
	}
}
