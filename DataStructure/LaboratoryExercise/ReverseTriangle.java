public class ReverseTriangle {
   public static void main(String[] args){
    
      System.out.println("\tReverse Triangle Pattern\n");
      for(int lowerR = 4; lowerR >= 1; lowerR--){
         for(int m = 4; m > lowerR; m--){
            System.out.print(" ");    
         }
         for(int n = 1; n <=(2 * lowerR - 1); n++){
            System.out.print("*");
         }
         System.out.println();
      }
   
      System.out.println("\n\tDiamond Pattern\n");
      for(int row = 1; row <= 4; row++){
         for(int i = row; i < 4; i++){
            System.out.print(" ");
         }
         for(int j = 1; j <= (2 * row - 1); j++){
            System.out.print("*");
         }
         System.out.println();
      }
      for(int lowerRow = 4; lowerRow >= 1; lowerRow--){
         for(int k = 4; k > lowerRow; k--){
            System.out.print(" ");    
         }
         for(int l = 1; l <=(2 * lowerRow - 1); l++){
            System.out.print("*");
         }
         System.out.println();
      }
      
   }
}