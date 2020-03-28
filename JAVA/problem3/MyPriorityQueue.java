import problem3.MyLinkedList;
import problem3.Student;

public class MyPriorityQueue {
    MyLinkedList linkedList = new MyLinkedList();
    public void enqueue(Student student){
        linkedList.addLast(student);
    }

    public void dequeue(){
        linkedList.deleteFirst();
    }
    public void show(){
        linkedList.display();
    }
}
