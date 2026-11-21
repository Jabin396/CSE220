package mid;

public static Queue queueGroupReverse(Queue q, int k){
    Queue result=new Queue();
    Stack s=new Stack();

    while(!q.isEmpty()){
        int count=0;

        while(count<k && !q.isEmpty()){
            s.push(q.dequeue());
            count++;
        }

        if(count==k){
            while(!s.isEmpty()){
                result.enqueue(s.pop());
            }
        }

        else{
            Queue temp=new Queue();
            while(!s.isEmpty()){
                temp.enqueue(s.pop());
            }

            while(!temp.isEmpty()){
                result.enqueue(temp.dequeue());
            }
        }
    }

    return result;
}
