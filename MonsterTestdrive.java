public class MonsterTestdrive {
    
}

class Monster{
    boolean frighten(int d){
        System.out.println("arrrgh");
        return true;
    }
}

class Vampire extends Monster{
    boolean frighten(int d){
        System.out.println("a bite?");
        return false;
    }
}
class Dragon extends Monster{
    boolean frighten(int degree){
        System.out.println("breath fire");
        return true;
    }
}
