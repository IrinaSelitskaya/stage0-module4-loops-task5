package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
     if(height%2!=0){
      for(int i=0;i<=height/2;i++){
       for(int j=0;j<i;j++){
        System.out.print(" ");}
       for(int k=0;k<=(height/2-i)*2;k++){
        System.out.print("8");}
      System.out.println();}
      for(int i=1;i<=height/2;i++){
       for(int j=0;j<=height/2-i-1;j++){
        System.out.print(" ");}
       for(int k=0;k<i*2+1;k++){
        System.out.print("8");}
      System.out.println();}
     }else{
      for(int i=0;i<height/2;i++){
       for(int j=0;j<i;j++){
        System.out.print(" ");}
       for(int k=0;k<(height/2-i)*2;k++){
        System.out.print("8");}
      System.out.println();}
      for(int i=1;i<=height/2;i++){
       for(int j=0;j<=height/2-i-1;j++){
        System.out.print(" ");}
       for(int k=0;k<i*2;k++){
        System.out.print("8");}
      System.out.println();}  
    } 
    }
}
