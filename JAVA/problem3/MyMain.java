import problem3.MyPriorityQueue;
import problem3.Student;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Tushar",58));
        queue.enqueue(new Student("Tanishq",23));
        queue.enqueue(new Student("Pavit",65));
        queue.enqueue(new Student("Samar",1));
        queue.enqueue(new Student("Vibhu",10));
        queue.enqueue(new Student("Shantanu",76));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}
