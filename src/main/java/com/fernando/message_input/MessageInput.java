package com.fernando.message_input;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Classe para ajudar na parte entrada de dados passando a mensagem
que vai aparecer no console como parâmetro.
 * @author fernandobarrosd: https://github.com/fernandobarrosd
 * @version 0.0.1
 */

public abstract class MessageInput {
    private static final Scanner SCANNER = new Scanner(System.in);
    private MessageInput() {}

    /** Printa a mensagem no console e retorna um Integer que veio do nextInt do Scanner
     * @return Integer - Um Integer que veio do nextInt do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Integer inputInteger(String message) {
        System.out.print(message);
        return SCANNER.nextInt();
    }

    /** Printa a mensagem e pula uma linha no console e retorna um Integer que veio do nextInt do Scanner
     * @return Integer - Um Integer que veio do nextInt do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Integer inputIntegerLn(String message) {
        System.out.println(message);
        return SCANNER.nextInt();
    }

    /** Printa a mensagem formatada no console e retorna um Integer que veio do nextInt do Scanner
     * @return Integer - Um Integer que veio do nextInt do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static Integer inputIntegerFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.nextInt();
    }

    







    /** Printa a mensagem no console e retorna um Double que veio do nextDouble do Scanner
     * @return Double - Um Double que veio do nextDouble do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Double inputDouble(String message) {
        System.out.print(message);
        return SCANNER.nextDouble();
    }

    /** Printa a mensagem e pula uma linha no console e retorna um Double que veio do nextDouble do Scanner
     * @return Double - Um Double que veio do nextDouble do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Double inputDoubleLn(String message) {
        System.out.println(message);
        return SCANNER.nextDouble();
    }

    /** Printa a mensagem formatada no console e retorna um Double que veio do nextDouble do Scanner
     * @return Double - Um Double que veio do nextDouble do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static Double inputDoubleFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.nextDouble();
    }








    /** Printa a mensagem no console e retorna um Float que veio do nextFloat do Scanner
     * @return Float - Um Float que veio do nextFloat do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Float inputFloat(String message) {
        System.out.print(message);
        return SCANNER.nextFloat();
    }

    /** Printa a mensagem e pula uma linha no console e retorna um Float que veio do nextFloat do Scanner
     * @return Float - Um Float que veio do nextFloat do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Float inputFloatLn(String message) {
        System.out.println(message);
        return SCANNER.nextFloat();
    }

    /** Printa a mensagem formatada no console e retorna um Float que veio do nextFloat do Scanner
     * @return Float - Um Float que veio do nextFloat do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static Float inputFloatFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.nextFloat();
    }








    /** Printa a mensagem no console e retorna um Long que veio do nextLong do Scanner
     * @return Long - Um Long que veio do nextLong do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Long inputLong(String message) {
        System.out.print(message);
        return SCANNER.nextLong();
    }

    /** Printa a mensagem e pula uma linha no console e retorna um Long que veio do nextLong do Scanner
     * @return Long - Um Long que veio do nextLong do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Long inputLongLn(String message) {
        System.out.println(message);
        return SCANNER.nextLong();
    }

    /** Printa a mensagem formatada no console e retorna um Long que veio do nextLong do Scanner
     * @return Long - Um Long que veio do nextLong do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static Long inputLongFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.nextLong();
    }

    




    /** Printa a mensagem no console e retorna um Short que veio do nextShort do Scanner
     * @return Short - Um Short que veio do nextShort do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Short inputShort(String message) {
        System.out.print(message);
        return SCANNER.nextShort();
    }

    /** Printa a mensagem e pula uma linha no console e retorna um Short que veio do nextShort do Scanner
     * @return Short - Um Short que veio do nextShort do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Short inputShortLn(String message) {
        System.out.println(message);
        return SCANNER.nextShort();
    }

    /** Printa a mensagem formatada no console e retorna um Short que veio do nextShort do Scanner
     * @return Short - Um Short que veio do nextShort do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static Short inputShortFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.nextShort();
    }






    /** Printa a mensagem no console e retorna uma String que veio do next do Scanner
     * @return String - Uma String que veio do next do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static String inputString(String message) {
        System.out.print(message);
        return SCANNER.next();
    }

    /** Printa a mensagem e pula uma linha no console e retorna uma String que veio do next do Scanner
     * @return String - Uma String que veio do next do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static String inputStringLn(String message) {
        System.out.println(message);
        return SCANNER.next();
    }

    /** Printa a mensagem formatada no console e retorna uma String que veio do next do Scanner
     * @return String - Uma String que veio do next do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static String inputStringFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.next();
    }

    






    /** Printa a mensagem no console e retorna um char.
     * @return char
     * @param message String - A mensagem que vai aparecer no terminal
     * @throws InputMismatchException
     */
    public static char inputChar(String message) {
        System.out.print(message);
        String value = SCANNER.next();

        if (value.length() > 1) {
            throw new InputMismatchException("The input value should be one character");
        }
        return value.charAt(0);
    }

