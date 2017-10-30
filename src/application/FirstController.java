package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FirstController implements Initializable{
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection connection;
	PreparedStatement ps3 = null;
	PreparedStatement pss4 = null;
	ResultSet rs3 = null;
	Connection connection3;
	PreparedStatement ps5 = null;
	ResultSet rs5 = null;
	PreparedStatement pss = null;
	ResultSet rs6 = null;
	PreparedStatement ps6 = null;
	ResultSet rs7 = null;
	PreparedStatement ps7 = null;
	
	Connection connectionn;
	
	final ObservableList<data> p = FXCollections.observableArrayList();
	final ObservableList<data> p3 = FXCollections.observableArrayList();
	final ObservableList<data> p5 = FXCollections.observableArrayList();
	final ObservableList<data> p6 = FXCollections.observableArrayList();
	final ObservableList<data> p7 = FXCollections.observableArrayList();
    private String snamee;
    private String sadnoo;
    private String scls;
    private String sperc;
    private String ssdob;
    
    private String ssatt;
    private int intatt;
    private int intcls;
    private int intadnoo;
    private int intperc;
    @FXML
	private Button add;
    @FXML
	private TextField namee;
    @FXML
	private TextField adnoo;
    @FXML
   	private TextField cls;
    @FXML
   	private TextField perc;
    @FXML
   	private TextField sdob;
    @FXML
   	private TextField satt;
    @FXML
   	private TextField scon;
    
    
	@FXML
	private TableView<data> tv;
	@FXML
	private TableView<data> tv111;
	@FXML
	private TableView<data> tv1111;
	@FXML
	private TableView<data> tv1;
	@FXML
	private TableView<data> tv2;
	@FXML
	private TableColumn<data, String> name;
	@FXML
	private TableColumn<data, Integer> sno;
	@FXML
	private TableColumn<data, String> adno;
	
	@FXML
	private TableColumn<data, Integer> per;
	@FXML
	private TableColumn<data, String> name1;
	@FXML
	private TableColumn<data, Integer> sno1;
	
	@FXML
	private TableColumn<data, String> name111;
	@FXML
	private TableColumn<data, Integer> sno111;
	@FXML
	private TableColumn<data, String> name1111;
	@FXML
	private TableColumn<data, Integer> sno1111;
	
	
	@FXML
	private TableColumn<data, Integer> adno1;
	@FXML
	private TableColumn<data, Float> att;
	@FXML
	private TableColumn<data, String> per1;
	@FXML
	private TableColumn<data, String> dob;
	@FXML
	private TableColumn<data, Double> cno;
	
	
	
	@FXML
	private TableColumn<data, String> name11;
	@FXML
	private TableColumn<data, Integer> sno11;
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		name.setCellValueFactory(new PropertyValueFactory<data,String>("Test_Name"));
		sno.setCellValueFactory(new PropertyValueFactory<data,Integer>("Max_Marks"));
		//adno.setCellValueFactory(new PropertyValueFactory<data,Integer>("Obt_Marks"));
		att.setCellValueFactory(new PropertyValueFactory<data,Float>("Time_Taken"));
		//cno.setCellValueFactory(new PropertyValueFactory<data,Double>("percentage_obtained"));
		per.setCellValueFactory(new PropertyValueFactory<data,Integer>("Attempt_no"));
	    adno.setCellValueFactory(new PropertyValueFactory<data,String>("Test_Branch"));
		dob.setCellValueFactory(new PropertyValueFactory<data,String>("Date_Time"));
		
		
		name1.setCellValueFactory(new PropertyValueFactory<data,String>("Test_Name"));
		sno1.setCellValueFactory(new PropertyValueFactory<data,Integer>("Max_Marks"));
		
		
		name11.setCellValueFactory(new PropertyValueFactory<data,String>("Test_Name"));
		sno11.setCellValueFactory(new PropertyValueFactory<data,Integer>("Max_Marks"));
		
		name111.setCellValueFactory(new PropertyValueFactory<data,String>("Test_Name"));
		sno111.setCellValueFactory(new PropertyValueFactory<data,Integer>("Max_Marks"));
		
		
		name1111.setCellValueFactory(new PropertyValueFactory<data,String>("Test_Name"));
		sno1111.setCellValueFactory(new PropertyValueFactory<data,Integer>("Max_Marks"));
		//adno1.setCellValueFactory(new PropertyValueFactory<data,Integer>("Attempt_no"));
		//timetaken.setCellValueFactory(new PropertyValueFactory<data,Float>("Time_Taken"));
		//percentage.setCellValueFactory(new PropertyValueFactory<data,Double>("percentage_obtained"));
		//per1.setCellValueFactory(new PropertyValueFactory<data,Integer>("Attempt_no"));
		//per1.setCellValueFactory(new PropertyValueFactory<data,String>("Test_Branch"));
		//datetime.setCellValueFactory(new PropertyValueFactory<data,String>("Date_Time"));
		
		
		 try {
			 
			 String sql4="CREATE TRIGGER 'df' after insert on 'MyTest' when new.Attempt_no>90 begin insert into MySch(Test_Name,Max_Marks,Attempt_no,Test_Branch) values(new.Test_Name,new.Max_Marks,10000,new.Obt_Marks) ;END";
			  System.out.println(sql4);
 Connection connectionn4 = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
//connection = SqliteConnection.connectDb();
//ps = connection.createStatement();
   pss4 = connectionn4.prepareStatement(sql4);
   pss4.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 try{
		 String sql4="CREATE TRIGGER 'df2' after insert on 'MyTest' when new.Test_Branch='science' begin insert into sci(Test_Name,Max_Marks,Attempt_no,Test_Branch) values(new.Test_Name,new.Max_Marks,10000,new.Obt_Marks) ;END";
		  System.out.println(sql4);
Connection connectionn4 = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
//connection = SqliteConnection.connectDb();
//ps = connection.createStatement();
pss4 = connectionn4.prepareStatement(sql4);
pss4.executeUpdate();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
		 
		 try{
			 String sql9="CREATE TRIGGER 'df3' after insert on 'MyTest' when new.Test_Branch='commerce' begin insert into com(Test_Name,Max_Marks,Attempt_no,Test_Branch) values(new.Test_Name,new.Max_Marks,10000,new.Obt_Marks) ;END";
			  System.out.println(sql9);
	Connection connectionn9 = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
	//connection = SqliteConnection.connectDb();
	//ps = connection.createStatement();
	pss4 = connectionn9.prepareStatement(sql9);
	pss4.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		 try{
			 String sql10="CREATE TRIGGER 'df4' after insert on 'MyTest' when new.Test_Branch='arts' begin insert into art(Test_Name,Max_Marks,Attempt_no,Test_Branch) values(new.Test_Name,new.Max_Marks,10000,new.Obt_Marks) ;END";
			  System.out.println(sql10);
	Connection connectionn10 = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
	//connection = SqliteConnection.connectDb();
	//ps = connection.createStatement();
	pss4 = connectionn10.prepareStatement(sql10);
	pss4.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		 
		 
		loadtable();
		
	
		add.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				snamee=namee.getText();
				sadnoo=adnoo.getText();
				scls=cls.getText();
				System.out.println(scls);
				sperc=perc.getText();
			 intadnoo = Integer.parseInt(sadnoo);
			 //intcls = Integer.parseInt(scls);
			 intperc = Integer.parseInt(sperc);
			 ssdob=sdob.getText();
			 ssatt=satt.getText();
			 intatt = Integer.parseInt(ssatt);
				
				try {
					 
			            
					String sql2 = "insert into MyTest (Test_Name,Max_Marks,Test_Branch,Attempt_no,Date_Time,Time_Taken) values('" +snamee+ "',"+intadnoo+",'"+scls+"',"+intperc+",'"+ssdob+"',"+intatt+")";
					System.out.println(sql2);
					
					Connection connectionn = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
					//connection = SqliteConnection.connectDb();
					//ps = connection.createStatement();
           pss = connectionn.prepareStatement(sql2);
          pss.executeUpdate();
          
         
         
         
         p.removeAll(p);
         p3.removeAll(p3);
         p5.removeAll(p5);
         p6.removeAll(p6);
         p7.removeAll(p7);
         loadtable();
         
         
         
         
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		

}
public void loadtable()
{
	String sql = "select * from MyTest";

	try
	{	//Connection connection;
	Connection connection = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
		//connection = SqliteConnection.connectDb();
		//ps = connection.createStatement();
	ps = connection.prepareStatement(sql);
	rs = ps.executeQuery();
		//rs = ps.executeQuery(sql);
		//System.out.println(rs.getInt("bla"));
		while (rs.next())
		{
					p.add(new data(
							rs.getString("Test_Name"),
							
							rs.getInt("Max_Marks"),
							rs.getInt("Obt_Marks"),
							rs.getDouble("percentage_obtained"),
							rs.getFloat("Time_Taken"),
							rs.getInt("Attempt_no"),
							rs.getString("Test_Branch"),
							rs.getString("Date_Time")
						));

			tv.setItems(p);
		}
	
		rs.close(); ps.close(); connection.close();
		
		
		
		String sql3 = "select * from MySch";

			//Connection connection;
		Connection connection3 = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
			//connection = SqliteConnection.connectDb();
			//ps = connection.createStatement();
		ps3 = connection3.prepareStatement(sql3);
		rs3 = ps3.executeQuery();
			//rs = ps.executeQuery(sql);
			//System.out.println(rs.getInt("bla"));
			while (rs3.next())
			{
						p3.add(new data(
								rs3.getString("Test_Name"),
								
								rs3.getInt("Max_Marks"),
								rs3.getInt("Obt_Marks"),
								rs3.getDouble("percentage_obtained"),
								rs3.getFloat("Time_Taken"),
								rs3.getInt("Attempt_no"),
								rs3.getString("Test_Branch"),
								rs3.getString("Date_Time")
							));

				tv1.setItems(p3);
			}
		
			rs3.close(); ps3.close(); //connection3.close();
			
			
			
			
			String sql5 = "select * from sci";

			//Connection connection;
		//Connection connection5 = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
		
			//connection = SqliteConnection.connectDb();
			//ps = connection.createStatement();
		ps5 = connection3.prepareStatement(sql5);
		rs5 = ps5.executeQuery();
			//rs = ps.executeQuery(sql);
			//System.out.println(rs.getInt("bla"));
			while (rs5.next())
			{
						p5.add(new data(
								rs5.getString("Test_Name"),
								
								rs5.getInt("Max_Marks"),
								rs5.getInt("Obt_Marks"),
								rs5.getDouble("percentage_obtained"),
								rs5.getFloat("Time_Taken"),
								rs5.getInt("Attempt_no"),
								rs5.getString("Test_Branch"),
								rs5.getString("Date_Time")
							));

				tv2.setItems(p5);
			}
		
			rs5.close(); ps5.close(); //connection3.close();
			
			
			
			String sql99 = "select * from art";

			//Connection connection;
		//Connection connection5 = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
		
			//connection = SqliteConnection.connectDb();
			//ps = connection.createStatement();
		ps7 = connection3.prepareStatement(sql99);
		rs7 = ps7.executeQuery();
			//rs = ps.executeQuery(sql);
			//System.out.println(rs.getInt("bla"));
			while (rs7.next())
			{
						p7.add(new data(
								rs7.getString("Test_Name"),
								
								rs7.getInt("Max_Marks"),
								rs7.getInt("Obt_Marks"),
								rs7.getDouble("percentage_obtained"),
								rs7.getFloat("Time_Taken"),
								rs7.getInt("Attempt_no"),
								rs7.getString("Test_Branch"),
								rs7.getString("Date_Time")
							));

				tv1111.setItems(p7);
			}
		
			rs7.close(); ps7.close(); //connection3.close();
			

			
				
				
				
				String sql6 = "select * from com";

				//Connection connection;
			//Connection connection5 = DriverManager.getConnection("jdbc:sqlite:data/info.sqlite");
			
				//connection = SqliteConnection.connectDb();
				//ps = connection.createStatement();
			ps6 = connection3.prepareStatement(sql6);
			rs6 = ps6.executeQuery();
				//rs = ps.executeQuery(sql);
				//System.out.println(rs.getInt("bla"));
				while (rs6.next())
				{
							p6.add(new data(
									rs6.getString("Test_Name"),
									
									rs6.getInt("Max_Marks"),
									rs6.getInt("Obt_Marks"),
									rs6.getDouble("percentage_obtained"),
									rs6.getFloat("Time_Taken"),
									rs6.getInt("Attempt_no"),
									rs6.getString("Test_Branch"),
									rs6.getString("Date_Time")
								));

					tv111.setItems(p6);
				}
			
				rs6.close(); ps6.close(); connection3.close();
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}
	catch (Exception e)
	{
			e.printStackTrace();
	}
		
	
	
	
	
	
	
	
	}
	
	

	
	
	
	
}
