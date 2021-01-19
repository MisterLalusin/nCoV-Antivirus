import java.io.*;
import java.awt.*;
import javax.swing.*;
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Rectangle; 
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.*;
import javax.swing.JOptionPane; 
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;
import org.bson.conversions.Bson;
import com.mongodb.client.MongoCollection;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class nCoV_Antivirus  {

    public static void main(String[] args) {
    	logIn();
    }
    
    public static void logIn() {
    	Color blue1 = new Color(26, 154, 217);
       	Color blue2 = new Color(94, 185, 229);
       	Color blue3 = new Color(34, 131, 215);
       	
    	JFrame logInJFRM = new JFrame("nCoV Antivirus - Object Oriented Programming");
    	JPasswordField passwordJPSSWRFLD = new JPasswordField();
    	JTextField accountJTXTFLD = new JTextField();
    	JButton logINJBTTN = new JButton("LOG IN");
    	JLabel passwordJLabel = new JLabel("Password");
    	JLabel createNewAccountJLabel = new JLabel("<html><u>create new account</u></html>");
    	JLabel accountJLabel = new JLabel("Account");
    	JLabel lineHeaderJLabel = new JLabel("____________________________________________________________________________________________________________________________");
    	logINJBTTN.setBounds(790,30,80,22);
    	passwordJLabel.setBounds(640,5,140,22);
    	createNewAccountJLabel.setBounds(640,50,140,22);
    	accountJLabel.setBounds(490,5,140,22);
    	passwordJPSSWRFLD.setBounds(640,30,140,22);
    	accountJTXTFLD.setBounds(490,30,140,22);
    	lineHeaderJLabel.setBounds(5,-17,888,22);
    	lineHeaderJLabel.setForeground(blue3);
    	logINJBTTN.setBounds(790,30,80,22);
    	logInJFRM.add(logINJBTTN);
    	logInJFRM.add(passwordJPSSWRFLD);
    	logInJFRM.add(accountJTXTFLD);
    	logInJFRM.add(passwordJLabel);
    	logInJFRM.add(accountJLabel);
    	logInJFRM.add(createNewAccountJLabel);
    	logInJFRM.add(lineHeaderJLabel);
    	logInJFRM.setSize(888,666);
		logINJBTTN.setBackground(blue1);
		logINJBTTN.setForeground(Color.white);
    
    	
    	createNewAccountJLabel.setFont(new Font("Arial", Font.TRUETYPE_FONT, 12));
    	createNewAccountJLabel.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			createNewAccount();
    		}  
		}); 

       		
		JPanel confirmedCasesJPNL = new JPanel() {
    	@Override
     	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);
    	    Dimension arcs = new Dimension(50,50);
      		int width = getWidth();
        	int height = getHeight();
        	Graphics2D graphics = (Graphics2D) g;
       		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	graphics.setColor(blue1);
        	graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
        	graphics.setColor(blue1);
        	graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
     		}
  		};
		logInJFRM.add(confirmedCasesJPNL);
    	JLabel confirmedCasesJLBL = new JLabel("CONFIRMED CASES");
    	confirmedCasesJLBL.setFont(new Font("Arial", Font.BOLD, 16));
    	confirmedCasesJLBL.setForeground(Color.white);
    	confirmedCasesJLBL.setPreferredSize(new Dimension(200,32));
    	confirmedCasesJLBL.setHorizontalAlignment(JLabel.CENTER);
		confirmedCasesJPNL.add(confirmedCasesJLBL);
    	JLabel confirmedCasesLineJLBL = new JLabel("____________________________________________________");
    	confirmedCasesLineJLBL.setFont(new Font("Arial", Font.BOLD, 8));
    	confirmedCasesLineJLBL.setForeground(Color.white);
    	confirmedCasesLineJLBL.setHorizontalAlignment(JLabel.CENTER);
		confirmedCasesJPNL.add(confirmedCasesLineJLBL);
    	JLabel confirmedCasesCountJLBL = new JLabel("0");
    	confirmedCasesCountJLBL.setFont(new Font("OCR A Std", Font.PLAIN, 69));
    	confirmedCasesCountJLBL.setForeground(Color.white);
    	confirmedCasesCountJLBL.setPreferredSize(new Dimension(200,100));
    	confirmedCasesCountJLBL.setHorizontalAlignment(JLabel.CENTER);
		confirmedCasesJPNL.add(confirmedCasesCountJLBL);
  		confirmedCasesJPNL.setBounds(26,79,200,169);
  		confirmedCasesJPNL.setBackground(Color.WHITE);

		JPanel underInvestigationJPNL = new JPanel() {
    	@Override
     	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);
    	    Dimension arcs = new Dimension(50,50);
      		int width = getWidth();
        	int height = getHeight();
        	Graphics2D graphics = (Graphics2D) g;
       		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	graphics.setColor(blue2);
        	graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
        	graphics.setColor(blue2);
        	graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
     		}
  		};
		logInJFRM.add(underInvestigationJPNL);
    	JLabel underInvestigationJLBL = new JLabel("UNDER INVESTIGATION");
    	underInvestigationJLBL.setFont(new Font("Arial", Font.BOLD, 16));
    	underInvestigationJLBL.setForeground(Color.white);
    	underInvestigationJLBL.setPreferredSize(new Dimension(200,32));
    	underInvestigationJLBL.setHorizontalAlignment(JLabel.CENTER);
		underInvestigationJPNL.add(underInvestigationJLBL);
    	JLabel underInvestigationLineJLBL = new JLabel("____________________________________________________");
    	underInvestigationLineJLBL.setFont(new Font("Arial", Font.BOLD, 8));
    	underInvestigationLineJLBL.setForeground(Color.white);
    	underInvestigationLineJLBL.setHorizontalAlignment(JLabel.CENTER);
		underInvestigationJPNL.add(underInvestigationLineJLBL);
    	JLabel underInvestigationCountJLBL = new JLabel("0");
    	underInvestigationCountJLBL.setFont(new Font("OCR A Std", Font.PLAIN, 69));
    	underInvestigationCountJLBL.setForeground(Color.white);
    	underInvestigationCountJLBL.setPreferredSize(new Dimension(200,100));
    	underInvestigationCountJLBL.setHorizontalAlignment(JLabel.CENTER);
		underInvestigationJPNL.add(underInvestigationCountJLBL);
  		underInvestigationJPNL.setBounds(238,79,200,169);
  		underInvestigationJPNL.setBackground(Color.WHITE);
  		
  		JPanel dischargedJPNL = new JPanel() {
    	@Override
     	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);
    	    Dimension arcs = new Dimension(50,50);
      		int width = getWidth();
        	int height = getHeight();
        	Graphics2D graphics = (Graphics2D) g;
       		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	graphics.setColor(blue1);
        	graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
        	graphics.setColor(blue1);
        	graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
     		}
  		};
		logInJFRM.add(dischargedJPNL);
    	JLabel dischargedJLBL = new JLabel("DISCHARGED");
    	dischargedJLBL.setFont(new Font("Arial", Font.BOLD, 16));
    	dischargedJLBL.setForeground(Color.white);
    	dischargedJLBL.setPreferredSize(new Dimension(200,32));
    	dischargedJLBL.setHorizontalAlignment(JLabel.CENTER);
		dischargedJPNL.add(dischargedJLBL);
    	JLabel dischargedLineJLBL = new JLabel("____________________________________________________");
    	dischargedLineJLBL.setFont(new Font("Arial", Font.BOLD, 8));
    	dischargedLineJLBL.setForeground(Color.white);
    	dischargedLineJLBL.setHorizontalAlignment(JLabel.CENTER);
		dischargedJPNL.add(dischargedLineJLBL);
    	JLabel dischargedCountJLBL = new JLabel("0");
    	dischargedCountJLBL.setFont(new Font("OCR A Std", Font.PLAIN, 69));
    	dischargedCountJLBL.setForeground(Color.white);
    	dischargedCountJLBL.setPreferredSize(new Dimension(200,100));
    	dischargedCountJLBL.setHorizontalAlignment(JLabel.CENTER);
		dischargedJPNL.add(dischargedCountJLBL);
  		dischargedJPNL.setBounds(450,79,200,169);
  		dischargedJPNL.setBackground(Color.WHITE);
		
		JPanel deathTollJPNL = new JPanel() {
    	@Override
     	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);
    	    Dimension arcs = new Dimension(50,50);
      		int width = getWidth();
        	int height = getHeight();
        	Graphics2D graphics = (Graphics2D) g;
       		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	graphics.setColor(blue2);
        	graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
        	graphics.setColor(blue2);
        	graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
     		}
  		};
		logInJFRM.add(deathTollJPNL);
    	JLabel deathTollJLBL = new JLabel("DEATH TOLL");
    	deathTollJLBL.setFont(new Font("Arial", Font.BOLD, 16));
    	deathTollJLBL.setForeground(Color.white);
    	deathTollJLBL.setPreferredSize(new Dimension(200,32));
    	deathTollJLBL.setHorizontalAlignment(JLabel.CENTER);
		deathTollJPNL.add(deathTollJLBL);
    	JLabel deathTollLineJLBL = new JLabel("____________________________________________________");
    	deathTollLineJLBL.setFont(new Font("Arial", Font.BOLD, 8));
    	deathTollLineJLBL.setForeground(Color.white);
    	deathTollLineJLBL.setHorizontalAlignment(JLabel.CENTER);
		deathTollJPNL.add(deathTollLineJLBL);
    	JLabel deathTollCountJLBL = new JLabel("0");
    	deathTollCountJLBL.setFont(new Font("OCR A Std", Font.PLAIN, 69));
    	deathTollCountJLBL.setForeground(Color.white);
    	deathTollCountJLBL.setPreferredSize(new Dimension(200,100));
    	deathTollCountJLBL.setHorizontalAlignment(JLabel.CENTER);
		deathTollJPNL.add(deathTollCountJLBL);
  		deathTollJPNL.setBounds(662,79,200,169);
  		deathTollJPNL.setBackground(Color.WHITE);
		
		
    	ImagePanel panel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/logInBG.png").getImage());
    	panel.setBounds(0,5,800,666);
        panel.setSize(888,666);
   		logInJFRM.getContentPane().add(panel);
   		
    	logInJFRM.setLayout(null);
    	logInJFRM.setVisible(true);
		logInJFRM.setLocationRelativeTo(null);
		logInJFRM.setResizable(false);
    	logInJFRM.getContentPane().setBackground(Color.WHITE);
    	logInJFRM.setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));
	
	
		MongoClient mongoClient = new MongoClient("localhost");

		DB db = mongoClient.getDB("coronaDB");	
		DBCollection col = db.getCollection("data");

		DBCursor cur = col.find();
		
		for (DBObject doc : cur) {
  		  String type = (String) doc.get("type");
  		  String count = (String) doc.get("count");
  		  if (type.equals("box1")) {
  		  	confirmedCasesCountJLBL.setText(count);
  		  }
  		  else if (type.equals("box2")) {
  		  	underInvestigationCountJLBL.setText(count);
  		  }
  		  else if (type.equals("box3")) {
  		  	dischargedCountJLBL.setText(count);
  		  }
  		  else if (type.equals("box4")) {
  		  	deathTollCountJLBL.setText(count);
  		  }
		}
		
		logINJBTTN.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			String account = accountJTXTFLD.getText().toString();
    			String password = passwordJPSSWRFLD.getText().toString();
    			if (account.length() != 0 && password.length() != 0) {
    				
    				MongoClient mongoClient = new MongoClient("localhost");
			
					DB db = mongoClient.getDB("coronaDB");	
					DBCollection col = db.getCollection("users");
			
					DBCursor cur = col.find();
					
					boolean accountMatched = false;
					boolean isAdmin = false;
					String activeUser = "";
					
					for (DBObject doc : cur) {
			  		  String db_first_name = (String) doc.get("first_name");
			  		  String db_last_name = (String) doc.get("last_name");
			  		  String db_user_name = (String) doc.get("user_name");
			  		  String db_password = (String) doc.get("password");
			  		  String db_user_level = (String) doc.get("user_level");
			  		  if (account.equals(db_user_name) == true && password.equals(db_password) == true){
			  		  	accountMatched = true;
			  		  	activeUser = db_first_name + " " + db_last_name; 
			  		  	if (db_user_level.equals("admin")) {
			  		  		isAdmin = true;
			  		  	}
			  		  }
					}
					
					if (accountMatched == true) {
						if (isAdmin == true) {
							admin(activeUser);
							logInJFRM.dispose();
						}
						else {
							user(activeUser);
							logInJFRM.dispose();
						}	
    				}
					else {
    					JOptionPane.showMessageDialog(null, "LOG IN FAILED","WARNING!", JOptionPane.WARNING_MESSAGE);
					}
    				
    			}
    			else {
    				JOptionPane.showMessageDialog(null, "SOMETHING IS MISSING", "WARNING!", JOptionPane.WARNING_MESSAGE);
    			}
    		}  
		}); 
    }
    
    public static void createNewAccount() {
    	Color blue1 = new Color(26, 154, 217);
       	Color blue2 = new Color(94, 185, 229);
       	Color blue3 = new Color(34, 131, 215);
    	
    	JFrame createNewAccountJFRM = new JFrame("Create New Account");
    	JPasswordField passwordJPSSWRFLD = new JPasswordField();
    	JPasswordField confirmPasswordJPSSWRFLD = new JPasswordField();
    	JTextField firstNameJTXTFLD = new JTextField();
    	JTextField lastNameJTXTFLD = new JTextField();
    	JTextField userNameJTXTFLD = new JTextField();
    	JButton registerJBTTN = new JButton("REGISTER");
    	JLabel passwordJLabel = new JLabel("Password");
    	JLabel confirmPasswordJLabel = new JLabel("Confirm Password");
    	JLabel firstNameJLabel = new JLabel("First Name");
    	JLabel lastNameJLabel = new JLabel("Last Name");
    	JLabel userNameJLabel = new JLabel("User Name");
    	JLabel lineHeaderJLabel = new JLabel("______________________________________________________________");
    	registerJBTTN.setBounds(330,275,100,22);
    	passwordJLabel.setBounds(150,160,140,22);
    	firstNameJLabel.setBounds(150,5,140,22);
    	lastNameJLabel.setBounds(150,55,140,22);
    	userNameJLabel.setBounds(150,105,140,22);
    	passwordJPSSWRFLD.setBounds(150,185,280,22);
    	confirmPasswordJPSSWRFLD.setBounds(150,240,280,22);
    	confirmPasswordJLabel.setBounds(150,215,280,22);
    	firstNameJTXTFLD.setBounds(150,30,280,22);
    	lastNameJTXTFLD.setBounds(150,80,280,22);
    	userNameJTXTFLD.setBounds(150,130,280,22);
    	lineHeaderJLabel.setBounds(5,-17,888,22);
    	lineHeaderJLabel.setForeground(blue3);
    	createNewAccountJFRM.add(registerJBTTN);
    	createNewAccountJFRM.add(passwordJPSSWRFLD);
    	createNewAccountJFRM.add(confirmPasswordJPSSWRFLD);
    	createNewAccountJFRM.add(confirmPasswordJLabel);
    	createNewAccountJFRM.add(firstNameJTXTFLD);
    	createNewAccountJFRM.add(lastNameJTXTFLD);
    	createNewAccountJFRM.add(userNameJTXTFLD);
    	createNewAccountJFRM.add(passwordJLabel);
    	createNewAccountJFRM.add(firstNameJLabel);
    	createNewAccountJFRM.add(lastNameJLabel);
    	createNewAccountJFRM.add(userNameJLabel);
    	createNewAccountJFRM.add(lineHeaderJLabel);
    	createNewAccountJFRM.setSize(450,347);
		registerJBTTN.setBackground(blue1);
		registerJBTTN.setForeground(Color.white);
    
    
    	ImagePanel panel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/coronaPopUPBG.png").getImage());
    	panel.setBounds(0,0,800,666);
        panel.setSize(240,347);
   		createNewAccountJFRM.getContentPane().add(panel);
    
    	createNewAccountJFRM.setLayout(null);
    	createNewAccountJFRM.setVisible(true);
		createNewAccountJFRM.setLocationRelativeTo(null);
		createNewAccountJFRM.setResizable(false);
    	createNewAccountJFRM.getContentPane().setBackground(Color.WHITE);
    	createNewAccountJFRM.setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));
    
  		registerJBTTN.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			String fName = firstNameJTXTFLD.getText().toString();
    			String lName = lastNameJTXTFLD.getText().toString();
    			String uName = userNameJTXTFLD.getText().toString();
    			String pass = passwordJPSSWRFLD.getText().toString();
    			String conpass = confirmPasswordJPSSWRFLD.getText().toString();
    			
    			if (fName.length() == 0 || lName.length() == 0 || uName.length() == 0 || pass.length() == 0 || conpass.length() == 0) {  			
					JOptionPane.showMessageDialog(null, "COMPLETE THE FIELDS!","WARNING", JOptionPane.WARNING_MESSAGE);
    			}
    			else if (pass.equals(conpass) == false) {
					JOptionPane.showMessageDialog(null, "PASSWORD DO NOT MATCH!","WARNING", JOptionPane.WARNING_MESSAGE);
    			}
    			else if (pass.length() < 8) {
					JOptionPane.showMessageDialog(null, "PASSWORD MUST BE ATLEAST 8 CHARACTERS","WARNING", JOptionPane.WARNING_MESSAGE);
    			}
    			else {
    				MongoClient mongoClient = new MongoClient("localhost");
			
					DB db = mongoClient.getDB("coronaDB");	
					DBCollection col = db.getCollection("users");
			
					DBCursor cur = col.find();
					
					boolean uNameNotAvailable = false;
					
					for (DBObject doc : cur) {
			  		  String db_first_name = (String) doc.get("first_name");
			  		  String db_last_name = (String) doc.get("last_name");
			  		  String db_user_name = (String) doc.get("user_name");
			  		  String db_password = (String) doc.get("password");
			  		  String db_user_level = (String) doc.get("user_level");
			  		  if (uName.toLowerCase().equals(db_user_name.toLowerCase()) == true){
			  		  	uNameNotAvailable = true;
			  		  }
					}
					
					if (uNameNotAvailable == true) {
						JOptionPane.showMessageDialog(null, "USER NAME IS NOT AVAILABLE","WARNING", JOptionPane.WARNING_MESSAGE);
					}
					else {
						MongoCollection<Document> collection = new MongoClient().getDatabase("coronaDB").getCollection("users");
						addNewUser(collection, fName, lName, uName, pass);
						createNewAccountJFRM.dispose();
					}
    			}
    		}  
		});
    
    }
    
    private static void addNewUser(MongoCollection<Document> col, String fName, String lName, String uName, String pass) {
        Document emp1 = new Document();
        emp1.put("first_name", fName);
        emp1.put("last_name", lName);
        emp1.put("user_name", uName);
        emp1.put("password", pass);
        emp1.put("user_level", "user");
        col.insertOne(emp1);
    }
    
    public static void admin(String adminName) {
    	Color blue1 = new Color(26, 154, 217);
       	Color blue2 = new Color(94, 185, 229);
       	Color blue3 = new Color(34, 131, 215);
       	
    	JFrame adminJFRM = new JFrame("Administrator - " + adminName);
    	JButton logOutJBTTN = new JButton("LOG OUT");
    	JLabel lineHeaderJLabel = new JLabel("____________________________________________________________________________________________________________________________");
    	lineHeaderJLabel.setBounds(5,-17,888,22);
    	lineHeaderJLabel.setForeground(blue3);
    	logOutJBTTN.setBounds(790,30,80,22);
    	adminJFRM.add(logOutJBTTN);
    	adminJFRM.add(lineHeaderJLabel);
    	adminJFRM.setSize(888,666);
		logOutJBTTN.setBackground(blue1);
		logOutJBTTN.setForeground(Color.white);
    
    	logOutJBTTN.setBounds(770,0,90,22);
       		
		JPanel confirmedCasesJPNL = new JPanel() {
    	@Override
     	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);
    	    Dimension arcs = new Dimension(50,50);
      		int width = getWidth();
        	int height = getHeight();
        	Graphics2D graphics = (Graphics2D) g;
       		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	graphics.setColor(blue1);
        	graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
        	graphics.setColor(blue1);
        	graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
     		}
  		};
		adminJFRM.add(confirmedCasesJPNL);
    	JLabel confirmedCasesJLBL = new JLabel("CONFIRMED CASES");
    	confirmedCasesJLBL.setFont(new Font("Arial", Font.BOLD, 16));
    	confirmedCasesJLBL.setForeground(Color.white);
    	confirmedCasesJLBL.setPreferredSize(new Dimension(200,32));
    	confirmedCasesJLBL.setHorizontalAlignment(JLabel.CENTER);
		confirmedCasesJPNL.add(confirmedCasesJLBL);
    	JLabel confirmedCasesLineJLBL = new JLabel("____________________________________________________");
    	confirmedCasesLineJLBL.setFont(new Font("Arial", Font.BOLD, 8));
    	confirmedCasesLineJLBL.setForeground(Color.white);
    	confirmedCasesLineJLBL.setHorizontalAlignment(JLabel.CENTER);
		confirmedCasesJPNL.add(confirmedCasesLineJLBL);
    	JLabel confirmedCasesCountJLBL = new JLabel("0");
    	confirmedCasesCountJLBL.setFont(new Font("OCR A Std", Font.PLAIN, 69));
    	confirmedCasesCountJLBL.setForeground(Color.white);
    	confirmedCasesCountJLBL.setPreferredSize(new Dimension(200,100));
    	confirmedCasesCountJLBL.setHorizontalAlignment(JLabel.CENTER);
		confirmedCasesJPNL.add(confirmedCasesCountJLBL);
  		confirmedCasesJPNL.setBounds(26,79,200,169);
  		confirmedCasesJPNL.setBackground(Color.WHITE);
		
		JPanel underInvestigationJPNL = new JPanel() {
    	@Override
     	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);
    	    Dimension arcs = new Dimension(50,50);
      		int width = getWidth();
        	int height = getHeight();
        	Graphics2D graphics = (Graphics2D) g;
       		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	graphics.setColor(blue2);
        	graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
        	graphics.setColor(blue2);
        	graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
     		}
  		};
		adminJFRM.add(underInvestigationJPNL);
    	JLabel underInvestigationJLBL = new JLabel("UNDER INVESTIGATION");
    	underInvestigationJLBL.setFont(new Font("Arial", Font.BOLD, 16));
    	underInvestigationJLBL.setForeground(Color.white);
    	underInvestigationJLBL.setPreferredSize(new Dimension(200,32));
    	underInvestigationJLBL.setHorizontalAlignment(JLabel.CENTER);
		underInvestigationJPNL.add(underInvestigationJLBL);
    	JLabel underInvestigationLineJLBL = new JLabel("____________________________________________________");
    	underInvestigationLineJLBL.setFont(new Font("Arial", Font.BOLD, 8));
    	underInvestigationLineJLBL.setForeground(Color.white);
    	underInvestigationLineJLBL.setHorizontalAlignment(JLabel.CENTER);
		underInvestigationJPNL.add(underInvestigationLineJLBL);
    	JLabel underInvestigationCountJLBL = new JLabel("0");
    	underInvestigationCountJLBL.setFont(new Font("OCR A Std", Font.PLAIN, 69));
    	underInvestigationCountJLBL.setForeground(Color.white);
    	underInvestigationCountJLBL.setPreferredSize(new Dimension(200,100));
    	underInvestigationCountJLBL.setHorizontalAlignment(JLabel.CENTER);
		underInvestigationJPNL.add(underInvestigationCountJLBL);
  		underInvestigationJPNL.setBounds(238,79,200,169);
  		underInvestigationJPNL.setBackground(Color.WHITE);
  		
  		JPanel dischargedJPNL = new JPanel() {
    	@Override
     	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);
    	    Dimension arcs = new Dimension(50,50);
      		int width = getWidth();
        	int height = getHeight();
        	Graphics2D graphics = (Graphics2D) g;
       		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	graphics.setColor(blue1);
        	graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
        	graphics.setColor(blue1);
        	graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
     		}
  		};
		adminJFRM.add(dischargedJPNL);
    	JLabel dischargedJLBL = new JLabel("DISCHARGED");
    	dischargedJLBL.setFont(new Font("Arial", Font.BOLD, 16));
    	dischargedJLBL.setForeground(Color.white);
    	dischargedJLBL.setPreferredSize(new Dimension(200,32));
    	dischargedJLBL.setHorizontalAlignment(JLabel.CENTER);
		dischargedJPNL.add(dischargedJLBL);
    	JLabel dischargedLineJLBL = new JLabel("____________________________________________________");
    	dischargedLineJLBL.setFont(new Font("Arial", Font.BOLD, 8));
    	dischargedLineJLBL.setForeground(Color.white);
    	dischargedLineJLBL.setHorizontalAlignment(JLabel.CENTER);
		dischargedJPNL.add(dischargedLineJLBL);
    	JLabel dischargedCountJLBL = new JLabel("0");
    	dischargedCountJLBL.setFont(new Font("OCR A Std", Font.PLAIN, 69));
    	dischargedCountJLBL.setForeground(Color.white);
    	dischargedCountJLBL.setPreferredSize(new Dimension(200,100));
    	dischargedCountJLBL.setHorizontalAlignment(JLabel.CENTER);
		dischargedJPNL.add(dischargedCountJLBL);
  		dischargedJPNL.setBounds(450,79,200,169);
  		dischargedJPNL.setBackground(Color.WHITE);
		
		JPanel deathTollJPNL = new JPanel() {
    	@Override
     	protected void paintComponent(Graphics g) {
        	super.paintComponent(g);
    	    Dimension arcs = new Dimension(50,50);
      		int width = getWidth();
        	int height = getHeight();
        	Graphics2D graphics = (Graphics2D) g;
       		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        	graphics.setColor(blue2);
        	graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
        	graphics.setColor(blue2);
        	graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
     		}
  		};
		adminJFRM.add(deathTollJPNL);
    	JLabel deathTollJLBL = new JLabel("DEATH TOLL");
    	deathTollJLBL.setFont(new Font("Arial", Font.BOLD, 16));
    	deathTollJLBL.setForeground(Color.white);
    	deathTollJLBL.setPreferredSize(new Dimension(200,32));
    	deathTollJLBL.setHorizontalAlignment(JLabel.CENTER);
		deathTollJPNL.add(deathTollJLBL);
    	JLabel deathTollLineJLBL = new JLabel("____________________________________________________");
    	deathTollLineJLBL.setFont(new Font("Arial", Font.BOLD, 8));
    	deathTollLineJLBL.setForeground(Color.white);
    	deathTollLineJLBL.setHorizontalAlignment(JLabel.CENTER);
		deathTollJPNL.add(deathTollLineJLBL);
    	JLabel deathTollCountJLBL = new JLabel("0");
    	deathTollCountJLBL.setFont(new Font("OCR A Std", Font.PLAIN, 69));
    	deathTollCountJLBL.setForeground(Color.white);
    	deathTollCountJLBL.setPreferredSize(new Dimension(200,100));
    	deathTollCountJLBL.setHorizontalAlignment(JLabel.CENTER);
		deathTollJPNL.add(deathTollCountJLBL);
  		deathTollJPNL.setBounds(662,79,200,169);
  		deathTollJPNL.setBackground(Color.WHITE);
		
		
    	ImagePanel panel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/logInBG.png").getImage());
    	panel.setBounds(0,5,800,666);
        panel.setSize(888,666);
   		adminJFRM.getContentPane().add(panel);
   		
    	adminJFRM.setLayout(null);
    	adminJFRM.setVisible(true);
		adminJFRM.setLocationRelativeTo(null);
		adminJFRM.setResizable(false);
    	adminJFRM.getContentPane().setBackground(Color.WHITE);
    	adminJFRM.setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));
	
	
		MongoClient mongoClient = new MongoClient("localhost");

		DB db = mongoClient.getDB("coronaDB");	
		DBCollection col = db.getCollection("data");

		DBCursor cur = col.find();
		
		for (DBObject doc : cur) {
  		  String type = (String) doc.get("type");
  		  String count = (String) doc.get("count");
  		  if (type.equals("box1")) {
  		  	confirmedCasesCountJLBL.setText(count);
  		  }
  		  else if (type.equals("box2")) {
  		  	underInvestigationCountJLBL.setText(count);
  		  }
  		  else if (type.equals("box3")) {
  		  	dischargedCountJLBL.setText(count);
  		  }
  		  else if (type.equals("box4")) {
  		  	deathTollCountJLBL.setText(count);
  		  }
		}
		
		logOutJBTTN.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			adminJFRM.dispose();
    			logIn();
    		}  
		}); 
			  		
  		confirmedCasesJPNL.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			String response = JOptionPane.showInputDialog(null, "CONFIRMED CASES", "UPDATE", JOptionPane.QUESTION_MESSAGE);
    			if (response.length() != 0) { 
    				
    				try {
    					int dataCount = Integer.parseInt(response);
    					if (dataCount >= 0) {
    						MongoCollection<Document> collection = new MongoClient().getDatabase("coronaDB").getCollection("data");
							Bson filter = new Document("type", "box1");
							Bson newValue = new Document("count", ""+dataCount);
							Bson updateOperationDocument = new Document("$set", newValue);
							collection.updateOne(filter, updateOperationDocument);
	    					adminJFRM.dispose();
	    					admin(adminName);
    					}
    					else {
							JOptionPane.showMessageDialog(null, "INVALID INPUT","WARNING", JOptionPane.WARNING_MESSAGE);
    					}
    				
    				}
    				catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "INVALID INPUT","WARNING", JOptionPane.WARNING_MESSAGE);
    				}

    			}
    		}  
		}); 
			
		underInvestigationJPNL.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			String response = JOptionPane.showInputDialog(null, "UNDER INVESTIGATION", "UPDATE", JOptionPane.QUESTION_MESSAGE);
    			if (response.length() != 0) { 
    				
    				try {
    					int dataCount = Integer.parseInt(response);
    					if (dataCount >= 0) {
    						MongoCollection<Document> collection = new MongoClient().getDatabase("coronaDB").getCollection("data");
							Bson filter = new Document("type", "box2");
							Bson newValue = new Document("count", ""+dataCount);
							Bson updateOperationDocument = new Document("$set", newValue);
							collection.updateOne(filter, updateOperationDocument);
	    					adminJFRM.dispose();
	    					admin(adminName);
    					}
    					else {
							JOptionPane.showMessageDialog(null, "INVALID INPUT","WARNING", JOptionPane.WARNING_MESSAGE);
    					}
    				}
    				catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "INVALID INPUT","WARNING", JOptionPane.WARNING_MESSAGE);
    				}

    			}
    		}  
		}); 
			
		dischargedJPNL.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			String response = JOptionPane.showInputDialog(null, "DISCHARGED", "UPDATE", JOptionPane.QUESTION_MESSAGE);
    			if (response.length() != 0) { 
    				
    				try {
    					int dataCount = Integer.parseInt(response);
    					if (dataCount >= 0) {
	    					MongoCollection<Document> collection = new MongoClient().getDatabase("coronaDB").getCollection("data");
							Bson filter = new Document("type", "box3");
							Bson newValue = new Document("count", ""+dataCount);
							Bson updateOperationDocument = new Document("$set", newValue);
							collection.updateOne(filter, updateOperationDocument);
	    					adminJFRM.dispose();
	    					admin(adminName);
    					}
    					else {
							JOptionPane.showMessageDialog(null, "INVALID INPUT","WARNING", JOptionPane.WARNING_MESSAGE);
    					}
    				}
    				catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "INVALID INPUT","WARNING", JOptionPane.WARNING_MESSAGE);
    				}

    			}
    		}  
		}); 
			
		deathTollJPNL.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			String response = JOptionPane.showInputDialog(null, "DEATH TOLL", "UPDATE", JOptionPane.QUESTION_MESSAGE);
    			if (response.length() != 0) { 
    				
    				try {
    					int dataCount = Integer.parseInt(response);
    					if (dataCount >= 0) {
	    					MongoCollection<Document> collection = new MongoClient().getDatabase("coronaDB").getCollection("data");
							Bson filter = new Document("type", "box4");
							Bson newValue = new Document("count", ""+dataCount);
							Bson updateOperationDocument = new Document("$set", newValue);
							collection.updateOne(filter, updateOperationDocument);
	    					adminJFRM.dispose();
	    					admin(adminName);
    					}
    					else {
							JOptionPane.showMessageDialog(null, "INVALID INPUT","WARNING", JOptionPane.WARNING_MESSAGE);
    					}
    				}
    				catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "INVALID INPUT","WARNING", JOptionPane.WARNING_MESSAGE);
    				}

    			}
    		}  
		}); 
    }

    
    public static void user(String userName) {
    	Color blue1 = new Color(26, 154, 217);
       	Color blue2 = new Color(94, 185, 229);
       	Color blue3 = new Color(34, 131, 215);
       	
    	JFrame userJFRM = new JFrame("User - " + userName);
    	JButton logOutJBTTN = new JButton("LOG OUT");
    	JLabel accountJLabel = new JLabel("Account");
    	JLabel lineHeaderJLabel = new JLabel("____________________________________________________________________________________________________________________________");
    	lineHeaderJLabel.setBounds(5,-17,888,22);
    	lineHeaderJLabel.setForeground(blue3);
    	logOutJBTTN.setBounds(790,30,80,22);
    	userJFRM.add(logOutJBTTN);
    	userJFRM.add(lineHeaderJLabel);
    	userJFRM.setSize(888,666);
		logOutJBTTN.setBackground(blue1);
		logOutJBTTN.setForeground(Color.white);
    
    	logOutJBTTN.setBounds(770,0,90,22);
    	
    	ImagePanel protectPanel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/protectIC.png").getImage());
    	protectPanel.setBounds(44,39,250,250);
        protectPanel.setSize(250,250);
		protectPanel.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
				protectImage protect = new protectImage();
				protect.main(null);
    		}  
		}); 
   		userJFRM.getContentPane().add(protectPanel);
   		
   		
    	ImagePanel stressPanel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/stressIC.png").getImage());
    	stressPanel.setBounds(319,39,250,250);
        stressPanel.setSize(250,250);
		stressPanel.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {
				stressImage stress = new stressImage();
				stress.main(null);
    		}  
		}); 
   		userJFRM.getContentPane().add(stressPanel);
   		
    	ImagePanel foodPanel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/foodIC.png").getImage());
    	foodPanel.setBounds(594,39,250,250);
        foodPanel.setSize(250,250);
		foodPanel.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {
				foodImage food = new foodImage();
				food.main(null);
    		}  
		}); 
   		userJFRM.getContentPane().add(foodPanel);
    	
		ImagePanel shoppingPanel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/shoppingIC.png").getImage());
    	shoppingPanel.setBounds(44,314,250,250);
        shoppingPanel.setSize(250,250);
		shoppingPanel.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
				shoppingImage shopping = new shoppingImage();
				shopping.main(null);
    		}  
		}); 
   		userJFRM.getContentPane().add(shoppingPanel);
    	
    	ImagePanel travellingPanel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/travellingIC.png").getImage());
    	travellingPanel.setBounds(319,314,250,250);
        travellingPanel.setSize(250,250);
		travellingPanel.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {
				travellingImage travelling = new travellingImage();
				travelling.main(null);
    		}  
		}); 
   		userJFRM.getContentPane().add(travellingPanel);
    	
    	ImagePanel askPanel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/askIC.png").getImage());
    	askPanel.setBounds(594,314,250,250);
        askPanel.setSize(250,250);
		askPanel.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {
    			ask(userName);
    		}  
		}); 
   		userJFRM.getContentPane().add(askPanel);
    	
    	ImagePanel panel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/logInBG.png").getImage());
    	panel.setBounds(0,5,800,666);
        panel.setSize(888,666);
   		userJFRM.getContentPane().add(panel);
   		
    	userJFRM.setLayout(null);
    	userJFRM.setVisible(true);
		userJFRM.setLocationRelativeTo(null);
		userJFRM.setResizable(false);
    	userJFRM.getContentPane().setBackground(Color.WHITE);
    	userJFRM.setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));

		logOutJBTTN.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			userJFRM.dispose();
    			logIn();
    		}  
		}); 
		
    }
			
    public static void ask(String userName) {
    	Color blue1 = new Color(26, 154, 217);
       	Color blue2 = new Color(94, 185, 229);
       	Color blue3 = new Color(34, 131, 215);
       	
    	JFrame askJFRM = new JFrame("Ask - " + userName);
    	JLabel lineHeaderJLabel = new JLabel("__________________________________________________");
    	JLabel lineFooterJLabel = new JLabel("____________________________________________________");
    	JPanel chatJPNL = new JPanel();
    	JScrollPane scrollPN = new JScrollPane(chatJPNL);
    	JTextField chatJTXTFLD = new JTextField();
    	JPanel messageJPNL = new JPanel();
    	JButton sendJBTTN = new JButton("SEND");
    	JLabel chatJLBL = new JLabel();
		scrollPN.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );	
    	messageJPNL.setBackground(Color.white);	
   		sendJBTTN.setForeground(blue1);
    	lineHeaderJLabel.setBounds(5,-17,369,22);
    	lineHeaderJLabel.setForeground(blue3);
    	askJFRM.add(lineHeaderJLabel);
    	askJFRM.setSize(369,600);

		chatJPNL.setLayout(new BoxLayout(chatJPNL, BoxLayout.Y_AXIS));
    	chatJPNL.add(chatJLBL);
    	chatJLBL.setAlignmentX(Component.LEFT_ALIGNMENT);
    	
    	chatJPNL.setBackground(Color.white);
    	scrollPN.setBounds(0,1,363,500);
    	messageJPNL.setBounds(0,500,369,50);
    	chatJTXTFLD.setBounds(10,510,260,30);
    	sendJBTTN.setBounds(279,510,70,30);
    	lineFooterJLabel.setBounds(0,518,369,50);
    	lineFooterJLabel.setForeground(blue3);
    	messageJPNL.setBackground(blue1);
    	
    	
    	askJFRM.add(lineFooterJLabel);
    	askJFRM.add(sendJBTTN);
    	askJFRM.add(scrollPN);
    	askJFRM.add(chatJTXTFLD);
    	askJFRM.add(messageJPNL);
    	
    		
    	ImagePanel panel = new ImagePanel(new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/logInBG.png").getImage());
    	panel.setBounds(0,5,800,666);
        panel.setSize(888,666);
   		askJFRM.getContentPane().add(panel);
   		
    	askJFRM.setLayout(null);
    	askJFRM.setVisible(true);
		askJFRM.setLocationRelativeTo(null);
		askJFRM.setResizable(false);
    	askJFRM.getContentPane().setBackground(Color.WHITE);
    	askJFRM.setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));

		Timer t = new Timer();
		t.schedule(new TimerTask() {
    	@Override
    		public void run() {
				String message = "";
				
    			MongoClient mongoClient = new MongoClient("localhost");
			
				DB db = mongoClient.getDB("coronaDB");	
				DBCollection col = db.getCollection("chat");
					
				DBCursor cur = col.find();
						
				for (DBObject doc : cur) {
					String db_sender = (String) doc.get("sender");
					String db_message = (String) doc.get("message");
					message = message + db_sender + "<pre>" + db_message + "</pre><sup>-----------------------------------------------------------------------------------------------------</sup><br>";
				}
							
				chatJLBL.setText("<html><head><style>body {background-color: #ffffff;padding-left: 10px;padding-right: 10px;max-width: 236px;}div {word-wrap: break-word;width: 236px;}</style></head><body><div>" + message + "</div></body></html>");
    			
    		}
		}, 0, 500);
					
		sendJBTTN.addMouseListener(new MouseAdapter()  
		{  
    		public void mouseClicked(MouseEvent e)  {  
    			String chat = chatJTXTFLD.getText().toString();
    			if (chat.length() != 0) {
    				
					MongoCollection<Document> collection = new MongoClient().getDatabase("coronaDB").getCollection("chat");
    				addChat(collection, userName, chat);
    				    				
					new java.util.Timer().schedule( 
					        new java.util.TimerTask() {
					            @Override
					            public void run() {
								    JScrollBar vertical = scrollPN.getVerticalScrollBar();
									vertical.setValue( vertical.getMaximum()-1);
					            }
					        }, 
					        500 
					);

    			}
    		}  
		}); 
    }

    private static void addChat(MongoCollection<Document> col, String sender, String message) {
        Document emp1 = new Document();
        emp1.put("sender", sender);
        emp1.put("message", message);
        col.insertOne(emp1);
    }

}

