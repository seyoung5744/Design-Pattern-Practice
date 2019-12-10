package Notation;

public class DecimalAndHeximal {
	String arithmetic_result;

    public String toHeximal(){
        Double result = Double.parseDouble(arithmetic_result);
        System.out.println(result);
        
        Long re =  Double.doubleToRawLongBits(result);
        
        return String.format("0x%X%n", re);
    }

    public void setArithmetic_result(String arithmetic_result){
        this.arithmetic_result = arithmetic_result;
    }
}
