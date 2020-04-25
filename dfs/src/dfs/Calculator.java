package dfs;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toxa1
 */
public class Calculator extends javax.swing.JPanel {

    public Calculator() {
    JFrame frame =new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    JPanel panel= new JPanel();
    panel.setLayout(new BorderLayout());
    JLabel razr =new JLabel("Разрешение камеры:");
    JLabel format =new JLabel("Формат сжатия:");
    JLabel speed =new JLabel("Скорость зжатия:");
    JLabel days =new JLabel("Глубина архива (количесво дней):");
    JLabel camers =new JLabel("Количество камер:");
    String items[]= {
    		"480p(720x480)",
    		"720p(1080x720)",
    		"1080p(1920x1080)"
    };
    JComboBox razrbox =new JComboBox(items);
    String items2[] ={
    		"MJPEG",
    		"H.264"
    };
    JComboBox formatbox =new JComboBox(items2);
    String items3[]= {
    		"30 кадров в секунду",
    		"25 кадров в секунду",
    		"20 кадров в секунду"
    };
    JComboBox speedbox= new JComboBox(items3);
    JTextField daysbox =new JTextField();
    JSpinner dayss = new JSpinner();
    }
   public static void main(String args[]) {
	   new Calculator().setVisible(true);;//запуск
   }
}
    