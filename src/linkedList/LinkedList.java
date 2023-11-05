package linkedList;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int key){
        Node node = new Node(key);
        if (this.head == null){
            this.head = node;
        } else {
            Node current = this.head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void addAt(int key, int index){
        Node node = new Node(key);
        if (this.head == null){
            this.head = node;
        } else if (index == 0){
            node.next = this.head;
            this.head = node;
        } else {
            Node current = this.head;
            int i = 0;
            while (current.next != null){
                if (i == index - 1){
                    node.next = current.next;
                    current.next = node;
                    return;
                }
                current = current.next;
                i++;
            }
            current.next = node;
        }
    }

    public void remove(int key){
        if (this.head == null){
            return;
        }
        if (this.head.key == key){
            this.head = this.head.next;
            return;
        }
        Node current = this.head;
        while (current.next != null){
            if (current.next.key == key){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void removeAt(int index){
        if (this.head == null){
            return;
        }
        if (index == 0){
            this.head = this.head.next;
            return;
        }
        Node current = this.head;
        int i = 0;
        while (current.next != null){
            if (i == index - 1){
                current.next = current.next.next;
                return;
            }
            current = current.next;
            i++;
        }
    }

    public String toString(){
        String result = "";
        Node current = this.head;
        while (current != null){
            result += "Node("+current.key + ") -> ";
            current = current.next;
        }
        return result;
    }
}
