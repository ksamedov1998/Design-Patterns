package behavioral.interpreter;

/*
    Concept
        Represent grammer
        Interpret a sentence
        Map a domain
        AST (Abstact Sentence Tree)
    Example
        java.util.Pattern
        java.text.Format
    Design
        AbstractExpression declare interface
        Interpret method
        Terminal Expression
        Nonterminal Expression
    UML
        Context (save global info)
        AbstractExpression    
            -Terminal Expression
            -Nonterminal Expression
    Sample code
        Strinng input = "Lions, and tigers, and bears! Oh, my!";
        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger"));
        Matcher m = p.matcher(input)
        while(m.find()){
            sysout("Fount a " + m.group() + ".")
        }
    Pitfalls
        Complexity
        Class per rule
        Spesific case
*/
public class Main {
    static Expression buildInterpreterTree(){
        Expression terminal1= new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression orExpression = new OrExpression(terminal1, terminal2);
        Expression andExpression = new AndExpression(terminal1, terminal2);
        return new AndExpression(orExpression,andExpression);
    }
    public static void main(String[] args) {
        // String context = "Lions";
        String context = "Lions Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}