package dfs;

//������
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Start extends JFrame
{
 int count = 0;//���-�� ������� �����
Start()
 {
 super("����"); //�������� ����
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�������� ��� ������� �� �������
 //����������� ��������
 JPanel panel0 = new JPanel();
 JTextField tf2 = new JTextField(16);
 JTextField tf3 = new JTextField(17);
 JButton btEnter = new JButton("����");
 JLabel timer = new JLabel();
 //���������� ���������
 panel0.add(new JLabel("������� �����"));
 panel0.add(tf3);
 panel0.add(new JLabel("������� ������"));
 panel0.add(tf2);
 panel0.add(btEnter);
 panel0.add(timer);
 
 
 //������ �����
 btEnter.addMouseListener(new MouseAdapter(){
	 public void mouseClicked(MouseEvent event) {
	if(tf3.getText().equals("login")) {// �����
		 if (tf2.getText().equals("123")) { //������
			
			 new Calculator();//�����������
			 setVisible(false);
		 }
		 else {//���� �� ��������
			 JOptionPane.showMessageDialog(null, "���� �� ��������");
			 count++;
			 if (count == 2) {
				 JOptionPane.showMessageDialog(null, "���������� �������� ����� � ������ ");//���� �� �������� ������ ���
				 System.exit(EXIT_ON_CLOSE);
				 
			 }
		 }
 }
 }});
 
 setContentPane(panel0);//��������� �����������
 setSize(350, 150);
 setVisible(true);
 }
public static void main(String[] args)
{
	 new Start();//�����
}
}