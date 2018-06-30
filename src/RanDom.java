import java.util.Random;

public class RanDom {
    Random rd = new Random();
//    int nunmber = rd.nextInt(200);

    public RanDom() {

    }

    public RanDom(int number) {
//        this.nunmber = number;
    }

    public void display() {
        for (int i = 0; i < 50; i++) {
            int nunmber = rd.nextInt(1000);
            System.out.println(nunmber);
        }

    }
}