class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
  
}

class protectImage extends JFrame  implements ActionListener {
	
	ImageIcon m[];
	JLabel l;
	JButton b,b1;
	int i,l1;
	JPanel p;

	public protectImage()
	{
		Color blue1 = new Color(26, 154, 217);
	    Color blue2 = new Color(94, 185, 229);
	    Color blue3 = new Color(34, 131, 215);
	    setLayout(new BorderLayout( ));
	    setSize(369,450);
	    setVisible(true);
	    JPanel p=new JPanel(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
	    getContentPane().setBackground(Color.black);
	    setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));
	    b=new JButton("<");
	    b1=new JButton(">");
		b.setBackground(blue1);
		b.setForeground(Color.white);
		b1.setBackground(blue1);
		b1.setForeground(Color.white);
	    p.add(b);
	    p.add(b1);
	    add(p,BorderLayout.SOUTH);
	    b.addActionListener(this);
	    b1.addActionListener(this);
	    m = new ImageIcon[4];
	    m[0] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/protect/001.png");
	    m[1] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/protect/002.png");
	    m[2] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/protect/003.png");
	    m[3] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/protect/004.png");
	    l = new JLabel();
	    l.setBounds(400, 0, getWidth(), getHeight());
	    add(l,BorderLayout.CENTER);
	    l.setIcon(m[0]);
	
	}
	
	public  void actionPerformed(ActionEvent e)
	{
	
	    if(e.getSource()==b)
	    {
	        if(i==0)
	        {
	            //JOptionPane.showMessageDialog(null,"This is First Image");
	        }
	        else
	            {
	            i=i-1;
	            l.setIcon(m[i]);
	        }
	    }
	    if(e.getSource()==b1)
	    {
	        if(i==m.length-1)
	        {
	            //JOptionPane.showMessageDialog(null,"This is LastImage");
	        }
	        else
	            {
	            i=i+1;
	            l.setIcon(m[i]);
	            }
	        }

     }
     
	public static void main(String args[])
	{
	    //protectImage i1 = new protectImage();
	}
}

