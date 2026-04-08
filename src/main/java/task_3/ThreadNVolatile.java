package task_3;

public class ThreadNVolatile {
    //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
    // В основном потоке через 2 секунды установите флаг stop = true,
    // чтобы остановить поток.
    static int x = 0;
    static boolean stop = false;

    public static void main(String[] args) throws Exception{
        Thread t = new Thread(() ->
        { while(!stop) {
            System.out.println(x++);
        } System.out.println("Поток остановлен");
        });
        t.start();
        try {
        Thread.sleep(2000);
        } catch (InterruptedException ignored) {}
        stop = true;
        t.join();
    }
}
