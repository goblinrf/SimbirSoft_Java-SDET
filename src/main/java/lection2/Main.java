package lection2;

import lection2.Exception.WrongLoginException;
import lection2.Exception.WrongPasswordException;

public class Main {
    public static boolean AuthorizationValidation(String login, String password, String confirmPassword) {
        String regex = "^[a-zA-Z0-9_]+$";
        try {
            if (login.length() >= 20 || !login.matches(regex)) {
                throw new WrongLoginException("Login должен содержать только латинские буквы, цифры и знак подчеркивания и быть меньше 20 символов");
            }

            if (password.length() >= 20 || !password.matches(regex)) {
                throw new WrongPasswordException("Password должен содержать только латинские буквы, цифры и знак подчеркивания и быть меньше 20 символов");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            return true;

        } catch (WrongLoginException  e) {
            System.out.println(e.getMessage());
            return false;
        }
        catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public static void main(String[] args) {
        String login = "validLogin_123";
        String password = "validPass_123";
        String confirmPassword = "validPass_123";

        boolean isValid = AuthorizationValidation(login, password,confirmPassword);
        System.out.println("Результат проверки: " + isValid);
    }

}
