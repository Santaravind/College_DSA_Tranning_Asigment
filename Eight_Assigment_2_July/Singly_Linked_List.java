package Assigment.Eight_Assigment_2_July;


public class Singly_Linked_List {
    Node head;


    //1. Create and Display a Linked List
    //    2. Insert a Node
    //insertion in the list
    //insert First
    void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            System.out.println("List is not exist ");
            return;
        } else {
            node.next = head;
            head = node;
        }
    }

    //insert Last
    void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    //Insert at Position
    void addAtPosition(int position, int data) {
        Node node = new Node(data);
        if (head == null) {
            System.out.println("List is not exit :  ");
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (count == position) {
                break;
            }
            count++;
            temp = temp.next;
        }
        if (temp != null) {
            node.next = temp.next;
            temp.next = node;
        }
    }


    //3. Delete a Node
    //Delete Element First
    int deleteFirst() {
        int ptr;
        if (head == null) {
            System.out.println("list is not exist. ");
            return -1;
        } else {
            ptr = head.data;
            head = head.next;
        }

        return ptr;
    }


    //Delete  Elements from end
    int deleteLast() {
        Node temp = head;
        Node pre = null;
        int p;
        if (head == null) {
            System.out.println("List is not exist : ");
            return -1;
        } else {

            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            p = temp.data;
            pre.next = null;
        }

        return p;
    }

    //Delete by position
    int deleteAtPosition(int position) {
        int p = -1;
        if (head == null) {
            System.out.println("List is not exist : ");
            return p;
        } else if (position == 0) {
            return deleteFirst();
        } else {
            Node temp = head;
            Node pre = null;
            int count = 0;
            while (temp != null) {
                if (count == position) break;
                pre = temp;
                temp = temp.next;
                count++;
            }
            if (temp != null) {
                p = temp.data;
                pre.next = temp.next;

            }


        }

        return p;
    }

    //Delete by value
    int deleteAtValue(int value) {
        int p = -1;
        if (head == null) {
            System.out.println("List is not exist : ");
            return p;
        } else if (head.data == value) {
            return deleteFirst();
        } else {
            Node temp = head;
            Node pre = null;

            while (temp != null && temp.data != value) {
                pre = temp;
                temp = temp.next;

            }
            if (temp != null) {
                p = temp.data;
                pre.next = temp.next;

            }


        }

        return p;
    }


    //    Traversal
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    //For Traversal
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node temp = head;
        sb.append("[");
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(",");

            temp = temp.next;
        }
        sb.append("]");


        return String.valueOf(sb);
    }


    //4. Search an Element
    boolean IsSearch(int val) {

        boolean flag = false;
        if (head == null) {
            System.out.println("List is not exist : ");
            return flag;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == val) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    //    5. Reverse a Linked List (Most Important)
    void reverseList() {

        if (head == null) {
            System.out.println("List is not exist");
            return ;
        }else {
            Node curr = head;
            Node pre = null;
            while(curr!=null)
             {
                Node temp=curr.next;
                curr.next=pre;
                pre=curr;
                curr=temp;
            }
            while (pre!=null){
                System.out.print(pre.data+" ");
                pre=pre.next;
            }

        }

    }

//    6. Find Middle Node
    int middleOfList(){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

//7. Detect Loop in Linked List
//    Floyd's Cycle Detection Algorithm (Tortoise and Hare)
    boolean isCycle(){
        boolean flag=false;
        if (head==null){
            System.out.println("List is nof exist ");
            return false;
        }else {
            Node slow=head;
            Node fast=head.next;
            while (fast!=null&&fast.next!=null){
                if (slow==fast){
                    return  true;
                }
                slow=slow.next;
                fast=fast.next.next;
            }
        }

        return flag;
    }

//    8. Remove Duplicates from Sorted Linked List

    void removeDuplicate(){
        if (head==null){
            System.out.println("List is not exist");
            return;
        }
        Node pre=head;
        Node temp=head.next;
        while (temp!=null){
            if (pre.data==temp.data){
                pre.next=temp.next;
                temp=temp.next;
            }else {
                  pre=temp;
                  temp=temp.next;

            }
        }
    }

//     9. Merge Two Sorted Linked Lists
    void mergeTwoSortedList(Node list1, Node list2){
        Node dummy=new Node(0);
        Node tail=dummy;
        while (list1!=null&&list2!=null)
        {
            if (list1.data<list2.data){
                tail.next=list1;
                list1=list1.next;

            }else {tail.next=list2;
               list2=list2.next;
            }
          tail= tail.next;
        }
        while (list1!=null){
            tail.next=list1;
            list1=list1.next;
            tail=tail.next;
        }
        while (list2 !=null){
            tail.next=list2;
            tail=tail.next;
            list2=list2.next;
        }
      dummy=dummy.next;
//        head=dummy;
        while (dummy!=null){
            System.out.print(dummy.data+" ");
            dummy=dummy.next;
        }

    }


//    10. Check Whether Linked List is Palindrome
    boolean isPalindrome(Node list){

        if (head==null){
            System.out.println("List is not exist :");
            return false;
        }
        Node temp=list;
        Node newNote=list;
        Node pre=null;
        while (temp!=null){
            Node t=temp.next;
            temp.next=pre;
            pre=temp;
            temp=t;
        }

        while (newNote!=null){
            if (newNote.data!=pre.data){
                return false;
            }
            newNote=newNote.next;
            pre=pre.next;
        }
return true;
    }

    public static void main(String[] args) {

           Singly_Linked_List list=new Singly_Linked_List();
//           list.addLast(10);
//           list.addLast(20);
//           list.addLast(30);
//           list.addLast(40);
//          System.out.println(list);
//
//          //Add first elements
//           list.addFirst(900);
//           list.display();
//
//           //add at Position of given
//        System.out.println("Add a given position 3 to 100");
//           list.addAtPosition(3,100);
////           list.display();
//          System.out.println(list);
//
//         //delete First elements
//        System.out.println(" Deleted value at first : "+list.deleteFirst());
//        System.out.println(list);
//
//        //delete Last elements
//        System.out.println("Deleted value at last  : "+list.deleteLast());
//        System.out.println(list);
//
//        //delete at given position
//        System.out.println(" Deleted value at given position  : " + list.deleteAtPosition(1));
//        System.out.println(list);
//
//        //delete  at give value
//
//        System.out.println("Deleted value given data : "+list.deleteAtValue(10));
//        System.out.println(list);
//
//
//        list.addLast(40);
//        list.addLast(10);
//        list.addLast(30);
//        list.addLast(60);
//        System.out.println(list);
//
//        //Search Value
//        if (list.IsSearch(10)){
//            System.out.println("\nElement Found");
//        }else {
//            System.out.println("\nElement not  Found ");
//        }
//
//
//        // Middle Node
//        System.out.println("\nMiddle Node : " + list.middleOfList());
//
//
//        //reverse list
//        System.out.println("Reversed list ");
//               list.reverseList();
//
//     //        7. Detect Loop in Linked List
//        System.out.println("\nlist is cycle : "+list.isCycle());
//
//        list.addLast(10);
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//        list.addLast(50);
//        list.addLast(50);
//        list.removeDuplicate();
//        System.out.println(list);
//
////        9. Merge Two Sorted Linked Lists
//        Singly_Linked_List list1 =new Singly_Linked_List();
//        list1.addLast(1);
//        list1.addLast(3);
//        list1.addLast(4);
//        list1.addLast(5);
//
//        Singly_Linked_List list2=new Singly_Linked_List();
//        list2.addLast(2);
//        list2.addLast(6);
//        list2.addLast(7);
//        list2.addLast(9);
//
//        System.out.println("\nMerge two list :");
//        System.out.println("list one : " + list1);
//        System.out.println("List two : "+ list2);
//        System.out.println("\nMerged list :");
//        list.mergeTwoSortedList(list1.head,list2.head);


//        10. Check Whether Linked List is Palindrome

        Singly_Linked_List list3=new Singly_Linked_List();
        list3.addLast(1);
        list3.addLast(2);
        list3.addLast(3);
        list3.addLast(2);
        list3.addLast(1);
//        System.out.println("\n list is palindrome or not : " +list3);
        if(list.isPalindrome(list3.head)){
            System.out.println("\nPalindrome ");
        }else {
            System.out.println("\n Not Palindrome");
        }

//                System.out.println("\n list is palindrome or not : " +list3);
    }
}
