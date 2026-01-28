package interviewques1;

public class commandLine {
	 // Main driver method
    public static void main(String[] args)
    {
        // Checking if length of args array is
        // greater than 0
        if (args.length > 0) {
        	
        	System.out.println(args.length);

            // Print statements
            System.out.println("The command line"
                               + " arguments are:");

            // Iterating the args array
            // using for each loop
            for (String val : args)

                System.out.println(val);
        }
        else

            System.out.println("No command line "
                               + "arguments found.");
    }
}


/* * To add arguments in command line while
 * In Eclipse: Right-click your class > Run As > Run Configurations. Go to the
 * Arguments tab and type your value in the Program arguments box.
 */

