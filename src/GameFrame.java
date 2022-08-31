import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	
	GamePanel panel;
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack(); //VELIKOST OKNA SE PRILAGODI VELIKOSTI IGRE (GamePanela-a)
		this.setVisible(true);
		this.setLocationRelativeTo(null);//DA SE IGRA PRIKAZE V SREDINI ZASLONA IN NE V LEVEM ZGORNJEM KOTU
	}

}