class stressImage extends JFrame  implements ActionListener {
	
	ImageIcon m[];
	JLabel l;
	JButton b,b1;
	int i,l1;
	JPanel p;

	public stressImage()
	{
		Color blue1 = new Color(26, 154, 217);
	    Color blue2 = new Color(94, 185, 229);
	    Color blue3 = new Color(34, 131, 215);
	    setLayout(new BorderLayout( ));
	    setSize(369,600);
	    setVisible(true);
	    JPanel p=new JPanel(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
	    getContentPane().setBackground(Color.black);
	    setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));
	    b=new JButton("<");
	    b1=new JButton(">");
		b.setBackground(blue1);
		b.setForeground(Color.white);
		b1.setBackground(blue1);
		b1.setForeground(Color.white);
	    p.add(b);
	    p.add(b1);
	    add(p,BorderLayout.SOUTH);
	    b.addActionListener(this);
	    b1.addActionListener(this);
	    m = new ImageIcon[2];
	    m[0] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/stress/001.jpg");
	    m[1] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/stress/002.jpg");
	    l = new JLabel();
	    l.setBounds(400, 0, getWidth(), getHeight());
	    add(l,BorderLayout.CENTER);
	    l.setIcon(m[0]);
	
	}
	
	public  void actionPerformed(ActionEvent e)
	{
	
	    if(e.getSource()==b)
	    {
	        if(i==0)
	        {
	            //JOptionPane.showMessageDialog(null,"This is First Image");
	        }
	        else
	            {
	            i=i-1;
	            l.setIcon(m[i]);
	        }
	    }
	    if(e.getSource()==b1)
	    {
	        if(i==m.length-1)
	        {
	            //JOptionPane.showMessageDialog(null,"This is LastImage");
	        }
	        else
	            {
	            i=i+1;
	            l.setIcon(m[i]);
	            }
	        }

     }
     
	public static void main(String args[])
	{
	    //stressImage i1 = new stressImage();
	}
}

