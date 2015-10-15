/**
 * The purpose of this program is to create a login procedure with a limited amount of tries and a account selection at the end with an 
 * unlimited amount of tries
 * @author Ethan Steen
 * @version 2
 */
import javax.swing.JOptionPane;
public class Assignment3v2{
public enum  Account {Student, Staff, Admin}
public static void main (String [] args){

Account [] choicesAcco = {Account.Student, Account.Staff, Account.Admin};
int Authorization = 0;
int FailedAttempts = 0;
boolean UsernameCorrect = false, PasswordCorrect = false, AuthorizedAccount = false;


//The program start.  User must enter username.  If the username is recognized, they will move to password, if not, FailedAttempts 
//will get plus one and will loop again
	while (UsernameCorrect==false&&FailedAttempts<3){
		String UsernameInput = JOptionPane.showInputDialog(null, "Username:");
			if(UsernameInput.equals("Stan")){
				Authorization = 1;
				UsernameCorrect = true;
			}
			else if (UsernameInput.equals("Jerome")){
				Authorization = 2;
				UsernameCorrect = true;
			}
			else if(UsernameInput.equals("PC")){
				Authorization = 3;
				UsernameCorrect = true;
			}
			else{
				JOptionPane.showMessageDialog(null, "Incorrect username.");
				FailedAttempts++;
				}
			}			
//After username is confirmed, a password is required.  The loop will end once the correct password is entered or FailedAttempts
//reaches zero.
	while (PasswordCorrect==false&&FailedAttempts<3){
		String PasswordInput = JOptionPane.showInputDialog(null, "Password:");
			if(Authorization == 1 && PasswordInput.equals("Marsh")){
				PasswordCorrect = true;
			}
			else if (Authorization == 2 && PasswordInput.equals("Chef")){
				PasswordCorrect = true;
			}
			else if (Authorization == 3 && PasswordInput.equals("Principal")){
				PasswordCorrect = true;
			}
			else{
				JOptionPane.showMessageDialog(null, "Incorrect password.");
				FailedAttempts++;
			}
		}
//After username and password are confirmed next is choosing an account.  This loop will continue until the correct one is chosen.
	while (FailedAttempts<3&&AuthorizedAccount == false){
		Account AccountInput= (Account)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choicesAcco, choicesAcco [0]);
			switch (AccountInput){
			case Student:
				if(Authorization == 1){
					AuthorizedAccount = true;
					JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
					break;
				}
				else{
					JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
					break;
				}
			case Staff:
				if(Authorization == 2){
					AuthorizedAccount = true;
					JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
					break;
				}
				else{
					JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
					break;
				}
			case Admin:
				if(Authorization == 3){
					AuthorizedAccount = true;
					JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
					break;
				}
				else{
					JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
					break;
				}
			}
		}
//If FailedAttempts ever reaches 3 the program will go straight to here and end		
		if (FailedAttempts==3){
			JOptionPane.showMessageDialog(null,"Too many failed attemtps.\nContact Admin");
		}
}
}