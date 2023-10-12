/**
 * Data Structures and Algorithms project
 */

public class Person201NearbyDemo {
    public static void main(String[] args) throws Exception {
        Person201 query = new Person201("Ricardo",46.9994, -122.3921,"harambee");

        String largeFileName = "data/large.txt";
        String encryptedFileName = "data/encrypted.txt";
        String largeURL = "https://courses.cs.duke.edu/fall23/compsci201/data/large.txt";
        String encryptedURL = "https://courses.cs.duke.edu/fall23/compsci201/data/encrypted.txt";
        String encryptKey = "DukeComputing201";

        double minDistance = 50.0;

        Person201[] people = Person201Utilities.readFile(largeFileName);
        Person201[] people = Person201Utilities.readEncryptedFile(encryptedFileName,encryptKey);      
        Person201[] people = Person201Utilities.readEncryptedURL(encryptedURL,encryptKey);

        System.out.println("\nSearching for people near " + query.getName());
        System.out.println("distance\tperson");
        int total = 0;
        for (Person201 p : people) {
            double d = Person201Utilities.distance(query.getLatitude(), query.getLongitude(), p.getLatitude(), p.getLongitude());
           
            if (d < minDistance) {
                System.out.printf("%3.2f:\t%s\n",d,p);
                total++;
            }
        }
        System.out.println("\nFound " + total + " people near " + query.getName() + "\n");
    }
}
