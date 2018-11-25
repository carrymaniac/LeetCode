package cn.code;

public class s7 {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1 ; i>0;i--){
            if(digits[i]+1<10){
                digits[i] = digits[i]+1;
                break;
            }else {
                digits[i]=0;
            }
        }

        return digits;
    }
}
