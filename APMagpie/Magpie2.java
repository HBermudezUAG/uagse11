/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting  
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
 
    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("cat") >= 0
                || statement.indexOf("dog") >= 0
                || statement.indexOf("bird") >= 0
                || statement.indexOf("fish") >= 0)
        {
            response = "Tell me more about your pets";
        }
        else if (statement.toLowerCase().indexOf("mr.chen") >= 0
                || statement.toLowerCase().indexOf("chen") >= 0
                || statement.toLowerCase().indexOf("chenpai") >= 0
                || statement.toLowerCase().indexOf("chenpacolypse") >= 0)
        {
            response = "Tell me more about your Onii-Chan";
        }
         else if (statement.toLowerCase().indexOf("Onii-chan") >= 0)
        {
            response = "aishiteru yo Onii-Chan";
        }
         else if (statement.toLowerCase().indexOf("weeb") >= 0
                || statement.toLowerCase().indexOf("weaboo") >= 0)
        {
            response = "S-Stop it your making me blush ";
        }
         else if (statement.toLowerCase().indexOf("neko") >= 0
                || statement.toLowerCase().indexOf("catgirl") >= 0)
        {
            response = "Nyaaaaaa koro koro koro koro";
        }
        else if (statement.trim().length() == 0)
        {
            response = "Say something Onii-chan";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
 
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
 
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Nico Nico Nii~~";
        }
        else if (whichResponse == 5)
        {
            response = "Y-Your making me Blush Hmph Baka";
        }
 
        return response;
    }
}