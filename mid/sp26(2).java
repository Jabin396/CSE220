package mid;
class CellNode {
int val;
int pulse_radius;
CellNode next;
CellNode prev;
}

public static CellNode sendPulse( CellNode head ){
    CellNode cur=head;
    while(cur!=null){
        if(cur.pulse_radius>0){
            CellNode left=cur;
            CellNode right=cur;

            for(int i=0;i<cur.pulse_radius;i++){
                if(left.prev!=null){
                    left=left.prev;
                }
            }

            for(int j=0;j<cur.pulse_radius;j++){
                if(right.next!=null){
                    right=right.next;
                }
            }

            if(left.prev!=null){
                head=right.next;
            }
            else{
                left.prev.next=right.next;
            }

            if(right.next!=null){
                right.next.prev=left.prev;
            }

            cur=right.next;
        }
        else{
            cur=cur.next;
        }
    }
        return head;
}