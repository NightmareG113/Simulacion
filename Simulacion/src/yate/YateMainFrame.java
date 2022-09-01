package yate;

	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
public class YateMainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	private YateMainFrameController controller;
	private JLabel lblBateria;
	private JLabel lblPanel;
	private JTextField txtVelocidad;
	
	public YateMainFrame(String pTitle, YateMainFrameController pController) {
		super(pTitle);
		controller = pController; 
		controller.setWindow(this); 

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1080, 780);
		this.setLocationRelativeTo(null);
		this.setLayout(null); // this allows this frame to locate the components with freedom in the screen
		this.setBackground(Color.white);
		this.initComponents();
		
		this.setVisible(true);		
	}
	private void initComponents() {
		JLabel Bateria1=new JLabel("Bateria 1");
		Bateria1.setBounds(10,20,160,20);
		this.add(Bateria1);
		
		JLabel Bateria2=new JLabel("Bateria 2");
		Bateria1.setBounds(10,50,160,20);
		this.add(Bateria2);
		
		JLabel Bateria3=new JLabel("Bateria 3");
		Bateria1.setBounds(10,90,160,20);
		this.add(Bateria3);
		
		JLabel Panel1=new JLabel("Panel 1");
		Bateria1.setBounds(10,130,160,20);
		this.add(Panel1);
		
		JLabel Panel2=new JLabel("Panel 2");
		Bateria1.setBounds(10,170,160,20);
		this.add(Panel2);
	}
}
