// problem:
// Write a java program that use the String, “Fast-and-Furious” to print the following output.
// Fast
// and
// Furious

// FAST AND FURIOUS


public class usage_of_Strings_example_1 {
    public static void main(String[] args){

        // initializing and assingning value to the variable
        String text="Fast-and-Furious";

        // split the text from where the character "-" appears
        String[] parts=text.split("-");

        // loop to print each word after split
        for(String word:parts){
            System.out.println(word);
        }

        // replace the character "-" with " "
        String result=text.replace("-", " ").toUpperCase();  // .toUpperCase() will turn the words into Capital letters
        System.out.println(result);
    }
}