    /** Printa a mensagem e pula uma linha no console e retorna um char
     * @return char
     * @param message String - A mensagem que vai aparecer no terminal
     * @throws InputMismatchException
     */
    public static char inputCharLn(String message) {
        System.out.println(message);
        String value = SCANNER.next();

        if (value.length() > 1) {
            throw new InputMismatchException("The input value should be one character");
        }
        return value.charAt(0);
    }

    /** Printa a mensagem formatada no console e retorna um char
     * @return char
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     * @throws InputMismatchException
     */
    public static char inputCharFormat(String format, Object ...args) {
        System.out.printf(format, args);
        String value = SCANNER.next();

        if (value.length() > 1) {
            throw new InputMismatchException("The input value should be one character");
        }
        return value.charAt(0);
    }





    /** Printa a mensagem no console e retorna um BigDecimal que veio do nextBigDecimal do Scanner
     * @return BigDecimal - Um BigDecimal que veio do nextBigDecimal do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static BigDecimal inputBigDecimal(String message) {
        System.out.print(message);
        return SCANNER.nextBigDecimal();
    }

    /** Printa a mensagem e pula uma linha no console e retorna um BigDecimal que veio do nextBigDecimal do Scanner
     * @return BigDecimal - Um BigDecimal que veio do nextBigDecimal do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static BigDecimal inputBigDecimalLn(String message) {
        System.out.println(message);
        return SCANNER.nextBigDecimal();
    }

    /** Printa a mensagem formatada no console e retorna um BigDecimal que veio do nextBigDecimal do Scanner
     * @return BigDecimal - Um BigDecimal que veio do nextBigDecimal do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static BigDecimal inputBigDecimalFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.nextBigDecimal();
    }







    /** Printa a mensagem no console e retorna um BigInteger que veio do nextBigInteger do Scanner
     * @return BigInteger - Um BigInteger que veio do nextBigInteger do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static BigInteger inputBigInteger(String message) {
        System.out.print(message);
        return SCANNER.nextBigInteger();
    }

    /** Printa a mensagem e pula uma linha no console e retorna um BigInteger que veio do nextBigInteger do Scanner
     * @return BigInteger - Um BigInteger que veio do nextBigInteger do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static BigInteger inputBigIntegerLn(String message) {
        System.out.println(message);
        return SCANNER.nextBigInteger();
    }

    /** Printa a mensagem formatada no console e retorna um BigInteger que veio do nextBigInteger do Scanner
     * @return BigInteger - Um BigInteger que veio do nextBigInteger do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static BigInteger inputBigIntegerFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.nextBigInteger();
    }






    /** Printa a mensagem no console e retorna um Boolean que veio do nextBoolean do Scanner
     * @return Boolean - Um Boolean que veio do nextBoolean do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Boolean inputBoolean(String message) {
        System.out.print(message);
        return SCANNER.nextBoolean();
    }

    /** Printa a mensagem e pula uma linha no console e retorna um Boolean que veio do nextBoolean do Scanner
     * @return Boolean - Um Boolean que veio do nextBoolean do Scanner
     * @param message String - A mensagem que vai aparecer no terminal
     */
    public static Boolean inputBooleanLn(String message) {
        System.out.println(message);
        return SCANNER.nextBoolean();
    }

    /** Printa a mensagem formatada no console e retorna um Boolean que veio do nextBoolean do Scanner
     * @return Boolean - Um Boolean que veio do nextBoolean do Scanner
     * @param format String - O formato da mensagem
     * @param args - Os argumentos que foram passados no format que possuem o %
     */
    public static Boolean inputBooleanFormat(String format, Object ...args) {
        System.out.printf(format, args);
        return SCANNER.nextBoolean();
    }
}