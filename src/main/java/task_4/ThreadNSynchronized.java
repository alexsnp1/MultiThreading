package task_4;

public class ThreadNSynchronized {
    //Условие задачи: Напишите класс Counter с методом increment,
    //увеличивающим значение счётчика. Создайте два потока,
    //каждый из которых вызывает increment() 1000 раз.
    //Обеспечьте правильную работу с помощью synchronized.
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Thread t1 = new Thread(() ->
        { for (int i = 0; i<1000;i++)
            counter.increment();
        });
        Thread t2 = new Thread(() ->
        { for (int i = 0; i<1000;i++)
            counter.increment();
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(counter.getCount());
    }
}
