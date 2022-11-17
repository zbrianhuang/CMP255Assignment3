/* TOD0
 * equals
 * isEmpty
 * toArray
 * clear
 * remove/delete (i think is done)
 * getCapcity
 * size 
 * find
 * get
 * add(insert)
 * resize
 */
/* Done
 * add
 * delete
 * 
 */
public class LList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int counter;
    public LList(){
        head = null;
        tail = null;
        counter = 0;
    }
    public void add(T m)throws ListException{
        try{
            Node<T> temp = new Node<T>();
            temp.setData(m);
            temp.setNext(null);
            if(head == null){
                head = temp;
            }else{
                tail.setNext(temp);
            }


            tail = temp;
            counter++;
        }catch(OutOfMemoryError e){
            throw new ListException("Cannot add. No more memory.");
        }
    }   
    public void add(T m, int pos) throws ListException{
        try{
            if(m==null){
                throw new ListException("Error. Unable to Insert. Cannot add null entries.");
            }
            if(pos<1||pos>counter){
                throw new ListException("Error. unable to insert. Bad position.");
            }
            if (counter==0){
                throw new ListException("Error. Unable to insert. List is empty.");
            }
            Node<T> temp=head;
            for(int i=0;i<pos ;i++){
                temp=temp.getNext();
            }
            
            counter++;
        }catch(OutOfMemoryError e){
            throw new ListException("Error. Out of Memory.");
        }
    }
        public String toString(){
            if(head==null){
                return "The list is empty.";
    
            }
            String t = "";
            Node<T> temp;
            temp = head;
            while(temp!=null){
                t+= temp.getData() + "\n";
                temp = temp.getNext();
            }
            return t;
        }
    public T delete(int position) throws ListException{//idk
        Node<T> current=head;
        Node<T>before=null;
    
        T temp=null;;
    
        if(counter == 0){
            throw new ListException("cannot Delete. List is empty");
        }
        if(position>=1 && position<=counter){
            if(counter ==1){//there i s only one node
                temp=head.getData();
                head = null;
                tail = null;
                return temp;
            }else{
                if(position == 1){
    
                    //there are at least 2 nodes, and hte user is trying the delete the very first item.                        temp = head.getData();
                    head = head.getNext();
                    counter--;
                    return temp;
                }else{
                    int k= 1;
                    while(k!=position){
                       before=current;
                        current = current.getNext();
                        k++;
                    }
                    //We have arrived at the node to be deleted.
                    temp = current.getData();
                    before.setNext(current.getNext());//effectively gets rid of the node I want to delete.
    
                        if(before.getNext()==null){
                            tail = before;
                        }
                        counter--;
                        return temp;
                    }
                }
            }else{
                throw new ListException("no");
                
    
            }
        }
        public T iterate(int position){
            Node<T> temp=head;
            for(int i= 0;i<position;i++){
                temp = temp.getNext();
            }
            return temp.getData();
        }
    
        public int Size(){
            return counter;
        }
        public void insert(T item,int position)throws ListException{
            try{
                if(counter == 0){
                    throw new ListException("Cannot insert. List is empty.");
                    
                }
                if(item ==null){
                    throw new ListException("Cannot insert. Null items not accpetable.");
                }
                if(position <1 || position>counter){
                    throw new ListException("cannot insert. Position is bad.");
                }
                Node<T> temp = new Node<T>();
                temp.setData(item);
                if(position ==1){
                    temp.setNext(head);
                    head = temp;
                }else{
                    Node<T> before = head;
                    Node<T> current = head;
                    int k=1;
                    while(k!=position){
                        k++;
                    }
                    temp.setNext(current);
                    before.setNext(temp);//inserts node into right place.
                    counter++;
    
                }
            }catch(OutOfMemoryError e){
                throw new ListException("Out of memory.");
            }
        } 
        
    
}