class foodImage extends JFrame  implements ActionListener {
	
	ImageIcon m[];
	JLabel l;
	JButton b,b1;
	int i,l1;
	JPanel p;

	public foodImage()
	{
		Color blue1 = new Color(26, 154, 217);
	    Color blue2 = new Color(94, 185, 229);
	    Color blue3 = new Color(34, 131, 215);
	    setLayout(new BorderLayout( ));
	    setSize(369,450);
	    setVisible(true);
	    JPanel p=new JPanel(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
	    getContentPane().setBackground(Color.black);
	    setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));
	    b=new JButton("<");
	    b1=new JButton(">");
		b.setBackground(blue1);
		b.setForeground(Color.white);
		b1.setBackground(blue1);
		b1.setForeground(Color.white);
	    p.add(b);
	    p.add(b1);
	    add(p,BorderLayout.SOUTH);
	    b.addActionListener(this);
	    b1.addActionListener(this);
	    m = new ImageIcon[3];
	    m[0] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/food/001.png");
	    m[1] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/food/002.png");
	    m[2] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/food/003.png");
	    l = new JLabel();
	    l.setBounds(400, 0, getWidth(), getHeight());
	    add(l,BorderLayout.CENTER);
	    l.setIcon(m[0]);
	
	}
	
	public  void actionPerformed(ActionEvent e)
	{
	
	    if(e.getSource()==b)
	    {
	        if(i==0)
	        {
	            //JOptionPane.showMessageDialog(null,"This is First Image");
	        }
	        else
	            {
	            i=i-1;
	            l.setIcon(m[i]);
	        }
	    }
	    if(e.getSource()==b1)
	    {
	        if(i==m.length-1)
	        {
	            //JOptionPane.showMessageDialog(null,"This is LastImage");
	        }
	        else
	            {
	            i=i+1;
	            l.setIcon(m[i]);
	            }
	        }

     }
     
	public static void main(String args[])
	{
	    //foodImage i1 = new foodImage();
	}
}

