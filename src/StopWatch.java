import java.util.Random;
public class StopWatch {
        Random rd = new Random();

        //    int number = rd.nextInt();
        public StopWatch() {

        }

        public void display() {
            long start = System.currentTimeMillis();
            int[] array=new int[10000];
            for (int i = 0; i < 10000; i++) {
                int number= rd.nextInt(50000);
                array[i]=number;
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    int temp;
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            long end= System.currentTimeMillis();
            System.out.println("Thoi gian chay doan lenh: "+ (end-start));
        }

    }

