import java.util.*;

public class Transform_the_Expression {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int t = ob.nextInt();
        String x = ob.nextLine();

        while(t > 0){
            String a = ob.nextLine();
            String ans = "";
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < a.length();i++){
                char ch = a.charAt(i);

                if(Character.isLetter(ch)){
                    ans = ans + ch;
                }

                else if(ch == ')'){
                    while(!stack.empty() && stack.peek() != '('){
                        char b = stack.pop();
                        ans = ans + b;
                    }
                    stack.pop();
                }

                else {

                    if(stack.empty() || ch == '('){
                        stack.push(ch);
                    }

                    else if(checkPriority(ch) > checkPriority(stack.peek())){
                        stack.push(ch);
                    }

                    else{
                        char b = stack.pop();
                        ans = ans + b;
                        stack.push(ch);
                    }
                }
            }

            while(!stack.empty()){
                ans = ans + stack.pop();
            }

            System.out.println(ans);
            t--;
        }
    }

    private static int checkPriority(char ch){

        int p = 0;

        switch (ch){

            case '+':
                p = 1;
                break;
            case '-':
                p = 2;
                break;
            case '*':
                p = 3;
                break;
            case '/':
                p = 4;
                break;
            case '^':
                p = 5;
                break;
            case '(':
                p = 0;
                break;
        }

        return p;
    }
}
