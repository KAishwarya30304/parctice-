class version1{
    public void v_1(){
        System.out.println("the ebility of chating in whatsapp");
    }
}
class version2 extends version_1{
    public void v_2(){
        System.out.println("the ebility of audio in whatsapp");
    }
}
class version3 extends version_2{
    public void v_3(){
        System.out.println("the ebility of video call in whatsapp");
    }
}
class version4 extends version_3{
    public void v_4(){
        System.out.println("the ebility of advance feature in whatsapp");
    }
}
public class multi_inh_demo {
    public static void main(String[] args) {
        version4 v=new version4();
        v.v_4();
        v.v_1();

    }
}
