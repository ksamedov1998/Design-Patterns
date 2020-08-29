package behavioral.strategy;

/*
 *   When you want to choose the algorithm at runtime
 *   Concept
 *       Eliminate conditional statements
 *       Behavior encapsulated in classes
 *       Difficult to add new strategies
 *       Client aware of strategies
 *       Client chooses strategy
 *   Example
 *       java.util.Comparator
 *   Design
 *       Typically abstract based class
 *       Concrete class per strategy
 *       Remove if/else conditionals
 *       Context,Strategy,ConcreteStrategy
 *   UML
 *       Context
 *       Strategy
 *           -ConcreteStrategy1
 *           -ConcreteStrategy2
 *   Sample code
 *       Collections.sort(people,new Comparator<Person>){
 *       @Override
 *       public int compare(Person o1,Person o2){
 *           if(...){
 *               ....
 *               return 1
 *           }
 *           if(...){
 *               ....
 *               return -1
 *           }
 *           return 0;
 *           }
 *       }
 *   Pitfalls
 *      Client aware of Strategies
 *      Increased number of classes
 */
public class Main {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setCvv("123");
        amexCard.setDate("08/2020");
        amexCard.setNumber("379185883464283");
        System.out.println("Is Amex valid ? : " + amexCard.isValid() );
    }
}
