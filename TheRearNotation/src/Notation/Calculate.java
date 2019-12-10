package Notation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Calculate {
	
	private String arithmetic;
    private Stack<String> stack = new Stack<>();
    private Stack<String> calStack = new Stack<>();
    String  nonation= "";
    String factor = "";
    
    public Calculate(String arithmetic) {
        this.arithmetic = arithmetic;
    }

    public String changeToPostfix(){ // 10.1+(1+(9-2)+1)+1

        for(int i = 0; i < arithmetic.length(); i++) {
        	factor = arithmetic.substring(i,i+1);
        	
        	
        	if(isStringToNumber(factor) || factor.equals(".")) { // 만약 문자열이 숫자이면
        		nonation += factor;
        		
        	}else if(factor.equals("+") || factor.equals("-")){
        		nonation += " ";
        		
        		if(!stack.empty() && !stack.peek().equals("(")){ // 스택이 비어있지 않고 top이 '('가 아니면	
        			 while(!stack.empty()){
                        String temp = stack.pop();
                        if(temp.equals("(")){
                            stack.push("(");                           
                            break;
                        }
                        nonation += temp+" ";
                    }
                }
                stack.push(factor);
                
        	}else if(factor.equals("×") || factor.equals("/")) {
        		nonation += " ";
        		
        		if( !stack.empty() && (stack.peek().equals("×")||stack.peek().equals("/")) ){
                    while(!stack.empty()){
                    	String temp = stack.pop();
                        if(temp.equals("(")){
                            stack.push("(");
                            break;
                        }
                        else if(temp.equals("-")){
                            stack.push("-");
                            break;
                        }
                        else if(temp.equals("+")){
                            stack.push("+");
                            break;
                        }
                        nonation += temp + " ";
                    }
                }
                stack.push(factor);
                
        	}else if(factor.equals("(")) { // "(" 면 스택에 넣기       		
        		stack.push("(");
        		
        	}else if(factor.equals(")")) { // "(" 만날 때까지 스택에서 연산자를 뽑기
        		nonation += " ";
        		String temp;
        		while(true){
                    temp = stack.pop();
                    if(temp.equals("("))
                        break;
                    nonation += temp + " ";
                }
        	}	
        }
        while(!stack.empty())
        	nonation +=  " " + stack.pop() + " ";
        return nonation;
    }
    
    private boolean isStringToNumber(String s) {
    	  try { 		
    		  Double.parseDouble(s);
    		  return true;
    	  } catch (Exception e) {
    		  return false;
    	  }
    }

    public void print() {
    	///System.out.println(arithmetic);
    	//System.out.println(nonation);
    	
    	double op2;
    	double op1;
    	
    	String[] s = nonation.split(" ");
    	for(int i = 0; i < s.length; i++) {
    		System.out.println("토큰 : " + s[i]);
    		if(isStringToNumber(s[i])) {
    			String[] dot = s[i].split("");
    			System.out.println("길이" + dot.length);
    			for(int k = 0; k< dot.length; k++) {
    				
    				System.out.println(dot[k]);
    			}
    			if(dot[0].equals(".")) {// 배열 첫번때가 .이면 앞에 0을 붙이고 스택에 넣기
    				System.out.println("zzzzzzz");
    				calStack.push("0"+s[i]);
    			}
    			else
    				calStack.push(s[i]);
    		}else if(s[i].equals("+")) {
    			op2 = Double.parseDouble(calStack.pop());
    			op1 = Double.parseDouble(calStack.pop());    			
    			calStack.push(Double.toString(op1 + op2));
    		}else if(s[i].equals("-")) {
    			op2 = Double.parseDouble(calStack.pop());
    			op1 = Double.parseDouble(calStack.pop());    			
    			calStack.push(Double.toString(op1 - op2));
    		}else if(s[i].equals("×")) {
    			op2 = Double.parseDouble(calStack.pop());
    			op1 = Double.parseDouble(calStack.pop());    			
    			calStack.push(Double.toString(op1 * op2));
    		}else if(s[i].equals("/")) {
    			op2 = Double.parseDouble(calStack.pop());
    			op1 = Double.parseDouble(calStack.pop());    			
    			calStack.push(Double.toString(op1 / op2));
    		}
    	}
    	System.out.println(calStack.pop());
    }
    
    

}
