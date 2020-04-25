package dfs;

//импорт
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
 int count = 0;//кол-во попыток входа
Start()
 {
 super("Вход"); //название окна
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //жействие при нажатии на крестик
 //графические элементы
 JPanel panel0 = new JPanel();
 JTextField tf2 = new JTextField(16);
 JTextField tf3 = new JTextField(17);
 JButton btEnter = new JButton("Вход");
 JLabel timer = new JLabel();
 //добавление элементов
 panel0.add(new JLabel("Введите логин"));
 panel0.add(tf3);
 panel0.add(new JLabel("Введите пароль"));
 panel0.add(tf2);
 panel0.add(btEnter);
 panel0.add(timer);
 
 
 //кнопка входа
 btEnter.addMouseListener(new MouseAdapter(){
	 public void mouseClicked(MouseEvent event) {
	if(tf3.getText().equals("login")) {// логин
		 if (tf2.getText().equals("123")) { //пароль
			
			 new Calculator();//калькулятор
			 setVisible(false);
		 }
		 else {//вход не выполнен
			 JOptionPane.showMessageDialog(null, "Вход НЕ выполнен");
			 count++;
			 if (count == 2) {
				 JOptionPane.showMessageDialog(null, "Пожалуйста проверте логин и пароль ");//вход не выполнен второй раз
				 System.exit(EXIT_ON_CLOSE);
				 
			 }
		 }
 }
 }});
 
 setContentPane(panel0);//настройки отображения
 setSize(350, 150);
 setVisible(true);
 }
public static void main(String[] args)
{
	 new Start();//старт
}
}