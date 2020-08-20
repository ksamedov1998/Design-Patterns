package creational.factory;

/*
 * Concepts:
 *   Doesn't expose instantiation logic
 *   Defer to subclasses
 *   Common interface
 *   Specified by architecture , implemented by user
 * Examples:
 *   Calendar
 *   NumberFormat
 *   RecourseBundle
 *
 * Design
 *   Multiple concrete classes
 *   common interface
 *   responsible for lifecycle
 *   parameterized create method
 * it is always great way to create enum rather than string literal
 */
public class FactoryMain {
    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteTypes.BLOG);
        System.out.println(website.getPageList());

        Website shopWebsite = WebsiteFactory.getWebsite(WebsiteTypes.SHOP);
        System.out.println(shopWebsite.getPageList());
    }
}
