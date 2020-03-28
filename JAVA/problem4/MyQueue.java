import problem4.MyLinkedList;
import problem4.Node;

public class MyQueue {
    MyLinkedList linkedList = new MyLinkedList();
    public int peek(int data){
        if(linkedList.search(data)==null){
            return -1;
        }
        return linkedList.search(data).getData();
    }

    public void enqueue(int data){
        linkedList.addLast(data);
    }

    public void dequeue(){
        linkedList.deleteFirst();
    }

    public void show(){
        linkedList.display();
    }
}
