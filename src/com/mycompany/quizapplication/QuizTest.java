package com.mycompany.quizapplication;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class QuizTest extends JFrame implements ActionListener {
    
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count=0, current=0, x=1, y=1, now=0;
    int m[]=new int[10];
    
    QuizTest(String s){
        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for(int i=0; i<5; i++) {
            radioButtons[i] =  new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
        }
        btnNext=new JButton("Next");
        btnResult=new JButton("Result");
        btnResult.setEnabled(false);  //result only visible but after answering all question only view result, code_line:143
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add (btnNext);
        add (btnResult);
        setData();
        label.setBounds (30,40,450,20);
        radioButtons[0].setBounds (50,80, 450, 20);
        radioButtons [1].setBounds (50,110,200,20);
        radioButtons [2].setBounds (50,140,200,20);
        radioButtons [3].setBounds (50,170,200,20);
        btnNext.setBounds (100,240, 100,30);
        btnResult.setBounds (270, 240, 100,30);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (null);
        setLocation(0,0);  // x,y direction of output box
        setVisible(true);  //output box is show  
        setSize(700,450);  //size of the output box
    }
    void setData() {
        radioButtons [4].setSelected(true);  //dout
        if (current==0){
        label.setText("01: Which is the world largest flower?");
        radioButtons[0].setText("Puya Raimondii");
        radioButtons [1].setText("Magnolia");
        radioButtons [2].setText("Sunflower");
        radioButtons [3].setText("Rafflesia");
        }
        if (current==1) {
        label.setText("02: Which is the world largest river? ");
        radioButtons[0].setText("Amazon");
        radioButtons[1].setText("Yangtze");
        radioButtons [2].setText("Nile");
        radioButtons [3].setText("Mississippi");
        }
        
        if (current==2) {
            label.setText("03: What is the National bird of India? ");
            radioButtons[0].setText("Peacock");
            radioButtons[1].setText("Pigeon");
            radioButtons [2].setText("Crow");
            radioButtons [3].setText("Parrot");
        }
        if (current==3) {
            label.setText("04: What is the National animal of India? ");
            radioButtons[0].setText("Horse");
            radioButtons[1].setText("Elephant");
            radioButtons [2].setText("Lion");
            radioButtons [3].setText("Tiger");
        }
        if (current==4) {
            label.setText("05: What is the National flower of India? ");
            radioButtons[0].setText("Lotus");
            radioButtons[1].setText("Rose");
            radioButtons [2].setText("Sunflower");
            radioButtons [3].setText("Lilly");
        }
        if (current==5){
            label.setText("06: Which is the fastest animal in the world?");
            radioButtons[0].setText("Cheetah");
            radioButtons [1].setText("Lion");
            radioButtons [2].setText("Horse");
            radioButtons [3].setText("Deer");
            }
        if (current==6) {
            label.setText("07: Which is the largest mountain in the world? ");
            radioButtons[0].setText("Kangchenjunga");
            radioButtons[1].setText("Mount K2");
            radioButtons [2].setText("Mount Everest");
            radioButtons [3].setText("Mount Cho Oyu");
            }
            if (current==7) {
                label.setText("08: Which is the smallest bird in the world?");
                radioButtons[0].setText("peocock");
                radioButtons[1].setText("Weebill");
                radioButtons [2].setText("Hummingbird");
                radioButtons [3].setText("Goldcrest");
            }
            if (current==8) {
                label.setText("09: Which is the largest animal in the world? ");
                radioButtons[0].setText("Blue Whale");
                radioButtons[1].setText("Colossal Squid");
                radioButtons [2].setText("African Elephant");
                radioButtons [3].setText("Giraffe");
            }
            if (current==9) {
                label.setText("10: What is national game of India? ");
                radioButtons[0].setText("Cricket");
                radioButtons[1].setText("Kabadi");
                radioButtons [2].setText("Hockey");
                radioButtons [3].setText("Football");
            }
            if (current==10){
                label.setText("11: Namib desert is located in?");
                radioButtons[0].setText("South America");
                radioButtons [1].setText("Africa");
                radioButtons [2].setText("North America");
                radioButtons [3].setText("Australia");
                }
            if (current==11) {
                label.setText("12: Which among the following is the lowest atmospheric layer? ");
                radioButtons[0].setText("Troposphere");
                radioButtons[1].setText("Stratosphere");
                radioButtons [2].setText("Thermosphere");
                radioButtons [3].setText("Mesosphere");
                }
                if (current==12) {
                    label.setText("13: April 7 is celebrated as? ");
                    radioButtons[0].setText("World Day of Social Justice");
                    radioButtons[1].setText("International Mother Language Day");
                    radioButtons [2].setText("International Women’s Day");
                    radioButtons [3].setText("World Health Day");
                }
                if (current==13) {
                    label.setText("14: The headquarters of Food and Agriculture Organisation (FAO) is located in? ");
                    radioButtons[0].setText("New York City");
                    radioButtons[1].setText("Geneva");
                    radioButtons [2].setText("Rome");
                    radioButtons [3].setText("Washington DC");
                }
                if (current==14) {
                    label.setText("15: Which among the following is the tallest building in the world?? ");
                    radioButtons[0].setText("Burj Khalifa");
                    radioButtons[1].setText("Shanghai Tower");
                    radioButtons [2].setText("Lotte World Tower");
                    radioButtons [3].setText("Shanghai World Fina");
                }
                if (current==15){
                    label.setText("16: Which is the Largest Dams in the World");
                    radioButtons[0].setText("Oahe Dam");
                    radioButtons [1].setText("Nurek Dam");
                    radioButtons [2].setText("Tarbela Dam");
                    radioButtons [3].setText("Fort Peck Dam");
                    }              
                if (current==16) {
                    label.setText("17: What is the tallest waterfall in the world? ");
                    radioButtons[0].setText("Angel Falls, Venezuela");
                    radioButtons[1].setText("Niagara Falls, New York");
                    radioButtons [2].setText("Wailua Falls, Hawaii");
                    radioButtons [3].setText("Sutherland Falls, New Zealand");
                    } 
                if (current==17) {
                        label.setText("18: Which is the fastest bird in the world? ");
                        radioButtons[0].setText("Bald Eagle");
                        radioButtons[1].setText("Peregrine Falcon");
                        radioButtons [2].setText("Hummingbird");
                        radioButtons [3].setText("Raven");
                    }
                    if (current==18) {
                        label.setText("19: Which of these animals has the ability to laugh? ");
                        radioButtons[0].setText("Dog");
                        radioButtons[1].setText("Whale");
                        radioButtons [2].setText("Bear");
                        radioButtons [3].setText("Rat");
                    }
                    if (current==19) {
                        label.setText("20: Which of these foods will never spoil? ");
                        radioButtons[0].setText("Honey");
                        radioButtons[1].setText("Beef Jerky");
                        radioButtons [2].setText("Cereal");
                        radioButtons [3].setText("Beans");
                    }
                    if (current==20){
                        label.setText("21: About how many scents can a human nose remember");
                        radioButtons[0].setText("Around 500");
                        radioButtons [1].setText("Around 10,000");
                        radioButtons [2].setText("Around 50,000");
                        radioButtons [3].setText("Around 1 million");
                    }
                    if (current==21) {
                        label.setText("22: What dog has a water-resistant coat and webbed feet? ");
                        radioButtons[0].setText("Chihuahua");
                        radioButtons[1].setText("Labrador");
                        radioButtons [2].setText("St. Bernard");
                        radioButtons [3].setText("Newfoundland");
                        }
                        if (current==22) {
                            label.setText("23: How many rings appear on the Olympic flag?? ");
                            radioButtons[0].setText("1");
                            radioButtons[1].setText("6");
                            radioButtons [2].setText("5");
                            radioButtons [3].setText("7");
                        }
                        if (current==23) {
                            label.setText("24: What is the general name for a group of wolves? ");
                            radioButtons[0].setText("Pack");
                            radioButtons[1].setText("School");
                            radioButtons [2].setText("Flock");
                            radioButtons [3].setText("flack");
                        }
                if (current==24) {
                            label.setText("25.How many stripes are there on the US flag? ");
                            radioButtons[0].setText("10");
                            radioButtons[1].setText("11");
                            radioButtons [2].setText("12");
                            radioButtons [3].setText("13");
                        }                      
        label.setBounds(30,40,450,20);
        for(int i=0,j=0; i<=90; i+=30,j++) {
            radioButtons[j].setBounds(50, 80+i, 200, 20);
        }
        
    }
    
    boolean checkAns() {
        if(current==0) {
            return (radioButtons[3].isSelected());
        }
        if(current==1) {
            return (radioButtons[2].isSelected());
        }
        if(current==2) {
            return (radioButtons[0].isSelected());
        }
        if(current==3) {
            return (radioButtons[3].isSelected());
        }
        if(current==4) {
            return (radioButtons[0].isSelected());
        }
        if(current==5) {
            return (radioButtons[0].isSelected());
        }
        if(current==6) {
            return (radioButtons[2].isSelected());
        }
        if(current==7) {
            return (radioButtons[2].isSelected());
        }
        if(current==8) {
            return (radioButtons[1].isSelected());
        }
        if(current==9) {
            return (radioButtons[2].isSelected());
        }
        if(current==10) {
            return (radioButtons[1].isSelected());
        }
        if(current==11) {
            return (radioButtons[0].isSelected());
        }
        if(current==12) {
            return (radioButtons[3].isSelected());
        }
        if(current==13) {
            return (radioButtons[2].isSelected());
        }
        if(current==14) {
            return (radioButtons[0].isSelected());
        }
        if(current==15) {
            return (radioButtons[1].isSelected());
        }
        if(current==16) {
            return (radioButtons[0].isSelected());
        }
        if(current==17) {
            return (radioButtons[1].isSelected());
        }
        if(current==18) {
            return (radioButtons[3].isSelected());
        }
        if(current==19) {
            return (radioButtons[0].isSelected());
        }
        if(current==20) {
            return (radioButtons[2].isSelected());
        }
        if(current==21) {
            return (radioButtons[3].isSelected());
        }
        if(current==22) {
            return (radioButtons[2].isSelected());
        }
        if(current==23) {
            return (radioButtons[0].isSelected());
        }
        if(current==24) {
            return (radioButtons[3].isSelected());
        }
        return false;
    }
   
    public static void main(String[]  args) {
        new QuizTest("BRAND QUIZ");//head line
    }
    @Override
        public void actionPerformed (ActionEvent e) {
            if (e.getSource () ==btnNext) {  //dout
            if (checkAns ())
            count = count +1;
            current++;  //next question moving
            setData();   //method for question
            if (current==24) {
            btnNext.setEnabled(false);  //after question 25, next button is not work due to false statement.
            btnResult.setEnabled(true);    //after question 25 only result button is visible and button is work.
            btnResult.setText("Result");  //text for output or result button
            }
            }
            if(e.getActionCommand().equals("Result")){
            if (checkAns())  //answer checking method
            count= count +1;  //answer counting
            current++;
            double percent = ((count*100)/25);
            JOptionPane.showMessageDialog(this, "Correct Answers are "+count+"/25");   
            JOptionPane.showMessageDialog(this, "percentage of test ="+percent+"%");
            
            if(percent>=50)
            {JOptionPane.showMessageDialog(this, "pass");}
            else 
            {JOptionPane.showMessageDialog(this, "fail");}
            
            
            System.exit(0);    
    }
    }
}