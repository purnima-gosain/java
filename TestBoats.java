public class TestBoats {
    

    public static void main(String[] args){

    }
}

 class Boat{
    private int length;
    public void setLength(int len){
        length = len;
    }

    public int getLength(){
        return length;
    }

    public void move(){
        System.out.print("drift ");
    }
}

class Sailboat extends Boat{
    public void move(){
        System.out.print(" hoist sail ");
    }
}

class RowBoat extends Boat{
    public void rowTheBoat(){
        System.out.print("stroke natasha");
    }

}


