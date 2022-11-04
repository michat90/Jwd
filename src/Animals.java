public class Animals {
    int age;
    int weight;
    String color;
}
class Dog extends Animals{
    
    public interface voice {
        public void getVoice();
    }

}
class Cat extends Animals{
    public interface voice {
        public void getVoice();
    }
}
