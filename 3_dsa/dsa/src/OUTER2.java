public class OUTER2 {
    void display(){
        class inner{
            void show(){
                System.out.println("inner method");
            }
        }
        inner i = new inner();
        i.show();
    }


    public static void main(String[] args) {
        OUTER2 o = new OUTER2();
        o.display();
    }
}
