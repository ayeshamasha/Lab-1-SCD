package com.mycompany.firstjavaproject;
import java.util.Scanner;
public class FirstJavaProject {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
double balance=10000;
int choice;
while(true){
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
choice=input.nextInt();
switch(choice){
case 1:
System.out.print("Enter deposit amount: ");
double deposit=input.nextDouble();
if(deposit>0){
balance=balance+deposit;
System.out.println("Deposit successful.");
System.out.println("Updated Balance: Rs. "+balance);
}else{
System.out.println("Invalid amount.");
}
break;
case 2:
System.out.print("Enter withdrawal amount: ");
double withdraw=input.nextDouble();
if(withdraw>0&&withdraw<=balance){
balance=balance-withdraw;
System.out.println("Withdrawal successful.");
System.out.println("Updated Balance: Rs. "+balance);
}else{
System.out.println("Invalid amount or insufficient balance.");
}
break;
case 3:
System.out.println("Thank you!");
break;
default:
System.out.println("Invalid choice.");
}
if(choice==3){
break;
}
}
}
}