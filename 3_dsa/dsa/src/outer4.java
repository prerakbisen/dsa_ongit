public class outer4 {
    static class inner{
        void show(){
            System.out.println("method");
        }
    }

    public static void main(String[] args) {
        outer4 o = new outer4();
        inner i = new inner();
        i.show();
        outer4.inner o2 = new outer4.inner();
        o2.show();
    }
}
