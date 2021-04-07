public class Game {
    public void check(String sign)throws IllegalArgumentException{
        if(!(sign.equals("rock") || sign.equals("paper") || sign.equals("scissors"))){
            throw new IllegalArgumentException("Bad Choice!");
        }
    }
    public String play(String sign1, String sign2){
        int s1, s2;
        String result="";
        if(sign1.equals("rock")){
            s1=0;
        }else if(sign1.equals("paper")){
            s1=1;
        }else{
            s1=2;
        }
        if(sign2.equals("rock")){
            s2=0;
        }else if(sign2.equals("paper")){
            s2=1;
        }else{
            s2=2;
        }
        switch((s1+3-s2)%3){
            case 0:
                result="Draw!";
                break;
            case 1:
                result="Player 1 win!";
                break;
            case 2:
                result="Player 2 win!";
                break;
        }
        return result;
    }
}
