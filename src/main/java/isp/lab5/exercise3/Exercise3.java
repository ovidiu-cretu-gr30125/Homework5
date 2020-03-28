package isp.lab5.exercise3;

public class Exercise3 {
    public static void main(String []args) {
        Playable Video1 = new ProxyVideo("Video1.mvi", "Color");
        Video1.play();
        Playable Video2 = new ProxyVideo("Video2.mvi", "black and white");
        Video2.play();

    }
}
