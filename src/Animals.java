public class Animals {
    int age;
    int weight;
    int color;
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