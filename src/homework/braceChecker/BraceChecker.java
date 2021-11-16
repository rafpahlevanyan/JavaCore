package homework.braceChecker;

import lesson6.Stack;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String brace) {
        text = brace;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack mystack = new Stack();

        for (int j = 0; j < text.length(); j++) {
            char ch = text.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    mystack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!mystack.isEmpty())
                    {
                        char chx;
                        chx = (char) mystack.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
                                || (ch == ')' && chx != '('))
                            System.out.println("Error: " + "opened " + chx + " " + "but closed" + " " + ch + " at " + j);
                    } else

                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default:
                    break;
            }
        }
        if (!mystack.isEmpty())
            System.out.println("Error: missing right brace");
    }
}
