/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PlaceChart;

/**
 *
 * @author gene
 */
public class WordsToNumbersPlace {

    public String ConvertNumberToWords(double num) {
        String results = "";


        if (num > 99 && num < 1000) { //hundreds place
            int first = StripOutChar(num, 0);//get first char
            int second = StripOutChar(num, 1);
            int third = StripOutChar(num, 2);
            String NumAsString = num + "";
            int find = NumAsString.indexOf(".");
            String afterdecimal = NumAsString.substring(find + 1);
            int AfterDecimal = Integer.parseInt(afterdecimal);
            String DecimalText = " And " + AfterDecimalText(AfterDecimal);
            String combine = "" + second + third;
            int teen = Integer.parseInt(combine);
            if (TeensPlace(teen) != "NA") { //check if second number is teen
                results = HundredsPlace(first) + " Hundred " + TeensPlace(teen);
            } else {
                results = HundredsPlace(first) + " Hundred ";
                String twenty = TwentyPlace(second);
                if (twenty != "NA") {
                    results = results + twenty;
                }
                String ones = HundredsPlace(third);
                if (ones != "NA") {
                    results = results + " " + ones;
                }



            }
            results = results + DecimalText;

        }



        return results;
    }

    public String HundredsPlace(int num) {
        String results = "";
        //  double n = (num / 100); //get first number
        switch (num) {
            case 1:
                results = "One";
                break;
            case 2:
                results = "Two";
                break;
            case 3:
                results = "Three";
                break;
            case 4:
                results = "Four";
                break;
            case 5:
                results = "Five";
                break;
            case 6:
                results = "Six";
                break;
            case 7:
                results = "Seven";
                break;
            case 8:
                results = "Eight";
                break;
            case 9:
                results = "Nine";
                break;
            default:
                results = "NA";
                break;
        }
        return results;
    }

    public String TeensPlace(int num) {
        String results = "";
        //  double n = (num / 100); //get first number
        switch (num) {
            case 10:
                results = "Ten";
                break;
            case 11:
                results = "Eleven";
                break;
            case 12:
                results = "Twelve";
                break;
            case 13:
                results = "Thirteen";
                break;
            case 14:
                results = "Fourteen";
                break;
            case 15:
                results = "Fifteen";
                break;
            case 16:
                results = "Sixteen";
                break;
            case 17:
                results = "Seventeen";
                break;
            case 18:
                results = "Eighteen";
                break;
            case 19:
                results = "Nineteen";
                break;
            default:
                results = "NA";

                break;
        }
        return results;
    }

    public String TwentyPlace(int num) {
        String results = "";
        //  double n = (num / 100); //get first number
        switch (num) {
            case 2:
                results = "Twenty";
                break;
            case 3:
                results = "Thirty";
                break;
            case 4:
                results = "Fourty";
                break;
            case 5:
                results = "Fifty";
                break;
            case 6:
                results = "Sixty";
                break;
            case 7:
                results = "Seventy";
                break;
            case 8:
                results = "Eighty";
                break;
            case 9:
                results = "Ninety";
                break;

            default:
                results = "NA";

                break;
        }
        return results;
    }

    public int StripOutChar(double num, int loc) {
        int res = 0;
        String temp = num + "";

        temp = "" + temp.charAt(loc);
        try {
            res = Integer.parseInt(temp);
        } catch (Exception e) {
        }

        return res;
    }

    public String AfterDecimalText(int num) {
        String results = "";
        String end_keywrd = "";


        if (num > 99) {
            end_keywrd = " Thousandths";
            int first = StripOutChar(num, 0);//get first char
            int second = StripOutChar(num, 1);
            int third = StripOutChar(num, 2);

            String combine = "" + second + third;
            int teen = Integer.parseInt(combine);
            if (TeensPlace(teen) != "NA") { //check if second number is teen
                results = HundredsPlace(first) + " Hundred " + TeensPlace(teen) + end_keywrd;
            } else {
                results = HundredsPlace(first) + " Hundred ";
                String twenty = TwentyPlace(second);
                if (twenty != "NA") {
                    results = results + twenty;
                }
                String ones = HundredsPlace(third);
                if (ones != "NA") {
                    results = results + " " + ones;
                }
                results = results + end_keywrd;
            }
        }
        if (num < 100 && num > 9) {
            end_keywrd = " Hundredths";
            int firsta = StripOutChar(num, 0);//get first char
            int seconda = StripOutChar(num, 1);
            if (num > 9 && num < 20) { // teen
                results = TeensPlace(num) + end_keywrd;
            } else {
                String twenty = TwentyPlace(firsta);
                if (twenty != "NA") {
                    results = results + twenty;
                }
                String ones = HundredsPlace(seconda);
                if (ones != "NA") {
                    results = results + " " + ones;
                }
                results = results + end_keywrd;
            }
        }
        return results;
    }
}