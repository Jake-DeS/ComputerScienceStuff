// Jake DeSantis
// lab 3
// Part 2
// latitude and longitude stuff
//Jake DeSantis
//lab 3 part 2
// convert cordinates into more readable text
public class compass {
    public static void main(String[] args) {

        String lat="385323N";                    // latitude
        String latDegrees=lat.substring(0,2);    // the degrees of latitude
        String latMinute=lat.substring(3,5);     // the minute of latitude
        String latSeconds=lat.substring(5,6);    // the seconds of latitude
        String latDirection=lat.substring(6,7);  // the direction of latitude

        String longitude="770027W";                      // longitude
        String longDegrees=longitude.substring(0,2);     // the degrees of longitude
        String longMinute=longitude.substring(3,5);      // the minute of longitude
        String longSeconds=longitude.substring(5,6);     // the seconds of longitude
        String longDirection=longitude.substring(6,7);   // the direction of longitude

        System.out.println("The Capital is located at");  //setting the Scene
        System.out.println(latDegrees + (" degrees ")+ latMinute + (" Minutes and ") + latSeconds + (" seconds ") + latDirection);     // printing latitude out into the console
        System.out.println(longDegrees + (" degrees ")+ longMinute + (" Minutes and ") + longSeconds + (" seconds ") + longDirection); // printing longitude out into the console

    }
}
