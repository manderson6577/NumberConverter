import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends JFrame {

	
	public static void Menu() {
		
		Decimal dec = new Decimal();
		Hex hex = new Hex();
		Binary bin = new Binary();

	
		

		//JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame myWindow = new JFrame("Number System");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setLocation(100, 200);
		
		//Action buttons
		JButton btd = new JButton("Bin to Dec");
		JButton bth = new JButton("Bin to Hex");
		JButton dtb = new JButton("Dec to Bin");
		JButton dth = new JButton("Dec to Hex");
		JButton htb = new JButton("Hex to Bin");
		JButton htd = new JButton("Hex to Dec");
		
		//Button Panel
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(bth);
		panel.add(btd);
		panel.add(htd);
		panel.add(htb);
		panel.add(dth);
		panel.add(dtb);
		
		//turn it on
		myWindow.add(panel);
		myWindow.pack();
		myWindow.setVisible(true);
		
		//Action Listeners
	    btd.addActionListener(new ActionListener() {
	    	public void actionPerformed (ActionEvent e) {
	    		String btDec = JOptionPane.showInputDialog("Enter the binary to make decimal");
	    		int b =bin.convertBintoDecimal(btDec);
	    		System.out.println(b);
	    	}
	    });
	    bth.addActionListener(new ActionListener() {
	    	public void actionPerformed (ActionEvent e) {
	    		String btHex = JOptionPane.showInputDialog("Enter the binary to make hexadecimal");
	    		bin.convertBintoHex(btHex);
	    	}
	    });
	    htd.addActionListener(new ActionListener() {
	    	public void actionPerformed (ActionEvent e) {
	    		String htDec = JOptionPane.showInputDialog("Enter the hexadecimal to make decimal");
	    		hex.convertHextoDecimal(htDec);
	    	}
	    });
	    htb.addActionListener(new ActionListener() {
	    	public void actionPerformed (ActionEvent e) {
	    		String htBin = JOptionPane.showInputDialog("Enter the hexadecimal to make binary");
	    		char [] htBinArray = htBin.toCharArray();
	    		hex.convertHextoBinary(htBinArray);
	    	}
	    });
	    dtb.addActionListener(new ActionListener() {
	    	public void actionPerformed (ActionEvent e) {
	    		try{
		    		String dtBin = JOptionPane.showInputDialog("Enter the decimal to make binary");
		    		dec.convertDecimaltoBin(dtBin);
	    		}catch (NumberFormatException ae){
	    			System.out.println("You must enter a valid decimal number");
	    		}

	    	}
	    });
	    dth.addActionListener(new ActionListener() {
	    	public void actionPerformed (ActionEvent e) {
	    		try {
		    		String dtHex = JOptionPane.showInputDialog("Enter the decimal to make hexadecimal");
		    		dec.convertDecimaltoHex(dtHex);
	    		}catch (NumberFormatException ae){
	    			System.out.println("You must enter a valid decimal number");
	    		}
	    	}
	    });
		
		
		
		
		
		


	}
}
