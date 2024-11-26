class version_1{
    public void v_1(){
        System.out.println("the ebility of chating in whatsapp");
    }
    }
    class version_2 extends version_1{
        public void v_2(){
            System.out.println("the ebility of audio in whatsapp");
        }
    }
class version_3 extends version_2{
    public void v_3(){
        System.out.println("the ebility of video call in whatsapp");
    }
}
class version_4 extends version_3{
    public void v_4(){
        System.out.println("the ebility of advance feature in whatsapp");
    }
}
public class multi_inher {
    public static void main(String[] args) {
        version_4 v=new version_4();
        v.v_4();

    }
}