class shoppingImage extends JFrame  implements ActionListener {
	
	ImageIcon m[];
	JLabel l;
	JButton b,b1;
	int i,l1;
	JPanel p;

	public shoppingImage()
	{
		Color blue1 = new Color(26, 154, 217);
	    Color blue2 = new Color(94, 185, 229);
	    Color blue3 = new Color(34, 131, 215);
	    setLayout(new BorderLayout( ));
	    setSize(369,450);
	    setVisible(true);
	    JPanel p=new JPanel(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
	    getContentPane().setBackground(Color.black);
	    setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));
	    b=new JButton("<");
	    b1=new JButton(">");
		b.setBackground(blue1);
		b.setForeground(Color.white);
		b1.setBackground(blue1);
		b1.setForeground(Color.white);
	    p.add(b);
	    p.add(b1);
	    add(p,BorderLayout.SOUTH);
	    b.addActionListener(this);
	    b1.addActionListener(this);
	    m = new ImageIcon[3];
	    m[0] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/shopping/001.png");
	    m[1] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/shopping/002.png");
	    m[2] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/shopping/003.png");
	    l = new JLabel();
	    l.setBounds(400, 0, getWidth(), getHeight());
	    add(l,BorderLayout.CENTER);
	    l.setIcon(m[0]);
	
	}
	
	public  void actionPerformed(ActionEvent e)
	{
	
	    if(e.getSource()==b)
	    {
	        if(i==0)
	        {
	            //JOptionPane.showMessageDialog(null,"This is First Image");
	        }
	        else
	            {
	            i=i-1;
	            l.setIcon(m[i]);
	        }
	    }
	    if(e.getSource()==b1)
	    {
	        if(i==m.length-1)
	        {
	            //JOptionPane.showMessageDialog(null,"This is LastImage");
	        }
	        else
	            {
	            i=i+1;
	            l.setIcon(m[i]);
	            }
	        }

     }
     
	public static void main(String args[])
	{
	    //shoppingImage i1 = new shoppingImage();
	}
}

