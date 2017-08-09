package Link;

public class doublyLinked {
    private Link first;
    private Link last;

    public doublyLinked(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int dd){
        Link newLink = new Link(dd);
        if(isEmpty()){
            last = newLink;
        }else{

            first.previous=newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    public void insertLast(int dd){
        Link newLink = new Link(dd);
        if(isEmpty()){
            first = newLink;
        }else{
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }
    public Link deleteFirst(){
        Link temp = first;
        if(first.next == null){
            last = null;
        }else{
            first.next.previous=null;
        }
        first = first.next;
        return temp;
    }
    public Link deleteLast(){
        Link temp = last;
        if(first.next == null){
            first = null;
        }else{
            last.previous.next=null;
        }
        last = last.previous;
        return temp;
    }
    public void displayForward(){
        System.out.print("List (first ---> last)");
        Link current=first;
        while(current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }

    public void displayBackward(){
        System.out.print("List (last ---> first)");
        Link current = null;
        current = last;
        while(current != null){
            current.displayLink();
            current= current.previous;
        }
        System.out.println("");
    }

    public boolean insertAfter(int key ,int dd){
        Link current = first;
        while(current.dData != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }
        Link newLink = new Link(dd);

        if(current == last){
            newLink.next = null;
            last = newLink;
        }
        else{
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteKey(int key){
        Link current = first;
        while(current.dData!=key){
            current = current.next;
            if(current == null){
                return null;
            }
        }

        if(current==first){
            first = current.next;
        }else{
            current.previous.next = current.next;
        }

        if(current==last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }
        return current;
    }

    public static void main(String[] args) {
        doublyLinked doublylinked = new doublyLinked();
        doublylinked.insertFirst(7);
        doublylinked.insertFirst(6);
        doublylinked.insertFirst(5);

        doublylinked.insertLast(2);
        doublylinked.insertLast(9);
        doublylinked.insertLast(10);

        doublylinked.deleteFirst();
        doublylinked.deleteLast();
        doublylinked.displayForward();
        doublylinked.displayBackward();

    }
}
