public class Main {
    public static void main(String[] args) {
        greetings();
        checkSign();
        selectColor();
        compareNumbers();
addOrSubtractAndPrint(10,20,false);
    }

    public static void greetings(){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign(){
        int a=10;
        int b=-200;
        int c=30;
        int d=a+b+c;
        if (d>=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data=15;
        if (data<=10){
            System.out.println("Красный");
    }
        if (data>10 && data<=20){
            System.out.println("Желтый");
        }
        if (data>20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a=5;
        int b=10;
        if (a>=b){
            System.out.println("a>=b");
        }
        else System.out.println("a<b");

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int a=initValue;
        int b=delta;
        boolean c=increment;
        if (c==true){
            System.out.println(a+b);
        }
        else System.out.println(a-b);

    }
}
