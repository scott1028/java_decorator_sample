import aa.test;

// 展示 Java Decorator 範例
class dd {
    public dd(){
        System.out.println("dd init");
    }

    public void show(){
        System.out.println("do show");
    }
}

 class cc {
    private dd DD;
    public cc(dd x){
        super();
        this.DD=x;
        System.out.println("cc init");
    }

    public void show(){
        this.DD.show();
        System.out.println("after cc Decorator");
    }
}

public class Main {

    public Main(){
        System.out.println("3213");
    }

    public int test(int a){
        return a+10;
    }

    public static void main(String[] args) {
        Main rr=new Main();
        rr.test(10);
        test ee=new test();
        cc r=new cc(new dd());
        r.show();
        System.out.println("Hello World!");
    }
}
