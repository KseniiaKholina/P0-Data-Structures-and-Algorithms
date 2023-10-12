public class Person201Farthest {

    public static void main(String[] args) throws Exception {
        String file = "data/large.txt";
        double maxDistance = 0;
        String personA = "";
        String personB = "";

        Person201[] people = Person201Utilities.readFile(file);

        for (int i = 0; i < people.length; i++) {
            for (int k = 0; k < people.length; k++) {
                double dist_ab = Person201Utilities.distance(people[i].getLatitude(), people[i].getLongitude(), people[k].getLatitude(), people[k].getLongitude());
                if (dist_ab > maxDistance) {
                    maxDistance = dist_ab;
                    personA = people[i].getName();
                    personB = people[k].getName();
                }
            }
        }

        System.out.printf("farthest distance is %.2f between %s and %s\n", maxDistance, personA, personB);
    }
}
