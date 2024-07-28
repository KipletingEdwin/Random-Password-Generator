import java.util.Random;

//this class works as the backend and will generate the password
public class PasswordGenerator {
    //character pools
    //these strings will hold the characters/numbers/numbers/symbols that we are going tpo randomly pick to generate our password

    public  static final String LOWERCASE_CHARACTERS = "qwertyuiopasdfghjklzxcvbnm";
    public  static  final String UPPERCASE_CHARACTERS = "QWERTYUIOPASDFGHJKLZXCVBNM";
    public  static  final String NUMBERS = "1234567890";
    public static final String SPECIAL_SYSMBOLS = ",./;'[]<>?:{}|~!@#$%^&*()_-";

    //the random class allows us to generate a random number which will be used to randomly choose the characters

    private  final Random random;

    //constructor
    public  PasswordGenerator(){
        random = new Random();
    }

    //length - length of the password to be generated (taken from the user)
    //includeUppercase and etc... considers if the password should include uppercase, lowercase, etc.... (taken from the user)

    public  String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSymbols){
        // we will use string builder over string for better efficiency
        StringBuilder passwordBuilder = new StringBuilder();

        //store valid characters(toggle states)
        String validCharacters = "";
        if(includeUppercase) validCharacters += UPPERCASE_CHARACTERS;
        if(includeLowercase) validCharacters += LOWERCASE_CHARACTERS;
        if(includeNumbers) validCharacters += NUMBERS;
        if(includeSymbols) validCharacters += SPECIAL_SYSMBOLS;

        //build password

        for (int i = 0; i < length; i++){
            //generate a random index
            int randomIndex = random.nextInt(validCharacters.length());

            //get the char based on the random index
            char randomChar = validCharacters.charAt(randomIndex);

            //store char into password builder
            passwordBuilder.append(randomChar);

            //do this until we have reached the length that the user has provided us
        }

        //return the result
        return  passwordBuilder.toString();

    }
}
