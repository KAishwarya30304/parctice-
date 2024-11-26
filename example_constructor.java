public class example_constructor {
    int length;
    int braeth;
    example_constructor(int i){
        this.length=i;
        this.braeth=i;
        System.out.println("length is: "+i);
        System.out.println("bradth is: "+i);

    }
    example_constructor(int length,int braeth){
        this.length=length;
        this.braeth=braeth;
        System.out.println(" length is : "+length);
        System.out.println(" breadth is : "+braeth);

    }
    public void display(){
        this.length=length;
        this.braeth=braeth;
        int area=length*braeth;
        System.out.println("area is : "+area);
    }
    public static void main(String[] args) {
        example_constructor c=new example_constructor(10);
        c.display();
        example_constructor c1=new example_constructor(10,20);
        c.display();

    }
}
