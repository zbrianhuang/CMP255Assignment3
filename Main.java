public class Main {
    public static  void main(String[] args) throws ListException{
        LList<Object> L = new LList<Object>();
        L.add("hello");
        System.out.println(L.toString());
        System.out.println("Deleted:" + L.delete(1));
        System.out.println(L.toString());
    }
}
