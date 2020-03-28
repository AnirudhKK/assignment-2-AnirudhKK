import problem5.MyCircularQueue;
import problem5.Student;

public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue  =new MyCircularQueue(3);
        myCircularQueue.enqueue(new Student("T",0,0));
        myCircularQueue.enqueue(new Student("Y",1,1));
        myCircularQueue.enqueue(new Student("D",1,0));
        for(int i=0;i<myCircularQueue.getSize()+1;i++){
            Student s = myCircularQueue.dequeue();
//            System.out.println(s);
            if(s.getBackLog()-s.getAppearingCount()!=0){
                myCircularQueue.enqueue(s);
            }
        }
        myCircularQueue.show();
    }
}