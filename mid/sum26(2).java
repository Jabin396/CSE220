package mid;
//was given in the question
class Node {
Character[] text;
Node next;
Node prev;
public Node(){
this.text = new Character[4];
}
}

static void specialAppend(Node head,String s){
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }

    int j=0;
    if(temp!=head){
    for(int i=0;i<4;i++){
        if(temp.text[i]==null && j<s.length()){
        temp.text[i]=s.charAt(j);
        j++;
    }


}

    }

    while(j<s.length()){
        Node n=new Node();
        for (int i=0;i<4;i++){
            if(j<s.length()){
                n.text[i]=s.charAt(j);
                j++;
            }
        }
    temp.next=n;
    n.prev=temp;
    temp=n;
    }


}