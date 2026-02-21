public class outer {
    class inner{
        void show(){
            System.out.println("inner method");
        }
    }

    public static void main(String[] args) {
        outer o = new outer();
//        new outer();
        outer.inner i = o.new inner();
//        new inner();
//        new outer().new inner() . show();
        i.show();
    }
}
