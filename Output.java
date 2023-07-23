public class Output {
    

    public static void main(String [] args){
        Output o = new Output();
        o.go();
    }


    void go(){
        int y = 7;
        for(int x = 1; x<8; x++){
            y++;
            if(x>3){
               
                System.out.print(++y + " ");

            }
            // break;
            if(y>14){
                System.out.println(" x = "+ x);
                break;
            }
        }
    }
}
