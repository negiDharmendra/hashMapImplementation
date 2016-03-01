
public class MyNumber {
    private  long num = 0;

    public MyNumber(long num) {
        this.num = num;
    }

    public boolean isTwosPower() {
        if(num==1||num==2)return true;
        long result = num;
        while (result > 2) {
            if(result%2!=0)return false;
            result = result >> 1;
            if(result==2)return true;
        }
        return false;
    }
}
