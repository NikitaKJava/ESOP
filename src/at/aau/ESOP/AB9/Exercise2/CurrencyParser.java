package at.aau.ESOP.AB9.Exercise2;

import java.util.Scanner;
/**
 * Created by Nikita on 26.05.2021 at 17:55
 */

public class CurrencyParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine();

        for (int i = 0; i < testCases; i++) {
            Currency currency = parseCurrency(in.nextLine());
            System.out.println(currency);
        }
    }

    // TODO Define your method here

    /**
     *  Schreiben Sie eine Funktion public static Currency parseCurrency(String input), welche einen Geldbetrag als String übergeben bekommt und den Geldbetrag,
     *  inklusive der verwendeten Waehrung, herausliest. Die Dezimalstellen vor dem Komma, die Dezimalstellen nach dem Komma und die verwendete Währung sollen
     *  in separate Variablen geschrieben und schlussendlich als Objekt vom Typ Currency zurückgegeben werden. Durch dieses Vorgehen wird ermöglicht, dass eine
     *  Funktion mehrere Rückgabewerte, verpackt als Objekt zurückgibt.
     */
    public static Currency parseCurrency(String input){
        Currency currency = new Currency();
        input = input.replaceAll("\\.", " ");
        String[] newString = input.split(" ");
        currency.setNumber(Integer.parseInt(newString[0]));
        currency.setDecimal(Integer.parseInt(newString[1]));
        currency.setCurrencyCode(newString[2]);
        return currency;
    }

    /**
     * Currency class, which allows to represent arbitrary amounts of money without rounding error, since the
     * decimal places are represented by a integers and not approximated.
     */
    public static class Currency {

        private int number;
        private int decimal;
        private String currencyCode;


        /**
         * Returns the decimal places before the decimal point
         *
         * @return Decimal places before the decimal point
         */
        public int getNumber() {
            return number;
        }

        /**
         * Set the decimal places before the decimal point
         *
         * @param number Decimal places before the
         */
        public void setNumber(int number) {
            this.number = number;
        }

        /**
         * Returns the decimal places after the decimal point
         *
         * @return Decimal places after the decimal point
         */
        public int getDecimal() {
            return decimal;
        }

        /**
         * Set the decimal places after the decimal point
         *
         * @param decimal Decimal after before the
         */
        public void setDecimal(int decimal) {
            this.decimal = decimal;
        }

        /**
         * Returns the three character currency code
         *
         * @return Three character currency code
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Set the three character currency code
         *
         * @param currencyCode The three character currency code
         */
        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        @Override
        public String toString() {
            return String.format("[%s] %d.%d", currencyCode, number, decimal);
        }
    }
}