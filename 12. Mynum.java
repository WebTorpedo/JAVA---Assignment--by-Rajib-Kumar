/* Create class Number with only one private instance variable as a double
primitive type. To include the following methods (include respective
constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ),
isPrime(), isAmstrong() the above methods return boolean primitive type.
getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above
methods return double primitive type. void listFactor(), void dispBinary(). */

import java.lang.Math. *;
import java.lang.Number.*;
class Number

{
    private double number;
    public void setNum(int num){
        this.number=num;
    }
    public double getNum(){
        return number;
    }
    public boolean isZero(){
        if(number==0) return true;
        else return false;
    }
    public boolean isPositive(){
        if(number>0.00) return true;
        return false;
    }
    public boolean isNegative(){
        return !(isPositive());
    }
    public boolean isOdd(){
        if(number%2==0) return false;
        return true;
    }
    public boolean isEven(){
        return !(isOdd());
    }
    public boolean isPrime(){
        for(int i=2;i<number;i++){
            if(number%i==0) return false;
        }
        return true;
    }
    public double factorial(){
        double fact=1;
        for(double i=number;i>=1;i--) fact*=i;
        return fact;
    }
    public double getSqrt(){
        return Math.sqrt(number);
    }
    public double getSqr(){
        return number*number;
    }
    public double getSumdigit(){
        double ans=0;
        double newnumber=number;
        while(newnumber!=0){
            double rem=newnumber%10;
            ans+=rem;
            newnumber/=10;
        }
        return ans;
    }
    public double getReverse(){
        long reverse=0,newnumber=(long)number;
        while(newnumber!=0){
            long rem=newnumber%10;
            reverse=reverse*10+rem;
            newnumber/=10;
        }
        return reverse;
    }
    public void dispBinary(){long lg= (long)number;
        System.out.println(Long.toBinaryString(lg));
    }
}
public class Mynum {
    public static void main (String args [])
    {
        Number mynum = new Number( );
        mynum.setNum(10);
        System.out.println ("isZero " + mynum.isZero() );
        System.out.println ("isPositive " + mynum. isPositive());
        System.out.println ("isNegative " + mynum.isNegative() );
        System.out.println ("isOdd " + mynum.isOdd());
        System.out.println ("isEven " + mynum.isEven());
        System.out.println ("isPrime " +mynum.isPrime());
        System.out.println ("getFactorial " + mynum.factorial());
        System.out.println ("getSqrt " + mynum. getSqrt( ));
        System.out.println ("getSqr " + mynum.getSqr( ) );
        System.out.println ("sumDigits " + mynum.getSumdigit());
        System.out.println ("getReverse " + mynum.getReverse( ));
        mynum.dispBinary();
        System.out.println ("isPrime " +mynum.isPrime());
    }
}
