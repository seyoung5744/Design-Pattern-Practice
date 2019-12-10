package test;

import java.util.Stack;

public class translate {
	 private Stack<String> stack = new Stack<>();
	    private Stack<String> calStack = new Stack<>();

	    private String arithmetic;
	    private String  nonation= "";
	    private String factor = "";


	    private void changeToPostfix() {

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
	    }

	    public String calculate() {
	        changeToPostfix();
	        double op2;
	        double op1;
	        String[] last;
	        String[] s = nonation.split(" ");

	        for (int i = 0; i < s.length; i++) {
	            if (isStringToNumber(s[i])) {
	                
	                String[] dot = s[i].split("");
	                
	                for(int k = 0; k < dot.length; k++) {
	                    String kk = Integer.toString(k);
	                    
	                }
	                if(dot[0].equals(".")) {// 배열 첫번때가 .이면 앞에 0을 붙이고 스택에 넣기
	                    calStack.push("0" + s[i]);
	                }
	                else
	                    calStack.push(s[i]);
	            } else if (s[i].equals("+")) {
	                op2 = Double.parseDouble(calStack.pop());
	                op1 = Double.parseDouble(calStack.pop());
	                calStack.push(Double.toString(op1 + op2));
	            } else if (s[i].equals("-")) {
	                op2 = Double.parseDouble(calStack.pop());
	                op1 = Double.parseDouble(calStack.pop());
	                calStack.push(Double.toString(op1 - op2));
	            } else if (s[i].equals("×")) {
	                op2 = Double.parseDouble(calStack.pop());
	                op1 = Double.parseDouble(calStack.pop());
	                calStack.push(Double.toString(op1 * op2));
	            } else if (s[i].equals("/")) {
	                op2 = Double.parseDouble(calStack.pop());
	                op1 = Double.parseDouble(calStack.pop());
	                calStack.push(Double.toString(op1 / op2));
	            }
	        }

	        if(!calStack.empty()) {
	        	last = calStack.peek().split("");

	        	if(last[last.length-1].equals("0")) {
	        		String decimal = calStack.pop(); // pop으로 고치기
	        		calStack.push(decimal.substring(0, last.length-2));
	        	}
	        	return calStack.pop();
	        }
	        return "";
	    }


	    public boolean isStringToNumber(String s) {
	        try {
	        	String[] ss = s.split("");
	        	
	        	int count = 0;
	        	for(int i = 0; i < ss.length; i++)
	        		if(ss[i].equals("."))
	        			count++;
	        	
	        	System.out.println("몇개? " + count);
	        	
	        	if(ss[ss.length-1].equals(".")) {
	        		System.out.println("ttt"+s.substring(0,s.length()-1));
	        		return false;
	        	}else {
	        	
	        		Double.parseDouble(s);
	        		return true;
	        	}
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public void setText(String arithmetic){
	        this.arithmetic = arithmetic;
	        this.nonation = " ";
	    }
}
