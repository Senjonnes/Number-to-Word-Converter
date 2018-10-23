package ObjectOrientedProgramming;

import java.util.Scanner;

public class ConverterAgain {
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in); System.out.println("Enter a value between 1 and 1000000000000");
        long Value = num.nextLong(); System.out.println(Value + " in word is: "); System.out.print(remainder(Value));
    }
    public static String figures (long Value) {
        String str = "";
        if (Value == 0) {
            str += "Zero";
        }
        while (Value != 0) {
            if (Value >= 100 && Value <= 999) {
                long newValue = Value; str += UnitToTrillion(Value/100) + " Hundred"; Value %= 100;
                if (newValue % 100 != 0) {
                    str += " and "; Value = Value % 100;
                }
            } else {
                if (Value >= 20) {
                    str += TwentyToNinetyNine(Value/10) + " "; Value = Value % 10;
                }
                if (Value >= 1) {
                    str += UnitToTrillion(Value);
                }
                break;
            }
        }
        return str;
    }
    public static String remainder (long value) {
        String str = "";
        if (value == 0) {
            str += figures(value);
        }
        while (value != 0) {
            if (value >= 1 && value <= 19) {
                str += figures(value); value -= value;
            } else if (value >= 20 && value <= 99) {
                str += figures(value); value -= value;
            } else if (value >= 100 && value <= 999) {
                long newValue = value; str += figures(value/100); str += " Hundred "; value %= 100;
                if (newValue % 100 != 0) {
                    str += "and "; value %= 100;
                }
            } else if (value >= 1000 && value <= 999999) {
                long newValue = value; str += figures(value/1000); str += " Thousand "; value %= 1000;
                if (newValue % 1000 != 0 && newValue % 1000 >= 1 && newValue % 1000 <= 99) {
                    str += "and "; value %= 1000;
                } else if (newValue % 10000 != 0 && newValue % 10000 >= 1 && newValue % 10000 <= 99) {
                    str += "and "; value %= 10000;
                } else if (newValue % 100000 != 0 && newValue % 100000 >= 1 && newValue % 100000 <= 99) {
                    str += "and "; value %= 100000;
                }
            } else if (value >= 1000000 && value <= 999999999) {
                long newValue = value; str += figures(value/1000000); str += " Million "; value %= 1000000;
                if (newValue % 1000000 != 0 && newValue % 1000000 >= 1 && newValue % 1000000 <= 99) {
                    str += "and "; value %= 1000000;
                } else if (newValue % 10000000 != 0 && newValue % 10000000 >= 1 && newValue % 10000000 <= 99) {
                    str += "and "; value %= 10000000;
                } else if (newValue % 100000000 != 0 && newValue % 100000000 >= 1 && newValue % 100000000 <= 99) {
                    str += "and "; value %= 100000000;
                }
            } else if (value >= 1000000000 && value <= 999999999999L) {
                long newValue = value; str += figures(value/1000000000); str += " Billion "; value %= 1000000000;
                if (newValue % 1000000000 != 0 && newValue % 1000000000 >= 1 && newValue % 1000000000 <= 99) {
                    str += "and "; value %= 1000000000;
                } else if (newValue % 10000000000L != 0 && newValue % 10000000000L >= 1 && newValue % 10000000000L <= 99) {
                    str += "and "; value %= 10000000000L;
                } else if (newValue % 100000000000L != 0 && newValue % 100000000000L >= 1 && newValue % 100000000000L <= 99) {
                    str += "and "; value %= 100000000000L;
                }
            } else if (value >= 1000000000000L && value <= 999999999999999L) {
                long newValue = value; str += figures(value/1000000000000L); str += " Trillion "; value %= 1000000000000L;
                if (newValue % 1000000000000L != 0 && newValue % 1000000000000L >= 1 && newValue % 1000000000000L <= 99) {
                    str += "and "; value %= 1000000000000L;
                } else if (newValue % 10000000000000L != 0 && newValue % 10000000000000L >= 1 && newValue % 10000000000000L <= 99) {
                    str += "and "; value %= 10000000000000L;
                } else if (newValue % 100000000000000L != 0 && newValue % 100000000000000L >= 1 && newValue % 100000000000000L <= 99) {
                    str += "and "; value %= 100000000000000L;
                }
            }
        }
        return str;
    }
    public static String UnitToTrillion (long Input) {
        String str = ""; String[] UnitsToTens = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        if (Input >= 1 && Input <= 19) {
            str += UnitsToTens[(int)Input];
        }
        return str;
    }
    public static String TwentyToNinetyNine (long Input) {
        String str = ""; String[] Tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (Input >= 2 && Input <= 9) {
            str += Tens[(int)Input];
        }
        return str;
    }
}