package mid;
class CellNode {
int val;
int pulse_radius;
CellNode next;
CellNode prev;
}

public static CellNode sendPulse( CellNode head ){
   // CellNode n=new CellNode(head);
    CellNode cur=head;
    while(cur!=head){
        if(cur.pulse_radius>0){
            CellNode left=cur;
            CellNode right=cur;

            for(int i=0;i)
        }

        cur.prev=head.next;
        head.next=cur.prev;
    }
        return cur;
}