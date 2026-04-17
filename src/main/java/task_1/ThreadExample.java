package task_1;

public class ThreadExample {
    //Условие задачи: Напишите программу, в которой создается отдельный
    // поток, выводящий сообщение "Привет из потока!"
    // 5 раз с паузой в 1 секунду между сообщениями.
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(() ->
        { for (int i = 0; i<5;i++) {
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    });
        t.start();
        t.join();
}
}
