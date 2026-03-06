public class adv_que3 {
     String name ="James";
        class inner{
            String name = "Peter";
            void show(){
                System.out.println("this.name");   // Peter
                System.out.println("outer.this.name"); // James
            }
        }



    public static void main(String[] args) {
        adv_que3 a = new adv_que3();



    }
}
