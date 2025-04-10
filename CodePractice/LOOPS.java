import javax.swing.*;

public class LOOPS{

    public static double loop(int  loopType, double iteration){
        int i = 0; 

        switch(loopType) {
            case 1 -> {
                for (i = 0; i < iteration; i++){
                    JOptionPane.showMessageDialog(null,"It repeated " + i, "Output", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            case 2 -> {
                while(i < iteration){
                    i++;
                    JOptionPane.showMessageDialog(null,"It repeated " + i, "Output", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            case 3 -> {
                do{
                    i++;
                    JOptionPane.showMessageDialog(null,"It repeated " + i, "Output", JOptionPane.INFORMATION_MESSAGE);
                }while(i < iteration);
            }
            default -> {
            }
        }
        
        return i; 
    }

        public static void main(String[] args){

        int loopType = Integer.parseInt(JOptionPane.showInputDialog("Choose what type of loop you like \n [1] for, [2] while, [3] do - while"));
        double iteration = Double.parseDouble(JOptionPane.showInputDialog("How many Iteration?"));
            loop(loopType, iteration);
        }

}