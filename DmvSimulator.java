import java.lang.Math;
public class DmvSimulator {
  public static void main(String[] args) {
    System.out.println("Welcom to the DMV :)");
    int ticketNum = (int) (Math.random()*100);
    System.out.println("Take your number please wait until it is called your number is "+ ticketNum);
    int wrapNum = ticketNum + 1;
    while (ticketNum != wrapNum){
      System.out.println("now calling "+ wrapNum);
      wrapNum++;
      if (wrapNum == 100){
        wrapNum = 1;
      }
    }
    System.out.println("now calling "+ ticketNum);
    System.out.println("You do not have any of the required documentation you can leave now have fun waiting in the line again.NEXT!");
  }
}
