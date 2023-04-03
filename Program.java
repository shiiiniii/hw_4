package finalwork;

public class Program {
    public static void main(String[] args) {
       
    	MyList<Integer> list1 = new MyList<Integer>(new Integer[]{17, 98, -36, 0, 3});
        MyList<Double> list2 = new MyList<Double>(new Double[]{ 9.5, 12.1, 3.33, -1.8});
        MyList<String> list3 = new MyList<String>(new String[]{"11", "number", "50", "-7"});

      
        list1.bubbleSorting();
        list2.selectSorting();
        list3.insertSorting();

        list1.printList();
        list1.printSortedList();
        list2.printList();
        list2.printSortedList();
        list3.printList();
        list3.printSortedList();
        

    }
}
