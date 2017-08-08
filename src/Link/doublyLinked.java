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

    public static void main(String[] args) {
        doublyLinked doublylinked = new doublyLinked();
        doublylinked.insertFirst(5);
        doublylinked.insertFirst(6);
        doublylinked.insertFirst(7);
        doublylinked.displayForward();
        doublylinked.displayBackward();

    }
}
