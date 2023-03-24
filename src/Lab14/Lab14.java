package Lab14;

import java.awt.*;
import java.awt.event.*;

public class Lab14 extends Frame{
    Lab14(String s){
        super(s);
        setSize(400,400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void  windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });

        Label x1 = new Label("x =");
        TextField x2 = new TextField();
        x1.setBounds(50,50,50,20);
        x2.setBounds(100,50,50,20);
        add(x1);
        add(x2);

        Label y1 = new Label("y =");
        TextField y2 = new TextField();
        y1.setBounds(50,75,50,20);
        y2.setBounds(100,75,50,20);
        add(y1);
        add(y2);

        Label sum1 = new Label("sum =");
        TextField sum2 = new TextField();
        sum1.setBounds(50,100,50,20);
        sum2.setBounds(100,100,50,20);
        add(sum1);
        add(sum2);

        Button Calc = new Button("Calc");
        Calc.setBounds(50,130,75,20);
        Calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(x2.getText());
                int y = Integer.parseInt(y2.getText());
                int sum = x + y;
                sum2.setText(Integer.toString(sum));
            }
        });
        add(Calc);

        Button Clear = new Button("Clear");
        Clear.setBounds(50,150,75,20);
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x2.setText("");
                y2.setText("");
                sum2.setText("");
            }
        });
        add(Clear);
    }
    public static void main(String[] args) {
        new Lab14("Moya programa");
    }
}