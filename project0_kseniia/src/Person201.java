/**
 * For use in Compsci 201, P0, Duke University
 * @author kk416, Kseniia Kholina
 *
 */
public class Person201 {

    private String myName;      // name of person
    private double myLatitude;  // latitude  (N is +, S is -)
    private double myLongitude; // longitude (W is -, E is +)
    private String myPhrase;    // phrase associated with person

    /**
     * Default constructor, creates object 
     */
    public Person201(){
        this.myName = "Owen";
        this.myLatitude = 35.9312;
        this.myLongitude = -79.0058;
        this.myPhrase = "woto";
    }

    /**
     * Construct Person201 object with information
     * @param name typically first name of person
     * @param lat latitude, negative for southern hemisphere
     * @param lon longitude, negative for western hemisphere
     * @param phrase for person
     */
    public Person201(String name,
                     double lat, double lon,
                     String phrase) {
        myName = name;
        myLatitude = lat;
        myLongitude = lon;
        myPhrase = phrase;
    }

    /**
     * Returns the latitude as double, negative for below equator
     * @return this person's latitude
     */
    public double getLatitude(){
        return myLatitude;
    }

    /**
     * Returns the longitude as double, negative for west of prime meridian
     * @return this person's longitude
     */
    public double getLongitude(){
        return myLongitude;
    }

    /**
     * Returns phrase for this person.
     * @return phrase for this person.
     */
    public String getPhrase(){
        return myPhrase;
    }

    /**
     * Returns name of this person.
     * @return name of this person
     */
    public String getName(){
        return myName;
    }


    /**
     * Returns String using E/W for longitude, N/S for latitude
     */
    @Override
    public String toString(){
        String lats = String.format("%06.2f",Math.abs(myLatitude));
        if (myLatitude < 0) {
            lats += "S";
        }
        else {
            lats += "N";
        }
        String lons = String.format("%06.2f",Math.abs(myLongitude));
        if (myLongitude < 0) {
            lons += "W";
        }
        else {
            lons += "E";
        }
        return String.format("%s,%s %s %s",lats,lons,myName,myPhrase);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person201) {
            Person201 other = (Person201) o;
            return myName.equals(other.myName) &&
                    myLatitude == other.myLatitude &&
                    myLongitude == other.myLongitude &&
                    myPhrase.equals(other.myPhrase);
        }
        return false;
    }

    /**
     * @param other is another Person201 object
     * @return distance from this person to other person
     */
    public double distanceFrom(Person201 other) {
        double correct_dist = Person201Utilities.distance(this.getLatitude(), this.getLongitude(), other.getLatitude(), other.getLongitude());
        return correct_dist;
    }
}

