import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
   StringBuffer sb = new StringBuffer();
   JFrame frame = new JFrame();
   
   JPanel buttonContainer = new JPanel(new GridLayout(4,5));
   JTextField txtResult = new JTextField("0.0");
   JButton buttonZero = new JButton("0");
   JButton buttonOne = new JButton("1");
   JButton buttonTwo = new JButton("2");
   JButton buttonThree = new JButton("3");
   JButton buttonFour = new JButton("4");
   JButton buttonFive = new JButton("5");
   JButton buttonSix = new JButton("6");
   JButton buttonSeven = new JButton("7");
   JButton buttonEight = new JButton("8");
   JButton buttonNine = new JButton("9");
   JButton buttonAC = new JButton("AC");
   JButton buttonEquals = new JButton("=");
   JButton buttonAdd = new JButton("+");
   JButton buttonMultiply = new JButton("*");
   JButton buttonDivide = new JButton("/");
   JButton buttonSubtract = new JButton("_");
   JButton buttonPower = new JButton("^");
   JButton buttonNegative = new JButton("-");
   JButton buttonPi = new JButton("\u03C0");
   JButton buttonDec = new JButton(".");
   
   String result = "";
   InfixtoPostfix itf;
   
   public Calculator(){
     
      txtResult.setFont(new Font("Aria", Font.BOLD, 48));
      txtResult.setEnabled(false);
      txtResult.setMargin(new Insets(10, 10, 10, 10));
      txtResult.setHorizontalAlignment(JTextField.RIGHT);
      txtResult.setForeground(Color.BLACK);
      buttonOne. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonOne.setForeground(Color.BLACK);
      buttonOne.addActionListener(this);
      buttonTwo. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonTwo.setForeground(Color.BLACK);
      buttonTwo.addActionListener(this);
      buttonThree. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonThree.setForeground(Color.BLACK);
      buttonThree.addActionListener(this);
      buttonFour. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonFour.setForeground(Color.BLACK);
      buttonFour.addActionListener(this);
      buttonFive. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonFive.setForeground(Color.BLACK);
      buttonFive.addActionListener(this);
      buttonSix. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonSix.setForeground(Color.BLACK);
      buttonSix.addActionListener(this);
      buttonSeven. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonSeven.setForeground(Color.BLACK);
      buttonSeven.addActionListener(this);
      buttonEight. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonEight.setForeground(Color.BLACK);
      buttonEight.addActionListener(this);
      buttonNine. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonNine.setForeground(Color.BLACK);
      buttonNine.addActionListener(this);
      buttonZero. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonZero.setForeground(Color.BLACK);
      buttonZero.addActionListener(this);
      buttonAC. setFont(new Font("Arial", Font.BOLD, 28));
      buttonAC.setForeground(Color.RED);
      buttonAC.addActionListener(this);
      buttonEquals. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonEquals.setForeground(Color.BLUE);
      buttonEquals.addActionListener(this);
      buttonAdd. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonAdd.setForeground(Color.BLUE);
      buttonAdd.addActionListener(this);
      buttonSubtract. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonSubtract.setForeground(Color.BLUE);
      buttonSubtract.addActionListener(this);
      buttonMultiply. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonMultiply.setForeground(Color.BLUE);
      buttonMultiply.addActionListener(this);
      buttonDivide. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonDivide.setForeground(Color.BLUE);
      buttonDivide.addActionListener(this);
      buttonPower. setFont(new Font("Arial", Font.PLAIN, 32));
      buttonPower.setForeground(Color.BLUE);
      buttonPower.addActionListener(this);
      buttonNegative.setFont(new Font("Arial", Font.PLAIN, 32));
      buttonNegative.setForeground(Color.BLUE);
      buttonNegative.addActionListener(this);
      buttonPi.setFont(new Font("Arial", Font.PLAIN, 32));
      buttonPi.setForeground(Color.BLUE);
      buttonPi.addActionListener(this);
      buttonDec.setFont(new Font("Arial", Font.PLAIN, 32));
      buttonDec.setForeground(Color.BLACK);
      buttonDec.addActionListener(this);
      
      
      
      
      buttonContainer.add(buttonSeven); buttonContainer.add(buttonEight); buttonContainer.add(buttonNine); buttonContainer.add(buttonPower);buttonContainer.add(buttonAC);
      buttonContainer.add(buttonFour); buttonContainer.add(buttonFive); buttonContainer.add(buttonSix); buttonContainer.add(buttonMultiply);buttonContainer.add(buttonAdd);
      buttonContainer.add(buttonOne); buttonContainer.add(buttonTwo); buttonContainer.add(buttonThree); buttonContainer.add(buttonDivide);buttonContainer.add(buttonSubtract);
      buttonContainer.add(buttonNegative); buttonContainer.add(buttonZero); buttonContainer.add(buttonDec); buttonContainer.add(buttonPi);buttonContainer.add(buttonEquals); 
     
      
      frame.setLayout(new BorderLayout());
      frame.add(txtResult, BorderLayout.NORTH);
      frame.add(buttonContainer, BorderLayout.CENTER);
      
      frame.setResizable(false);
      frame.setSize(400,400);
      frame.setLocationRelativeTo(null);
      frame.setTitle("Simple Calculator (Modified)");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }//constructor 
   public void actionPerformed(ActionEvent e){
      
      String action = e.getActionCommand();
      sb.append(action);
      String result = sb.toString();
      switch (action){
         case"AC": result = "0.0";
          txtResult.setText(result);
          sb=new StringBuffer();
          break;
          case "\u03C0":
          sb = new StringBuffer();
          sb.append(3.14);
          txtResult.setText(result); ;
          break;
         case "=":
         itf =  new InfixtoPostfix(txtResult.getText().trim());
         result = itf.compute() + "";
         sb = new StringBuffer();
         sb.append(result);
         txtResult.setText(result);
      }
      
      txtResult.setText(result);
      
   }
   
   public static void main(String[] args){
 
      new Calculator();
    
   }
   
   
}