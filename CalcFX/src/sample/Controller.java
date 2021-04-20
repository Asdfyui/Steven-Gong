package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    public ArrayList <String> numbers = new ArrayList<>();
    public Label Total;


    public void Zero(ActionEvent actionEvent) {
        addNumber("0");
    }

    public void One(ActionEvent actionEvent) {
        addNumber("1");
    }

    public void Two(ActionEvent actionEvent) {
        addNumber("2");

    }

    public void Three(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void Four(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void Five(ActionEvent actionEvent) {
        addNumber("5");
    }

    public void Six(ActionEvent actionEvent) {
        addNumber("6");
    }

    public void Seven(ActionEvent actionEvent) {
        addNumber("7");

    }

    public void Eight(ActionEvent actionEvent) {
        addNumber("8");

    }

    public void Nine(ActionEvent actionEvent) {
        addNumber("9");
    }

    public void Add(ActionEvent actionEvent) {
       clickOperator();
       numbers.add("+");
       }

    public void Subtract(ActionEvent actionEvent) {
        clickOperator();
        numbers.add("-");
    }

    public void Multiply(ActionEvent actionEvent) {
        clickOperator();
        numbers.add("*");
    }

    public void Equals(ActionEvent actionEvent) {

        //can only do one choice of sign (+/-/*) per calculation; multiple signs in one calculation do not work

        clickOperator();
        int count2 = 1;
        int count = 0;
        int added = 0;
        int subtracted = 0;
        int multiplied = 0;
        int addedCount = 0;
        int subtractedCount = 0;
        int multipliedCount = 0;
        for (int i = 1; i <= numbers.size(); ++i){
            if (count2 < numbers.size()){
                if (numbers.get(count2).equals("+")){

                    if(count + 2 <= numbers.size()) {
                        if (addedCount == 0){
                            added = Integer.parseInt(numbers.get(count)) + Integer.parseInt(numbers.get(count + 2));
                        }
                        if (addedCount != 0){
                            added = added - Integer.parseInt(numbers.get(count));
                            added = added + Integer.parseInt(numbers.get(count)) + Integer.parseInt(numbers.get(count + 2));
                        }
                        addedCount++;
                    }
                }
                if (numbers.get(count2).equals("-")){

                    if (subtractedCount == 0){
                        subtracted = Integer.parseInt(numbers.get(count)) - Integer.parseInt(numbers.get(count + 2));
                    }
                    if (subtractedCount != 0){
                        if (subtracted > 0){
                            subtracted =  subtracted + Integer.parseInt(numbers.get(count));
                            subtracted = subtracted - Integer.parseInt(numbers.get(count)) - Integer.parseInt(numbers.get(count + 2));
                        }
                        else{
                            subtracted =  subtracted - Integer.parseInt(numbers.get(count));
                            subtracted = subtracted - Integer.parseInt(numbers.get(count-2)) - Integer.parseInt(numbers.get(count + 2));
                        }

                    }
                    subtractedCount++;
                }
                if (numbers.get(count2).equals("*")){
                    if (multipliedCount == 0){
                        multiplied = Integer.parseInt(numbers.get(count)) * Integer.parseInt(numbers.get(count + 2));
                    }
                    if (multipliedCount != 0){
                        multiplied =  multiplied/Integer.parseInt(numbers.get(count));
                        multiplied = multiplied * Integer.parseInt(numbers.get(count)) * Integer.parseInt(numbers.get(count + 2));
                    }
                    multipliedCount++;
                }
            }

            count2++;
            count2++;
            count++;
            count++;


        }

        Total.setText(String.valueOf(added - subtracted +multiplied));
        if(added == 0){
            Total.setText(String.valueOf(subtracted +multiplied));
        }
        System.out.println(subtracted);
        System.out.println(added);
        System.out.println(multiplied);



    }

    public void Clear(ActionEvent actionEvent) {
        numbers.clear();
        Total.setText("0");
    }

    private void addNumber(String num){
        String number = Total.getText() + num;
        if (number.charAt(0) == '0'){
            number = num;
        }

        Total.setText(number);
    }
    public void clickOperator(){
        numbers.add(Total.getText());
            Total.setText("0");

    }


}
