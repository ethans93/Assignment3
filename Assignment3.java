import java.util.Scanner;
import javax.swing.JOptionPane;
public class Assignment3{
/**
 *This program utilizes many tool of java to create a username/password and account type program for log ins
 *@author Ethan
 *@version 1.0
 */
public enum  AccountType {Student, Staff, Admin}
public static void main (String [] args){

	int FailedAttempts = 0;
	//if FailedAttempts reaches 3 the program will end and notify to user to contact Admin
	String Username1 = "Stan", Username2 = "Jerome", Username3 = "PC";
	String Password1 = "Marsh", Password2 = "Chef", Password3 = "Principal";
	//More accounts can be added here along with the corresponding else-if statements pasted into the appropriate sections
	String UsernameInput, PasswordInput;
	AccountType [] choices = {AccountType .Student, AccountType .Staff, AccountType .Admin};
/*
 * User#1 is assigned username1 and password1, User#2 is assigned username2 and password2, etc.
 * Each user is also assigned an account type depending on position help at school		
 */
		
		
		
				UsernameInput = JOptionPane.showInputDialog(null, "Username:");//Enter username
				if(UsernameInput.equals(Username1)||UsernameInput.equals(Username2)||UsernameInput.equals(Username3)){
//If  username is correct the first time, go straight to password validation.  If incorrect move to line [A]//
					PasswordInput = JOptionPane.showInputDialog(null, "Password:");//Enter password
/*If the user correctly enters password the first time, they will continue down the corresponding branch for account type validation.  Account type validation will
loop until an authorized one is chosen.  The program will end once the correct Account Type is chosen.  If the password is incorrect they will move down to Line[B] where the 
password loop begins*/					
						//Account type validation for USer #1
						if(UsernameInput.equals(Username1)&&PasswordInput.equals(Password1)){
							AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
							while(AccountInput!=AccountType.Student){
								switch (AccountInput){
								case Staff:
									JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
									break;
								case Admin:
									JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
									break;
								}
								AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
							}
							JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
						}
						//Account type validation for User#2
						else if(UsernameInput.equals(Username2)&&PasswordInput.equals(Password2)){
							AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
							while(AccountInput!=AccountType.Staff){
								switch (AccountInput){
								case Student:
									JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
									break;
								case Admin:
									JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
									break;
								}
								AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
							}
							JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
						}
						//Account type validation for User#3
						else if(UsernameInput.equals(Username3)&&PasswordInput.equals(Password3)){
							AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
							while(AccountInput!=AccountType.Admin){
								switch (AccountInput){
								case Student:
									JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
									break;
								case Staff:
									JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
									break;
								}
								AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
							}
							JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
						}
//Line [B]
/*
 * If the user enters in a wrong password, the password loop will begin, also adding one tick to the "FailedAttempts" variable.
 */
						else{
							JOptionPane.showMessageDialog(null, "Incorrect password.");
							FailedAttempts++;
							while(FailedAttempts<3){
								PasswordInput = JOptionPane.showInputDialog(null, "Password:");//Enter password
								//Account type validation for User#1
								if(UsernameInput.equals(Username1)&&PasswordInput.equals(Password1)){
									AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									while(AccountInput!=AccountType.Student){
										switch (AccountInput){
										case Staff:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										case Admin:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										}
										AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									}
									JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
								}
								//Account type validation for User#2
								else if(UsernameInput.equals(Username2)&&PasswordInput.equals(Password2)){
									AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									while(AccountInput!=AccountType.Staff){
										switch (AccountInput){
										case Student:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										case Admin:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										}
										AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									}
									JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
								}
								//Account type validation for User#3
								else if(UsernameInput.equals(Username3)&&PasswordInput.equals(Password3)){
									AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									while(AccountInput!=AccountType.Admin){
										switch (AccountInput){
										case Student:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										case Staff:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										}
										AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									}
									JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
									}
//If a wrong password is entered again, a notice will appear the loop resets and another tick is added to "FailedAttempts" 
								else{
									JOptionPane.showMessageDialog(null, "Incorrect password.");
									FailedAttempts++;
								}
						}
				}
				}
//Line[A}
/*
 * This is where the username loop begins.  The user gets a notice explaining the wrong username was entered and one tick towards the variable "FailedAttempts."
 */
				else{
					JOptionPane.showMessageDialog(null, "Incorrect username.");
					FailedAttempts++;
					while(FailedAttempts<3){	
						UsernameInput = JOptionPane.showInputDialog(null, "Username:");//Enter username
//If the user enters their username correctly the second time they will contine down the password validation similar to above
						if(UsernameInput.equals(Username1)||UsernameInput.equals(Username2)||UsernameInput.equals(Username3)){
						PasswordInput = JOptionPane.showInputDialog(null, "Password:");//Enter password
//An incorrect password will send the user to password loop - Line [C] 
							//Account type validation for User#1
								if(UsernameInput.equals(Username1)&&PasswordInput.equals(Password1)){
									AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									while(AccountInput!=AccountType.Student){
										switch (AccountInput){
										case Staff:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										case Admin:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										}
										AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									}
									JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
								}
								//Account type validation for User#2
								else if(UsernameInput.equals(Username2)&&PasswordInput.equals(Password2)){
									AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									while(AccountInput!=AccountType.Staff){
										switch (AccountInput){
										case Student:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										case Admin:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										}
										AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									}
									JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
								}
								//Account type validation for User#3
								else if(UsernameInput.equals(Username3)&&PasswordInput.equals(Password3)){
									AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									while(AccountInput!=AccountType.Admin){
										switch (AccountInput){
										case Student:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										case Staff:
											JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
											break;
										}
										AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
									}
									JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
								}
//Line [C]
//Password loop for incorrect password begins
								else{
									JOptionPane.showMessageDialog(null, "Incorrect password.");
									FailedAttempts++;
									while(FailedAttempts<3){
										PasswordInput = JOptionPane.showInputDialog(null, "Password:");//Enter password
										//Account type validation for USer#1
										if(UsernameInput.equals(Username1)&&PasswordInput.equals(Password1)){
											AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
											while(AccountInput!=AccountType.Student){
												switch (AccountInput){
												case Staff:
													JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
													break;
												case Admin:
													JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
													break;
												}
												AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
											}
											JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
										}
										//Account type validation for User#2
										else if(UsernameInput.equals(Username2)&&PasswordInput.equals(Password2)){
											AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
											while(AccountInput!=AccountType.Staff){
												switch (AccountInput){
												case Student:
													JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
													break;
												case Admin:
													JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
													break;
												}
												AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
											}
											JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
										}
										//Account type validation for User#3
										else if(UsernameInput.equals(Username3)&&PasswordInput.equals(Password3)){
											AccountType AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
											while(AccountInput!=AccountType.Admin){
												switch (AccountInput){
												case Student:
													JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
													break;
												case Staff:
													JOptionPane.showMessageDialog(null, "Not authorized to access this account type.");
													break;
												}
												AccountInput= (AccountType)JOptionPane.showInputDialog(null, "Account Type:", "Account", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
											}
											JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
											}
//Incorrect password again sends user to beginning of password loop at Line [C]
										else{
											JOptionPane.showMessageDialog(null, "Incorrect password.");
											FailedAttempts++;
										}
								}
						}
								break;
						}
//If the user enters in a username wrong a second time, the loop will reset at Line [A] and the user will be given one more try to correctly enter username.						
							
							else{
							JOptionPane.showMessageDialog(null, "Incorrect Username.");
							FailedAttempts++;
							}
					}
				}
				
				if(FailedAttempts==3)
					JOptionPane.showMessageDialog(null, "Too many failed attempts.\nContact Admin.");
			
				
}
}



