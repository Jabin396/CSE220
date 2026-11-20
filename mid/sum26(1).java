package mid;
void insert( char k, int v ){
   int idx=hash(k);
   item a=new item(k,v);
   if(ht[idx]==null){
      a.next=a;
      a.prev=a;
      ht[idx]=a;
   }

   else{
         item head=ht[idx];
         item cur=head;
         item tail=head.prev;
         if(cur.key==k){
            cur.value+=v;
            return;
            }
            cur=cur.next;
         while(cur!=head){
            if(cur.key==k){
            cur.value+=v;
            return;
            }
            cur=cur.next;
         } 
         
         if(cur.value>=v){
            a.next=cur;
            a.prev=tail;
            tail.next=a;
            cur.prev=a;
            ht[idx]=a;                                                                                                            
         }
         else{
         a.next=cur;
         a.prev=tail;
         tail.next=a;
         cur.prev=a;
         }
   }
}