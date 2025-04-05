
//Checks whether the linked list contains a cycle or not
class FindCycleInLinkedList{
    public static class LinkedList{
        int val;
        LinkedList next;

        LinkedList(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        //test case 1 
        // 1->2->3->4->3
        LinkedList head = new LinkedList(1);
        LinkedList node2 = new LinkedList(2);
        LinkedList node3 = new LinkedList(3);
        LinkedList node4 = new LinkedList(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node3;

        boolean result = checkIfCycle(head); 
        if(result) {
            System.out.println("for case 1 : No cycle found");
        }else{
            System.out.println("for case 1 :  Cycle found");
        }

        //test case 1 
        // 1->2->3->4->3
        LinkedList head2 = new LinkedList(1);
        LinkedList n2 = new LinkedList(2);
        LinkedList n3 = new LinkedList(3);
        LinkedList n4 = new LinkedList(4);
        head2.next = n2;
        n2.next = n3;
        n3.next = n4;
        boolean result2  = checkIfCycle(head2);
        if(result2) {
            System.out.println("for case 2 : No cycle found");
        }else{
            System.out.println("for case 2 :  Cycle found");
        }
  
    }
    private static boolean checkIfCycle(LinkedList head) {
        LinkedList n1 = head;
        LinkedList n2 = head.next.next;
        //using floyd hare and tortoise algo
        while(n2.next.next != null){
            if(n1.val == n2.val ) return false;
            n1 = n1.next;
            n2 = n2.next.next;
        }
        
       return true;
    }
}