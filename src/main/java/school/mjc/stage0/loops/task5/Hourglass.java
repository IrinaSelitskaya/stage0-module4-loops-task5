package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
     for(int i=0;i<height;i++){
      for(int j=0;j<i;j++){
        System.out.print(" ");}
      for(int k=0;k<(height-i)*2-1;k++){
        System.out.print("8");}
      System.out.println();}
    for(int i=2;i<=height;i++){
      for(int j=0;j<=height-i-1;j++){
        System.out.print(" ");}
      for(int k=0;k<i*2-1;k++){
        System.out.print("8");}
      System.out.println();}
    }
}
