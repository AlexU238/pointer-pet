public class Main {
    public static void main(String[] args) {
        Pet cow = new Cow();
        Pet cat = new Cat();
        Pet dog = new Dog();
        cow.voice();
        cat.voice();
        dog.voice();

        System.out.println(MyMath.subtract(MyMath.Pi,MyMath.G));
        System.out.println(MyMath.sum(MyMath.Pi,MyMath.G));
        System.out.println(MyMath.multyply(MyMath.G));
        System.out.println(MyMath.divide(MyMath.G));
    }
}
