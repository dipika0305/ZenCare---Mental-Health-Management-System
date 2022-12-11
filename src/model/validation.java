/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Mitali Chouthai
 */
public class validation {
        public boolean ValidatePassword(String value) {
        String PATTERN = "^[a-zA-Z0-9]{5,12}$";
        return MatchPattern(PATTERN, value);
    }

    public boolean ValidateUsername(String value) {
        String PATTERN = "^(?=.{3,20}$)(?![.])[a-zA-Z0-9._]+(?<![.])$";
        return MatchPattern(PATTERN, value);
    }
public boolean ValidateEmail(String value) {
        String PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)+$";
        return MatchPattern(PATTERN, value);
    }
public boolean ValidateAge(String value) {
        String PATTERN = "^(0?[1-9]|[1-9][0-9]|[1][1-9][1-9]|200)$";
        return MatchPattern(PATTERN, value);
    }
    public boolean ValidateName(String value) {
        String PATTERN = "^[A-Za-z]+([\\ A-Za-z]+)*";
        return MatchPattern(PATTERN, value);
    }    
    
    public boolean ValidateEmpty(String value) {
        return !value.isEmpty();
    }
    
    private boolean MatchPattern(String pattern, String value) {
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(value);
        return match.matches();
    }

}
