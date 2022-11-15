public class ListException extends Exception {
    private String m;
    public ListException(String k){
        m =k;
    }
    public String toString(){
        return m;
    }
    
}