class travellingImage extends JFrame  implements ActionListener {
	
	ImageIcon m[];
	JLabel l;
	JButton b,b1;
	int i,l1;
	JPanel p;

	public travellingImage()
	{
		Color blue1 = new Color(26, 154, 217);
	    Color blue2 = new Color(94, 185, 229);
	    Color blue3 = new Color(34, 131, 215);
	    setLayout(new BorderLayout( ));
	    setSize(369,450);
	    setVisible(true);
	    JPanel p=new JPanel(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
	    getContentPane().setBackground(Color.black);
	    setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Projects/Programming/Java/nCoV Antivirus/src/appIcon.png"));
	    b=new JButton("<");
	    b1=new JButton(">");
		b.setBackground(blue1);
		b.setForeground(Color.white);
		b1.setBackground(blue1);
		b1.setForeground(Color.white);
	    p.add(b);
	    p.add(b1);
	    add(p,BorderLayout.SOUTH);
	    b.addActionListener(this);
	    b1.addActionListener(this);
	    m = new ImageIcon[5];
	    m[0] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/travelling/001.png");
	    m[1] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/travelling/002.png");
	    m[2] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/travelling/003.png");
	    m[3] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/travelling/004.png");
	    m[4] = new ImageIcon("E:/Projects/Programming/Java/nCoV Antivirus/src/travelling/005.png");
	    l = new JLabel();
	    l.setBounds(400, 0, getWidth(), getHeight());
	    add(l,BorderLayout.CENTER);
	    l.setIcon(m[0]);
	
	}
	
	public  void actionPerformed(ActionEvent e)
	{
	
	    if(e.getSource()==b)
	    {
	        if(i==0)
	        {
	            //JOptionPane.showMessageDialog(null,"This is First Image");
	        }
	        else
	            {
	            i=i-1;
	            l.setIcon(m[i]);
	        }
	    }
	    if(e.getSource()==b1)
	    {
	        if(i==m.length-1)
	        {
	            //JOptionPane.showMessageDialog(null,"This is LastImage");
	        }
	        else
	            {
	            i=i+1;
	            l.setIcon(m[i]);
	            }
	        }

     }
     
	public static void main(String args[])
	{
	    //travellingImage i1 = new travellingImage();
	}
}