package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
 
    public ListView<Friend> listFriend = new ListView<>();
    public Label labelAge;
    public Label labelFirstName;
    public Label labelLastName;
    public TextField textAge;
    public TextField textFirstName;
    public TextField textLastName;

    public void buttonFriend (){
        String Age = textAge.getText();
        String firstName = textFirstName.getText();
        String lastName = textLastName.getText();
        Friend friend = new Friend(Age, firstName, lastName);
        listFriend.getItems().add(friend);
        textFirstName.clear();
        textLastName.clear();
        textAge.clear();
    }

    public void displayFriend() {
        Friend friend = listFriend.getSelectionModel().getSelectedItem();
        if(friend == null){
            return;
        }
        labelAge.setText("Age: " + friend.getAge());
        String firstName = friend.getFirstName();
        labelFirstName.setText("First Name: " + firstName);
        String lastName = friend.getLastName();
        labelLastName.setText("Last Name: " +lastName);
    }

    public void buttonDelete() {
        Friend friend = listFriend.getSelectionModel().getSelectedItem();
        if (friend == null){
            return;
        }
        listFriend.getItems().remove(friend);
        labelFirstName.setText("First Name: ");
        labelLastName.setText("Last Name: ");
        labelAge.setText("Age: ");
    }
}
