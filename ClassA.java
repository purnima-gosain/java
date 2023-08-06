 class ClassA {
    int ivar = 7;
    void m1(){
        System.out.print("A's m1, ");
    }
    void m2(){
        System.out.print("A's m2, ");
    }
    void m3(){
        System.out.print("A's m3, ");
    }
}

class ClassB extends ClassA{
    void m1(){
        System.out.print("B's m1, "+(ivar+6));
    }
}

class ClassC extends ClassB{
    void m3(){
        System.out.print("C's m3, ");
    }
}

 class Mixed2{
    public static void main(String[] args){
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        ClassA a2 = new ClassC();

        b.m1();
        c.m2();
        a.m3();
    }
}

