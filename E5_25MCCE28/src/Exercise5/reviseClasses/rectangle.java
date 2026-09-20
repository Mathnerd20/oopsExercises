package Exercise5.reviseClasses;

public class rectangle extends polygon{
    String type = "rectangle";
    public void printType(){
        System.out.println(super.type);
    }
    public void getsides(){
        System.out.println("Rectangle is a polygon which has 4 sides");
        super.printSides();
    }
}
