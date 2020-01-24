package sample;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class passwordGen {
    public static void gen(int lengthOfPassword){
        lengthOfPassword = Math.max(lengthOfPassword, 8);
        System.out.println(generatePassayPassword(lengthOfPassword));
    }
    private static String generatePassayPassword(int lengthOfPassword) {
        PasswordGenerator gen = new PasswordGenerator();
        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
        lowerCaseRule.setNumberOfCharacters(2);

        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
        upperCaseRule.setNumberOfCharacters(2);

        CharacterData digitChars = EnglishCharacterData.Digit;
        CharacterRule digitRule = new CharacterRule(digitChars);
        digitRule.setNumberOfCharacters(2);

        CharacterData specialChars = EnglishCharacterData.Special;
        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(2);
        /*
        CharacterData specialChars = new CharacterData() {
            @Override
            public String getErrorCode() {
                return null;
            }

            @Override
            public String getCharacters() {
                return "!@#$%^&*()_+";
            }
        };
        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(2);*/

        String password = gen.generatePassword(lengthOfPassword, splCharRule, lowerCaseRule, upperCaseRule, digitRule);
        return password;
    }
}
