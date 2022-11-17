public class Main {
    public static  void main(String[] args) throws ListException{
        LList<Object> L = new LList<Object>();
        L.add("hello");
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        L.add(6);
        L.add(7);
        L.add(8);
        L.add(9);
        L.add(10);
        L.add(11);
       // L.add(7,3);
        System.out.println(L.toString());
      //  System.out.println("Deleted:" + L.delete(1));
      L.add(7,3);
        System.out.println(L.toString());
    }
}
