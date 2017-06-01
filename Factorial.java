/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler20java;

import java.math.BigInteger;

/**
 *
 * @author gabriel
 */
public class Factorial {
 
    BigInteger hunnids = new BigInteger("100");
  
    Factorial(){
        System.out.println(sum(fac()));
    }
    
    public BigInteger fac(){
        BigInteger f = new BigInteger("1");
        for(int i = hunnids.intValue(); i > 0; --i){
            f = f.multiply(new BigInteger(Integer.toString(i))); 
        }
        return f;
    }

    public String sum(BigInteger f){
        System.out.println("f Factorial: " + f);
        BigInteger sum = new BigInteger("0");
        BigInteger addend = new BigInteger("0");
        String num = f.toString();
        for(int i = 0; i < num.length(); i++){
           addend = new BigInteger(Character.toString(num.charAt(i))); 
           sum = sum.add(addend);
        }
        return sum.toString();
    }
    
    
}
