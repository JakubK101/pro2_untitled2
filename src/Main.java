import models.*;


public class Main {
    public static void main(String[] args) {

        final int x =10;
        final double pi = 3.14;

        ExampleClass exCls = new ExampleClass();
        System.out.println(exCls.x);
        exCls.publicMethod();

        System.out.println(MyMathClass.pi);
        System.out.println(MyMathClass.sum(2, 4));

        System.out.println(ExampleClass.InnerClass.i);

        Box<ExampleClass> box = new Box<>(exCls);
        Box<String> boxString = new Box<>("Ahoj");
        Box<Integer> boxInteger = new Box<>(12);

        Pair<Integer, String> myPair = new Pair<>(1, "Praha");

        Car car = new Car("Skoda", "Octavia");

        try{
            System.out.println("Saving");
            throw new Exception("File is lock");

        }catch (Exception e){

        }

    }
    private static void printStar(int x){
        if(x>1)
            return;
        System.out.println("*");
            x = x-1;
            printStar(x);

    }
}
