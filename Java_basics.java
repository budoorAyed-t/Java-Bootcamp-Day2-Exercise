import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Java_Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder stringBuilder;

        //1.
        //Develop a program that takes the weight (in kilograms) and height (in meters)
        //as input and calculates the BMI, then prints it.

        System.out.println("          BMI Calculator");

        System.out.print("Enter your weight (in kilograms): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = input.nextDouble();

        double BMI = weight/(height*height);

        System.out.printf("IBM = %.2f\n", BMI);

        //2.
        //Write a program that takes the obtained marks and total marks as input and
        //calculates the percentage, then prints it.

        System.out.println("\n            Percentage Calculator");

        System.out.print("Enter the obtained marks: ");
        double obtainedMarks = input.nextDouble();

        System.out.print("Enter the total marks: ");
        int totalMarks = input.nextInt();

        double percentage = (obtainedMarks/totalMarks)*100;

        System.out.printf("Percentage: %.1f%%\n", percentage);

        //3.
        //Create a program that takes an amount in one currency and an exchange rate
        //as input, then converts and prints the amount in another currency.

        System.out.println("\n            Currency Exchange");

        System.out.print("Enter the money amount to exchange: ");
        double amount = input.nextDouble();

        System.out.print("Enter the exchange rate: ");
        double exchangeRate = input.nextDouble();

        double newAmount = amount*exchangeRate;

        System.out.printf("The new amount after exchange rate: %.1f\n", newAmount);

        //4.
        //Create a program that takes a string as input, calculates its length, and then
        //reverses the string using the StringBuilder class, finally printing both the length and
        //reversed string.

        System.out.println("\n            String Reverse");

        System.out.print("Enter the sentence to print in reverse: ");
        String sentenceReverse = input.next();
        sentenceReverse += input.nextLine();


        stringBuilder = new StringBuilder(sentenceReverse); // now initiate the string builder object for the sentence to use the reverse method.

        System.out.println("The length of the sentence: " + sentenceReverse.length());
        System.out.println("The reversed sentence: " + stringBuilder.reverse());

        //5.
        //Develop a program that takes a sentence as input and extracts a substring from
        //it, then prints the extracted substring.

        System.out.println("\n            String Extraction");

        System.out.print("Enter the sentence you want to extract text from: ");
        String sentenceExtract = input.nextLine();

        System.out.print("Enter the start index: ");
        int firstIndex = input.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = input.nextInt();

        String extractedString = sentenceExtract.substring(firstIndex, endIndex);

        System.out.println("The extracted text: " + extractedString);

        //6.
        //Write a program that takes a sentence and a keyword as input, then check if
        //the keyword is present in the sentence and prints the result.

        System.out.println("\n            Keyword Check");

        System.out.print("Enter the sentence: ");
        String sentenceCheck = input.nextLine();

        System.out.print("Enter a keyword: ");
        String keyword = input.nextLine();

        boolean keywordPresent = sentenceCheck.contains(keyword);

        System.out.println("Keyword \"" + keyword + "\" is present in the sentence: " + keywordPresent);

        //7.
        //Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified
        //sentence.

        System.out.println("\n            Word Replacement");

        System.out.print("Enter the initial sentence: ");
        String initialSentence = input.nextLine();

        System.out.print("Word to replace: ");
        String wordToReplace = input.nextLine();

        System.out.print("Replacement Word: ");
        String replacementWord = input.nextLine();

        String modifiedSentence = initialSentence.replace(wordToReplace, replacementWord);

        System.out.println("The new sentence after word replacement: \n" + modifiedSentence);

        //8.
        //Write a program that takes two strings as input and check if they are equal,
        //ignoring the case, then prints whether they are equal or not.

        System.out.println("\n            String Equality Test");

        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        boolean stringEquality = firstString.equalsIgnoreCase(secondString);

        System.out.println("Strings are equal (ignoring case): " + stringEquality);


    }
}
