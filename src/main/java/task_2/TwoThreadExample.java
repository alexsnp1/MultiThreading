package task_2;

public class TwoThreadExample {
    //Условие задачи: Создайте два потока. Один поток
    //должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() ->
        { for (int i=0;i<5;i++) {
            System.out.println("A");
            sleep(100);
        }
        });
        Thread t2 = new Thread(() ->
        { for (int i=0;i<5;i++) {
            System.out.println("B");
            sleep(100);
        }
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
    }
    static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {
        }
    }
}
