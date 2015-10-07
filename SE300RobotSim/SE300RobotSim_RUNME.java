import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//okay so for this to work I will need a robotsim class to sim the robot, student sim class, 


public class SE300RobotSim_RUNME extends Application { 
	
	//make a scene here 
	Scene scene ; 
	
	public final static int GRID_WIDTH = 6;
	public final static int GRID_HEIGHT = 6;
	public final static int SQUARE_WIDTH = 50; //grid square width in pixels

	//CREATE ALL OF THE PANES HERE
	
	//all the panes for the home menu 
	//to create the home menu our outer container will be a vbox. the vbox will hold an hbox 
	//that has the title of the project, another hbox that will hold the two big buttons 
	//that will let you choose which sim you do, and another hbox that holds various help/info stuff
	
	//creating the container pane that will pull in all the other panes for the home menu 
	VBox home_menu = new VBox() ; 
	//creating the pane that holds the title text of our sim for the home menu
	HBox homemenu_title = new HBox() ; 
	//creating the pane that holds the two big buttons that will let the user choose what sim they want to use
	HBox homemenu_simButtons = new HBox() ; 
	//creating the pane that holds help/info stuff 
	HBox homemenu_help = new HBox() ; 
	
	//all the panes for the workflow simulation menu
	//to create the workflow sim menu the container pane will be a vbox that holds an hbox for
	//the menu title, an hbox for the three big buttons that will let the user choose which workflow 
	//sim they want to run (LB atrium, ECSSE atrium and hallway, and COB classroom), and then another 
	//hbox that will hold things like the back button to go to the home menu and info/help 
	
	//creating the container pane that will pull in all the other panes for the workflow sim menu
	VBox workflowSim_menu = new VBox() ; 
	//creating the pane that holds the title text of the workflow sim menu 
	VBox workflowSimMenu_title = new VBox() ; 
	//creating the pane that holds the three buttons that will let the user choose which wf sim they want
	HBox workflowSimMenu_wfButtons = new HBox() ; 
	//creating the pane that holds the back button, help/info stuff
	HBox workflowSimMenu_help = new HBox() ; 	
	
	
	//all the panes for the wf sim of LB Atrium 
	
	
	//all the panes for the wf sim of ECSSE atrium/hallways 
	
	
	//all the panes for the wf sim of COB classroom 
	
	
	//all the panes for the robot simulation menu 
	
	
	//all the panes for the about menu 
	
	//CREATE ALL OF THE BUTTONS HERE 
	
	//CREATE ALL OF THE TEXT FIELDS HERE 
	
	@Override
	public void start(Stage primaryStage) throws Exception {
			
	}
}