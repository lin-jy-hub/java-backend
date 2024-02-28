package test;
// public class Try {
//     public static void main(String[] args) {
//         Fruit fruit = new Fruit();
//         Orange orange = new Orange();
//         System.out.println(fruit instanceof Fruit);
//         System.out.println(fruit instanceof Orange);
//         System.out.println(fruit instanceof Apple);
//         System.out.println(fruit instanceof GoldenDelicious);
//         System.out.println(fruit instanceof McIntosh);
//         System.out.println(orange instanceof Orange);
//         System.out.println(orange instanceof Fruit);
//         // System.out.println(orange instanceof Apple); //false
//         // fruit.makeAppleCider();
//         // orange.makeAppleCider();
//         // orange.makeOrangeJuice();
//         // fruit.makeOrangeJuice();
//         // Orange p1 = new Apple();
//         // McIntosh p2 = new Apple();
//         // Apple p3 = new McIntosh();
//     }
//     static class Fruit {}
//     static class Apple extends Fruit {
//         public void makeAppleCider(){}
//     }
//     static class Orange extends Fruit {
//         public void makeOrangeJuice(){}
//     }
//     static class GoldenDelicious extends Apple {}
//     static class McIntosh extends Apple {}
// }


public class Try{
    public static void main(String[] args) {
        Object circle1 = new Circle();
        Object circle2 = new Circle();
        System.out.println(circle1.equals(circle2));
    }
    static class Circle {
        double radius;
        public boolean equals(Object circle){
            return this.radius == ((Circle)circle).radius;
        }
    }
}