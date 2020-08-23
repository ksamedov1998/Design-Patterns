package structural.composite;

/*
 * Components represent part or whole structure
 *
 * Compose object into tree structure
 * Individual object treated as Composite
 * Same operation applied on individual and composites
 * Examples
 *   java.awt.Component
 *   JSF widgets
 *   RESTful service GETs
 *
 * Design
 *   Tree structure
 *   Component
 *   Leaf or composite
 *   Composite knows about child objects
 *   component,leaf,composite
 *
 * Sample Map
 *
 *   Map<String,String> personAttributes = new HashMap<>();
 *   personAttributes.put("site_role","person");
 *   personAttributes.put("access_role","limited");
 *
 *   Map<String,String> secAttributes = new HashMap<>();
 *  personAttributes.putAll(personAttributes);
 *
 * We add features to top level and then implement in lower levels.
 * Like below example, All elements are extended from MenuComponent and it contains all stuff, then we implement features at some levels if needed
 *
 * Pitfalls
 *      Overly simplify system
 *      Difficult to restrict
 *      Implementation can possibly be costly
 */
public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/Main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(safetyMenuItem);
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }


}
