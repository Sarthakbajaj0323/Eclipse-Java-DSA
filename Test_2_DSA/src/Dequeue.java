/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/

import java.util.ArrayList;
import java.util.List;

/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/

public class Dequeue {
    
  private	int[] deq;
   private  int front;
    private int rear;
   private  int si;
    
    
    
     Dequeue(int size){
        deq=new int[size];
        si=size;
        front=-1;
        rear=-1;
    }
    
    public void insertFront(int ele){
        
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            deq[front]=ele;
            return;
        }
        //cout<<"front="<<front<<" rear="<<rear<<endl;
        if((front+1)%si==rear){
            System.out.println("-1");
            return;
        }
        front=(front+1)%si; 
        deq[front]=ele;
        
    }
    
    public void insertRear(int ele){
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            deq[rear]=ele;
            return;
        }
        //cout<<"front="<<front<<" rear="<<rear<<endl;
        if(front==rear-1 || rear==0 && front==si-1){
            System.out.println("-1");
            return;
        }
        if(rear==0)
            rear=si-1;
        else
            rear--;
        deq[rear]=ele;
        
    }
    public void deleteFront(){
        if(front==-1 && rear==-1){
            System.out.println("-1");
            return;
        }
        if(rear==front){
            rear=-1;
            front=-1;
            return;
        }
        if(front==0)
            front=si-1;
        else
            front--;
    }
    
    public void deleteRear(){
        if(front==-1 && rear==-1){
           System.out.println("-1");
            return;
        }
        if(rear==front){
            rear=-1;
            front=-1;
            return;
        }
        rear=(rear+1)%si;
    }
    
    public int getFront(){
        if(front==-1 && rear==-1){
            return -1;
        }
        return deq[front];
    }
    public int getRear(){
        if(front==-1 && rear==-1){
            return -1;
        }
        return deq[rear];
    }    
    
    // Complete this class
    
}
    
