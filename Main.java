public class Main {
    public static void main(String[] args) {
        Pet cow = new Cow();
        Pet cat = new Cat();
        Pet dog = new Dog();
        cow.voice();
        cat.voice();
        dog.voice();

        MyMath.subtract();
        MyMath.sum();
        MyMath.multyply();
        MyMath.divide();
    }
}
