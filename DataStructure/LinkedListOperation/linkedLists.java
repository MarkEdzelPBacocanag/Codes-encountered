

class linkedLists {

    static class node{

        int data;
        node next;
        node (int value){

            data = value;
            next = null;

        }

    }
    static node head;

    //1:
    static void insertAtBeginning(int data){

        //Create a link
        node lk = new node(data);
        //Points to the old first node
        lk.next = head;
        //Points the the new first node
        head = lk;

    }

    //2:
    static void deleteAtBeginning(){

        head = head.next;

    }

    //3:
    //ignore suppress warning
    static String displayLists(){

        //checks if the head is empty
        if(head == null){

            return "Empty";

        }

        //String is for returning the value as string...
        StringBuilder string = new StringBuilder();
        node p = head;
        string.append("[ ");
        while(p != null){

            string.append(p.data).append(" ");
            p = p.next;

        }

        string.append("]");
        return string.toString();

    }

    //4:
    static int  searchList(int key){

        node temp = head;
        while(temp != null){

            if(temp.data == key){
                System.out.println("\nElement found");
                return 1;
            } 
            
            temp = temp.next;

        }
        System.out.println("\nElement not found");
    return 0;

    }

    //5:
    static void deleteAtNode(int key){

        node temp = head;
        node prev = null;
        if(temp != null && temp.data == key){

            head = temp.next;
            return;

        }
        //Finds the key to be deleted
        while(temp != null && temp.data != key){

            prev = temp;
            temp = temp.next;
            System.out.println("""
                               
                               Deleted Element
                               Updated Element list
                               
                               """
            );

        }
        //If the key is not present
        if(temp == null){
            System.out.println("\nNot found in the Element list!");
            return;
        
        }

        //Remove the node
        if (prev != null) {
            prev.next = temp.next;
        }

    }

}


/* This is an insert at end list {not included} !please ignore!
    static void insertAtEnd(int data){

        //Create a link
        node lk = new node(data);
        node linkedList = head;
        //Points to the old first node
        while(linkedList.next != null){

            linkedList = linkedList.next;

        }
        //Point to the new first node

    }
        */

