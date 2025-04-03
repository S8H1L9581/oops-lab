//1)Person Class
// import java.util.*;
// class Person{
//     String name;
//     int age;
//     void displayinfo(){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }

// public class college{
//     public static void main(String[] args){
//         Person person = new Person();
//         person.name = "alice";
//         person.age = 38;
//         person.displayinfo();
//     }
// }

//2)BankAccount Class
// import java.util.*;
// class Bankaccount{
//     String accountnumber;
//     double balance;
//     void deposit(double amount){
//         balance += amount;
//         System.out.println(amount);
//     }
//     void withdraw(double amount){
//         if(amount <= balance){
//             balance -= amount;
//             System.out.println(amount);
//         } else {
//             System.out.println("insufficient balance");
//         }
//     }
// }

// public class college{
//     public static void main(String[] args){
//         Bankaccount account = new Bankaccount();
//         account.accountnumber = "123456";
//         account.balance = 1000.0;

//         account.deposit(500);
//         account.withdraw(200);
//         System.out.println("Current Balance: " + account.balance);
//     }
// }

//3) Library, Book, and Member Classes
// class book{
//     String author;
//     String title;
//     void display(){
//         System.out.println(title + author);
//     }
// }

// class Member{
//     String name;
//     void displaymember(){
//         System.out.println(name);
//     }
        
// }

// class Library{
//     void issue(book Book,Member member){
//         System.out.println(member.name + Book.title);
//     }
//     void returnbook(book Book,Member member){
//         System.out.println(member.name + Book.title);
//     }
// }

// public class college{
//     public static void main(String[] args){
//         book Book = new book();
//         Book.title = "1984";
//         Book.author = "George Orwell";

//         Member member = new Member();
//         member.name = "John";

//         Library library = new Library();
//         library.issue(Book, member);
//         library.returnbook(Book, member);
//     }
// }

//4)Hospital, Doctor, Patient, and Appointment Classes
// class Doctor {
//     String name;

//     void displayDoctorInfo() {
//         System.out.println("Doctor Name: " + name);
//     }
// }

// class Patient {
//     String name;

//     void displayPatientInfo() {
//         System.out.println("Patient Name: " + name);
//     }
// }

// class Appointment {
//     Doctor doctor;
//     Patient patient;

//     void scheduleAppointment() {
//         System.out.println("Appointment scheduled for " + patient.name + " with Dr. " + doctor.name);
//     }
// }

// public class college{
//     public static void main(String[] args) {
//         Doctor doctor = new Doctor();
//         doctor.name = "Dr. Smith";

//         Patient patient = new Patient();
//         patient.name = "Alice";

//         Appointment appointment = new Appointment();
//         appointment.doctor = doctor;
//         appointment.patient = patient;
//         appointment.scheduleAppointment();
//     }
// }

//5)User, Post, Comment, and Like Classes
// class Post {
//     String content;

//     void displayPost() {
//         System.out.println("Post: " + content);
//     }
// }

// class Comment {
//     String text;

//     void displayComment() {
//         System.out.println("Comment: " + text);
//     }
// }

// class User {
//     String name;

//     void displayUserInfo() {
//         System.out.println("User: " + name);
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         User user = new User();
//         user.name = "Alice";

//         Post post = new Post();
//         post.content = "Hello World!";

//         Comment comment = new Comment();
//         comment.text = "Nice post!";

//         user.displayUserInfo();
//         post.displayPost();
//         comment.displayComment();
//     }
// }

//6)Online Movie Streaming Service Classes
// class Movie {
//     String title;

//     void displayMovie() {
//         System.out.println("Movie: " + title);
//     }
// }

// class User {
//     String name;

//     void displayUserInfo() {
//         System.out.println("User: " + name);
//     }
// }

// class Subscription {
//     String type;

//     void displaySubscription() {
//         System.out.println("Subscription Type: " + type);
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         User user = new User();
//         user.name = "Alice";

//         Movie movie = new Movie();
//         movie.title = "Inception";

//         Subscription subscription = new Subscription();
//         subscription.type = "Premium";

//         user.displayUserInfo();
//         movie.displayMovie();
//         subscription.displaySubscription();
//     }
// }

//7)Area and Volume of a Room (Single Inheritance)
// class Room {
//     double length;
//     double width;
//     double height;

//     double calculateArea() {
//         return length * width;
//     }
// }

// class VolumeRoom extends Room {
//     double calculateVolume() {
//         return length * width * height;
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         VolumeRoom room = new VolumeRoom();
//         room.length = 5;
//         room.width = 4;
//         room.height = 3;

//         System.out.println("Area of the room: " + room.calculateArea());
//         System.out.println("Volume of the room: " + room.calculateVolume());
//     }
// }

//8)Pay Slip Generation for Employees
// class Employee {
//     String name;
//     double salary;

//     void displayPaySlip() {
//         System.out.println("Employee Name: " + name);
//         System.out.println("Salary: " + salary);
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         Employee employee = new Employee();
//         employee.name = "John Doe";
//         employee.salary = 5000.0;

//         employee.displayPaySlip();
//     }
// }

//9)Vehicle and Car Classes (Single Inheritance)
// class Vehicle {
//     String make;
//     String model;

//     void start() {
//         System.out.println("Vehicle started.");
//     }

//     void stop() {
//         System.out.println("Vehicle stopped.");
//     }
// }

// class Car extends Vehicle {
//     void drive() {
//         System.out.println("Car is driving.");
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         Car car = new Car();
//         car.make = "Toyota";
//         car.model = "Corolla";
//         car.start();
//         car.drive();
//         car.stop();
//     }
// }

//10)Hierarchical Inheritance (Shape, Rectangle, Circle)
// class Shape {
//     double area;

//     void calculateArea() {
//         // Default implementation
//     }
// }

// class Rectangle extends Shape {
//     double length;
//     double width;

//     @Override
//     void calculateArea() {
//         area = length * width;
//         System.out.println("Area of Rectangle: " + area);
//     }
// }

// class Circle extends Shape {
//     double radius;

//     @Override
//     void calculateArea() {
//         area = Math.PI * radius * radius;
//         System.out.println("Area of Circle: " + area);
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         Rectangle rectangle = new Rectangle();
//         rectangle.length = 5;
//         rectangle.width = 4;
//         rectangle.calculateArea();

//         Circle circle = new Circle();
//         circle.radius = 3;
//         circle.calculateArea();
//     }
// }

//11)Multilevel Inheritance Example
// class Animal {
//     void eat() {
//         System.out.println("Animal is eating.");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking.");
//     }
// }

// class Puppy extends Dog {
//     void weep() {
//         System.out.println("Puppy is weeping.");
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         Puppy puppy = new Puppy();
//         puppy.eat();
//         puppy.bark();
//         puppy.weep();
//     }
// }


//animal class with sound method
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Bird extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Bird chirps");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         Animal myBird = new Bird();
//         Animal myCat = new Cat();
        
//         myBird.sound(); // Call the sound method for Bird
//         myCat.sound();  // Call the sound method for Cat
//     }
// }

//2. Vehicle Class with SpeedUp Method
// class vechile{
//     void speedup(){
//         System.out.println("vechile is speeding up");
//     }
// }

// class car extends vechile{
//     @Override
//     void speedup(){
//     System.out.println("car are quick");
//     }
// }

// class bike extends vechile{
//     @Override
//     void speedup(){
//         System.out.println("bikes are slowly");
//     }
// }

// public class college{
//     public static void main(String[] args){
//         vechile mycar = new car();
//         vechile mybike = new bike();
//         mycar.speedup();
//         mybike.speedup();
//     }
// }

//3. Shape Class with CalculateArea Method
// abstract class shape{
//     abstract double calculatearea();
// }

// class circle extends shape{
//     double radius;
//     circle(double radius){
//         this.radius = radius;
//     }
//     @Override
//     double calculatearea(){
//         return 3.14 * radius * radius;
//     }
// }

// class rectangle extends shape{
//     double length;
//     double breadth;
//     rectangle(double length,double breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }
//     @Override
//     double calculatearea(){
//         return length * breadth;
//     }
// }
// public class college{
//     public static void main(String[] args){
//         shape mycircle = new circle(5);
//         shape myrectangle = new rectangle(4,6);
//         System.out.println(mycircle.calculatearea());
//         System.out.println(myrectangle.calculatearea());
//     }
// }

//4. Employee Class with CalculateSalary Method
// abstract class employee{
//     abstract double calculatesalary();
// }

// class manager extends employee{
//     double bsalary = 80000;
//     @Override
//     double calculatesalary(){
//         return bsalary + 20000;
//     }
// }

// class programmer extends employee{
//     double bsalary = 60000;
//     @Override
//     double calculatesalary(){
//         return bsalary + 10000;
//     }
// }

// public class college{
//     public static void main(String[] args){
//         employee mymanager = new manager();
//         employee myprogrammer = new programmer();
//         System.out.println(mymanager.calculatesalary());
//         System.out.println(myprogrammer.calculatesalary());
//     }
// }

//5. Sports Class with Play Method
// abstract class sports{
//     abstract void play();
//     }

// class football extends sports{
//     @Override
//     void play(){
//         System.out.println("playing football");
//     }
// }

// class cricket extends sports{
//     @Override
//     void play(){
//         System.out.println("playing cricket");
//     }
// }

// public class college{
//     public static void main(String[] args){
//         sports foot = new football();
//         sports cric = new cricket();
//         foot.play();
//         cric.play();
//     }
// }

//6. Shape Class with GetArea and GetPerimeter Method
// abstract class shape{
//     abstract double getarea();
//     abstract double getperimeter();
// }

// class circle extends shape{
//     double radius;
//     circle(double radius){
//         this.radius = radius;
//     }

//     @Override
//     double getarea(){
//         return 3.14 * radius * radius;
//     }

//     @Override
//     double getperimeter(){
//         return 2 * 3.14 * radius;
//     }
// }

// class rectangle extends shape{
//     double length;
//     double breadth;
//     rectangle(double length,double breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }

//     @Override
//     double getarea(){
//         return length * breadth;
//     }

//     @Override
//     double getperimeter(){
//         return 2 * (length + breadth);
//     }
// }

// public class college{
//     public static void main(String[] args){
//         shape mycircle = new circle(5);
//         shape myrectangle = new rectangle(4, 6);
//         System.out.println("Circle Area: " + mycircle.getarea());               // Output: Circle Area: 78.53981633974483
//         System.out.println("Circle Perimeter: " + mycircle.getperimeter());     // Output: Circle Perimeter: 31.41592653589793
//         System.out.println("Rectangle Area: " + myrectangle.getarea());         // Output: Rectangle Area: 24.0
//         System.out.println("Rectangle Perimeter: " + myrectangle.getperimeter()); // Output: Rectangle Perimeter: 20.0
//     }
// }

//7. Animal Class with Move and MakeSound Methods
// abstract class animal{
//     abstract void move();
//     abstract void makesound();
// }

// class bird extends animal{
//     @Override
//     void move(){
//         System.out.println("bird cant move it can fly");
//     }
//     @Override
//     void makesound(){
//         System.out.println("bird chirps");
//     }
// }

// class lion extends animal{
//     @Override
//     void move(){
//         System.out.println("it walks on the field");

//     }
//     @Override
//     void makesound(){
//         System.out.println("it roars");
//     }
// }

// public class college{
//     public static void main(String[] args){
//         animal mybird = new bird();
//         animal mylion = new lion();
//         mybird.move();
//         mybird.makesound();
//         mylion.move();
//         mylion.makesound();
//     }
// }

//8. Shape Class with Draw and CalculateArea Methods
// abstract class shape{
//     abstract void draw();
//     abstract void calculatearea();
// }

// class circle extends shape{
//     double radius;
//     circle(double radius){
//         this.radius = radius;
//     }

//     @Override
//     void draw(){
//         System.out.println("drawing circle");
//     }
//     @Override
//     void calculatearea(){
//         System.out.println(3.14 * radius * radius);
//     }
// }

// class square extends shape{
//     double side;
//     square(double side){
//         this.side = side;
//     }
//     @Override
//     void draw(){
//         System.out.println("drawing a square");
//     }
//     @Override
//     void calculatearea(){
//         System.out.println(side * side);
//     }
// }

// public class college{
//     public static void main(String[] args){
//         shape mycircle = new circle(4);
//         shape mysquare = new square(5);
//         mycircle.draw();
//         mycircle.calculatearea();
//         mysquare.draw();
//         mysquare.calculatearea();
//     }
// }

//9. BankAccount Class with Deposit and Withdraw Methods
// abstract class bankaccount{
//     double balance;
//     bankaccount(double balance){
//         this.balance = balance;
//     }
//     abstract void deposit(double amount);
//     abstract void withdraw(double amount);
// }

// class savings extends bankaccount{
//     savings(double balance){
//         super(balance);
//     }
//     @Override
//     void deposit(double amount){
//         balance += amount;
//         System.out.println("Deposited: " + amount + ", New Balance: " + balance);
//     }
//     @Override
//     void withdraw(double amount){
//         if(amount <= balance){
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
//         } else {
//             System.out.println("Withdrawal amount exceeds balance.");
//         }
//     }
// }

// public class college{
//     public static void main(String[] args){
//         bankaccount mysavings = new savings(1000);
//         mysavings.deposit(200);
//         mysavings.withdraw(300);
//     }
// }

//10. Vehicle Class with StartEngine and StopEngine Methods
// abstract class vechile{
//     abstract void startengine();
//     abstract void stopengine();
// }

// class car extends vechile{
//     @Override
//     void startengine(){
//         System.out.println("car engine started");
//     }
//     @Override
//     void stopengine(){
//         System.out.println("car engine stopped");
//     }
// }

// class bike extends vechile{
//     @Override
//     void startengine(){
//         System.out.println("bike engine started");
//     }
//     @Override
//     void stopengine(){
//         System.out.println("bike engine stopped");
//     }
// }

// public class college{
//     public static void main(String[] args){
//         vechile mycar = new car();
//         vechile mybike = new bike();
//         mycar.startengine();
//         mycar.stopengine();
//         mybike.startengine();
//         mybike.stopengine();
//     }
// }

//Part 1: Hillstations Example with User Input
// import java.util.*;
// class hillstations{
//     String location;
//     String famousfor;
//     void details(String location,String famousfor){
//         this.location = location;
//         this.famousfor = famousfor;
//     }
//     void display(){
//         System.out.println("location:" + location);
//         System.out.println("famous for:" + famousfor);
//     }
// }

// class manali extends hillstations{
//     manali(String location,String famousfor){
//         details(location, famousfor);
//     }
// }

// class mussoorie extends hillstations{
//     mussoorie(String location,String famousfor){
//         details(location, famousfor);
//     }
// }

// public class college{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter location for manali: ");
//         String location1 = s.nextLine();
//         System.out.println("wht is manali is famous for: ");
//         String famous1 = s.nextLine();
//         hillstations man = new manali(location1, famous1);
//         man.display();

//         System.out.println("enter location for mussorie: ");
//         String location2 = s.nextLine();
//         System.out.println("wht is mussorie is famous for: ");
//         String famous2 = s.nextLine();
//         hillstations mus = new manali(location2, famous2);
//         mus.display();
//     }
// }

//Part 2: Bank Example with User Input
// import java.util.*;
// class bank{
//     int getbalance(){
//         return 0;
//     }
// }

// class banka extends bank{
//     private int balance;
//     banka(int balance){
//         this.balance = balance;
//     }
//     @Override
//     int getbalance(){
//         return balance;
//     }
// }

// class bankb extends bank{
//     private int balance;
//     bankb(int balance){
//         this.balance = balance;
//     }
//     @Override
//     int getbalance(){
//         return balance;
//     }
// }

// class bankc extends bank{
//     private int balance;
//     bankc(int balance){
//         this.balance = balance;
//     }
//     @Override
//     int getbalance(){
//         return balance;
//     }
// }

// public class college{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter the amounted to be deposited in banka: ");
//         int amounta = s.nextInt();
//         bank bankA = new banka(amounta);

//         System.out.println("enter the amounted to be deposited in bankb: ");
//         int amountb = s.nextInt();
//         bank bankB = new bankb(amountb);

//         System.out.println("enter the amounted to be deposited in banka: ");
//         int amountc = s.nextInt();
//         bank bankC = new bankc(amountc);

//         System.out.println(bankA.getbalance());
//         System.out.println(bankB.getbalance());
//         System.out.println(bankC.getbalance());
//     }
// }

//Part 3: Static Method Example
// class a{
//     static void print(){
//         System.out.println("parent");
//     }
// }

// class b extends a{
//     static void print(){
//         System.out.println("child");
//     }
// }

// public class college{
//     public static void main(String[] args){
//         a obj1 = new a();
//         b obj2 = new b();
//         obj1.print();
//         obj2.print();
//         a obj3 = new b();
//         obj3.print();
//     }
// }

//Part 4: Bank Functionality with RBI and User Input
// import java.util.*;
// class rbi{
//     double interest = 4.0;
//     void displayinterest(){
//         System.out.println("rbi minimum interest is: " + interest + "%");
//     }
// }

// class sbi extends rbi{
//     double interest;
//     sbi(double interest){
//         this.interest = interest;
//     }
//     @Override
//     void displayinterest(){
//         System.out.println("sbi interest rate is: " + interest + "%");
//     }
// }

// class icici extends rbi{
//     double interest;
//     icici(double interest){
//         this.interest = interest;
//     }
//     @Override
//     void displayinterest(){
//         System.out.println("icici interest rate is: " + interest + "%");
//     }
// }

// public class college{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter the sbi interest rate: ");
//         double sbirate = s.nextDouble();
//         rbi obj1 = new sbi(sbirate);

//         System.out.println("enter the icici interest rate: ");
//         double icicirate = s.nextDouble();
//         rbi obj2 = new icici(icicirate);

//         obj1.displayinterest();
//         obj2.displayinterest();

//     }
// }



//INHERITANCE PROGRAMS ALL 4 TYPES:


// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }

//     int calculateAge(int years) {
//         return years * 7;
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class college {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();
//         int age = d.calculateAge(2);
//         System.out.println("Age of the dog in dog years is: " + age);
//     }
// }

// class Vehicle {
//     void Type() {
//         System.out.println("This is a vehicle");
//     }

//     double calculateSpeed(int distance, int time) {
//         return (double) distance / time;
//     }
// }

// class car extends Vehicle {
//     void Type() {
//         System.out.println("This is a car");
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         car c = new car();
//         c.Type();
//         double speed = c.calculateSpeed(100, 2);
//         System.out.println("The speed of the car is " + speed + " km/h");
//     }
// }

// class Person {
//     void role() {
//         System.out.println("I am a person");
//     }

//     double calculateSalary(double baseSalary) {
//         return baseSalary;
//     }
// }

// class Employee extends Person {
//     void role() {
//         System.out.println("I am an employee");
//     }

//     double calculateSalary(double baseSalary) {
//         return baseSalary * 1.2;        
//     }
// }

// class Manager extends Employee {
//     void role() {
//         System.out.println("I am a manager");
//     }

//     double calculateSalary(double baseSalary) {
//         return baseSalary * 1.5;
//     }
// }

// class college {
//     public static void main(String[] args) {
//         Manager m = new Manager();
//         m.role();
//         double salary = m.calculateSalary(1000);
//         System.out.println("Manager's salary is: " + salary);
//     }
// }

// class Shape {
//     void draw() {
//         System.out.println("Drawing a shape");
//     }

//     double calculateArea(double radius) {
//         return 3.14 * radius * radius;
//     }

//     double calculateArea(double length, double breadth) {
//         return length * breadth;
//     }
// }

// class Circle extends Shape {
//     void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// class Rectangle extends Shape {
//     void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }

// class college {
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         c.draw();
//         double cArea = c.calculateArea(5);
//         System.out.println("The area of the circle is: " + cArea);
        
//         Rectangle r = new Rectangle();
//         r.draw();
//         double rArea = r.calculateArea(4, 6);
//         System.out.println("The area of the rectangle is: " + rArea);
//     }
// }

// class Bird {
//     void fly() {
//         System.out.println("Birds can fly");
//     }

//     double calculateWingspan(double wingLength) {
//         return wingLength * 2;
//     }
// }

// class Sparrow extends Bird {
//     void fly() {
//         System.out.println("Sparrow can fly");
//     }
// }

// class Eagle extends Bird {
//     void fly() {
//         System.out.println("Eagle can fly");
//     }
// }

// class college {
//     public static void main(String[] args) {
//         Sparrow s = new Sparrow();
//         s.fly();
//         double sWingspan = s.calculateWingspan(0.25);
//         System.out.println("Sparrow's wingspan: " + sWingspan + " meters");
        
//         Eagle e = new Eagle();
//         e.fly();
//         double eWingspan = e.calculateWingspan(1.5);
//         System.out.println("Eagle's wingspan: " + eWingspan + " meters");
//     }
// }

// class Person {
//     void displayInfo() {
//         System.out.println("I am a person"); 
//     }
// }

// class Employee extends Person {
//     void displayInfo() {
//         System.out.println("I am an employee"); 
//     }
// }

// class Student extends Person {
//     void displayInfo() {
//         System.out.println("I am a student"); 
//     }
// }

// class Intern extends Employee {
//     void displayInfo() {
//         System.out.println("I am an intern"); 
//     }
    
//     void internshipDetails() {
//         System.out.println("Internship duration: 3 months"); 
//     }
// }

// class GraduateIntern extends Intern {
//     void displayInfo() {
//         System.out.println("I am a graduate intern");
//     }
    
//     void internshipDetails() {
//         System.out.println("Graduate internship duration: 6 months"); 
//     }
// }

// class college {
//     public static void main(String[] args) {
//         Intern i = new Intern();
//         i.displayInfo();
//         i.internshipDetails();
        
//         GraduateIntern g = new GraduateIntern();
//         g.displayInfo();
//         g.internshipDetails();
//     }
// }

// class Animal {
//     void speak() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Mammal extends Animal {
//     void speak() {
//         System.out.println("Mammal roars");
//     }
// }

// class Bird extends Animal {
//     void speak() {
//         System.out.println("Bird chirps");
//     }
// }

// class Bat extends Mammal {
//     void speak() {
//         System.out.println("Bat screeches");
//     }
// }

// class Eagle extends Bird {
//     void speak() {
//         System.out.println("Eagle screeches");
//     }
// }

// class college {
//     public static void main(String[] args) {
//         Bat bat = new Bat();
//         bat.speak(); 
        
//         Eagle eagle = new Eagle();
//         eagle.speak(); 
//     }
// }



//OVERRIDING PROGRAMS



// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         Animal myDog = new Dog();
//         Animal myCat = new Cat();
        
//         myDog.sound();
//         myCat.sound();
//     }
// }

// class Shape {
//     double area() {
//         return 0;
//     }
// }

// class Circle extends Shape {
//     double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double area() {
//         return Math.PI * radius * radius;
//     }
// }

// class Rectangle extends Shape {
//     double length, width;

//     Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     double area() {
//         return length * width;
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         Shape circle = new Circle(5);
//         Shape rectangle = new Rectangle(4, 6);
        
//         System.out.println("Circle area: " + circle.area());
//         System.out.println("Rectangle area: " + rectangle.area());
//     }
// }

// class Vehicle {
//     void speed() {
//         System.out.println("Vehicle speed");
//     }
// }

// class car extends Vehicle {
//     @Override
//     void speed() {
//         System.out.println("Car speed: 120 km/h");
//     }
// }

// class bike extends Vehicle {
//     @Override
//     void speed() {
//         System.out.println("Bike speed: 80 km/h");
//     }
// }

// public class college {
//     public static void main(String[] args) {
//         Vehicle mycar = new car();
//         Vehicle mybike = new bike();
        
//         mycar.speed();
//         mybike.speed();
//     }
// }


// class Employee {
//     double calculateSalary() {
//         return 0;
//     }
// }

// class FullTimeEmployee extends Employee {
//     double salary;

//     FullTimeEmployee(double salary) {
//         this.salary = salary;
//     }

//     @Override
//     double calculateSalary() {
//         return salary;
//     }
// }

// class PartTimeEmployee extends Employee {
//     double hourlyRate;
//     int hoursWorked;

//     PartTimeEmployee(double hourlyRate, int hoursWorked) {
//         this.hourlyRate = hourlyRate;
//         this.hoursWorked = hoursWorked;
//     }

//     @Override
//     double calculateSalary() {
//         return hourlyRate * hoursWorked;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Employee fullTime = new FullTimeEmployee(3000);
//         Employee partTime = new PartTimeEmployee(20, 100);
        
//         System.out.println("Full-time salary: " + fullTime.calculateSalary());
//         System.out.println("Part-time salary: " + partTime.calculateSalary());
//     }
// }

//OVERLOADING PROGRAMS

// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
        
//         System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
//         System.out.println("Sum of 2, 3, and 4: " + calc.add(2, 3, 4));
//         System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
//     }
// }

// class Printer {
//     void print(int a) {
//         System.out.println("Integer: " + a);
//     }

//     void print(double a) {
//         System.out.println("Double: " + a);
//     }

//     void print(String a) {
//         System.out.println("String: " + a);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Printer printer = new Printer();
        
//         printer.print(10);
//         printer.print(10.5);
//         printer.print("Hello, World!");
//     }
// }

// class Printer {
//     void print(int a) {
//         System.out.println("Integer: " + a);
//     }

//     void print(double a) {
//         System.out.println("Double: " + a);
//     }

//     void print(String a) {
//         System.out.println("String: " + a);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Printer printer = new Printer();
        
//         printer.print(10);
//         printer.print(10.5);
//         printer.print("Hello, World!");
//     }
// }

// class Multiplier {
//     int multiply(int a, int b) {
//         return a * b;
//     }

//     int multiply(int a, int b, int c) {
//         return a * b * c;
//     }

//     double multiply(double a, double b) {
//         return a * b;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Multiplier multiplier = new Multiplier();
        
//         System.out.println("Product of 2 and 3: " + multiplier.multiply(2, 3));
//         System.out.println("Product of 2, 3, and 4: " + multiplier.multiply(2, 3, 4));
//         System.out.println("Product of 2.5 and 3.5: " + multiplier.multiply(2.5, 3.5));
//     }
// }

// class MaxFinder {
//     int findMax(int a, int b) {
//         return (a > b) ? a : b;
//     }

//     double findMax(double a, double b) {
//         return (a > b) ? a : b;
//     }

//     int findMax(int a, int b, int c) {
//         return Math.max(a, Math.max(b, c));
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MaxFinder maxFinder = new MaxFinder();
        
//         System.out.println("Max of 10 and 20: " + maxFinder.findMax(10, 20));
//         System.out.println("Max of 10.5 and 20.5: " + maxFinder.findMax(10.5, 20.5));
//         System.out.println("Max of 10, 20, and 30: " + maxFinder.findMax(10, 20, 30));
//     }
// }



// ABSTRACTION PROGRAMS


// abstract class Shape {
//     abstract double area();
// }

// class Circle extends Shape {
//     double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double area() {
//         return Math.PI * radius * radius;
//     }
// }

// class Rectangle extends Shape {
//     double length, width;

//     Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     double area() {
//         return length * width;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Shape circle = new Circle(5);
//         Shape rectangle = new Rectangle(4, 6);
        
//         System.out.println("Circle area: " + circle.area());
//         System.out.println("Rectangle area: " + rectangle.area());
//     }
// }


// abstract class Employee {
//     abstract double calculateSalary();
// }

// class FullTimeEmployee extends Employee {
//     double salary;

//     FullTimeEmployee(double salary) {
//         this.salary = salary;
//     }

//     @Override
//     double calculateSalary() {
//         return salary;
//     }
// }

// class PartTimeEmployee extends Employee {
//     double hourlyRate;
//     int hoursWorked;

//     PartTimeEmployee(double hourlyRate, int hoursWorked) {
//         this.hourlyRate = hourlyRate;
//         this.hoursWorked = hoursWorked;
//     }

//     @Override
//     double calculateSalary() {
//         return hourlyRate * hoursWorked;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Employee fullTime = new FullTimeEmployee(3000);
//         Employee partTime = new PartTimeEmployee(20, 100);
        
//         System.out.println("Full-time salary: " + fullTime.calculateSalary());
//         System.out.println("Part-time salary: " + partTime.calculateSalary());
//     }
// }

// abstract class Vehicle {
//     abstract double calculateFuelEfficiency(double distance, double fuelUsed);
// }

// class car extends Vehicle {
//     @Override
//     double calculateFuelEfficiency(double distance, double fuelUsed) {
//         return distance / fuelUsed; // km/l
//     }
// }

// class truck extends Vehicle {
//     @Override
//     double calculateFuelEfficiency(double distance, double fuelUsed) {
//         return distance / fuelUsed; // km/l
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Vehicle mycar = new car();
//         Vehicle mytruck = new truck();
        
//         System.out.println("Car fuel efficiency: " + mycar.calculateFuelEfficiency(500, 50) + " km/l");
//         System.out.println("Truck fuel efficiency: " + mytruck.calculateFuelEfficiency(300, 60) + " km/l");
//     }
// }

// abstract class BankAccount {
//     double balance;

//     BankAccount(double balance) {
//         this.balance = balance;
//     }

//     abstract double calculateInterest();
// }

// class SavingsAccount extends BankAccount {
//     double interestRate;

//     SavingsAccount(double balance, double interestRate) {
//         super(balance);
//         this.interestRate = interestRate;
//     }

//     @Override
//     double calculateInterest() {
//         return balance * interestRate / 100;
//     }
// }

// class CurrentAccount extends BankAccount {
//     double overdraftLimit;

//     CurrentAccount(double balance, double overdraftLimit) {
//         super(balance);
//         this.overdraftLimit = overdraftLimit;
//     }

//     @Override
//     double calculateInterest() {
//         return 0; // No interest for current accounts
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         BankAccount savings = new SavingsAccount(1000, 5);
//         BankAccount current = new CurrentAccount(2000, 500);
        
//         System.out.println("Savings account interest: " + savings.calculateInterest());
//         System.out.println("Current account interest: " + current.calculateInterest());
//     }
// }

//INTERFACE PROGRAMS

// interface Calculable {
//     double add(double a, double b);
//     double subtract(double a, double b);
// }

// class Calculator implements Calculable {
//     @Override
//     public double add(double a, double b) {
//         return a + b;
//     }

//     @Override
//     public double subtract(double a, double b) {
//         return a - b;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
        
//         System.out.println("Addition: " + calc.add(5, 3));
//         System.out.println("Subtraction: " + calc.subtract(5, 3));
//     }
// }

// interface Drawable {
//     void draw();
// }

// class Circle implements Drawable {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Circle");
//     }
// }

// class Rectangle implements Drawable {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Rectangle");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Drawable circle = new Circle();
//         Drawable rectangle = new Rectangle();
        
//         circle.draw();
//         rectangle.draw();
//     }
// }

// interface Payable {
//     double calculatePayment();
// }

// class Contractor implements Payable {
//     double hourlyRate;
//     int hoursWorked;

//     Contractor(double hourlyRate, int hoursWorked) {
//         this.hourlyRate = hourlyRate;
//         this.hoursWorked = hoursWorked;
//     }

//     @Override
//     public double calculatePayment() {
//         return hourlyRate * hoursWorked;
//     }
// }

// class Employee implements Payable {
//     double salary;

//     Employee(double salary) {
//         this.salary = salary;
//     }

//     @Override
//     public double calculatePayment() {
//         return salary;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Payable contractor = new Contractor(50, 40);
//         Payable employee = new Employee(3000);
        
//         System.out.println("Contractor payment: " + contractor.calculatePayment());
//         System.out.println("Employee payment: " + employee.calculatePayment());
//     }
// }


// interface Measurable {
//     double getArea();
//     double getPerimeter();
// }

// class Square implements Measurable {
//     double side;

//     Square(double side) {
//         this.side = side;
//     }

//     @Override
//     public double getArea() {
//         return side * side;
//     }

//     @Override
//     public double getPerimeter() {
//         return 4 * side;
//     }
// }

// class Triangle implements Measurable {
//     double base, height, side1, side2;

//     Triangle(double base, double height, double side1, double side2) {
//         this.base = base;
//         this.height = height;
//         this.side1 = side1;
//         this.side2 = side2;
//     }

//     @Override
//     public double getArea() {
//         return 0.5 * base * height;
//     }

//     @Override
//     public double getPerimeter() {
//         return base + side1 + side2;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Measurable square = new Square(4);
//         Measurable triangle = new Triangle(3, 4, 3, 5);
        
//         System.out.println("Square area: " + square.getArea());
//         System.out.println("Square perimeter: " + square.getPerimeter());
//         System.out.println("Triangle area: " + triangle.getArea());
//         System.out.println("Triangle perimeter: " + triangle.getPerimeter());
//     }
// }


// Encapsulation Programs:


// class BankAccount {
//     private double balance;

//     public BankAccount(double initialBalance) {
//         if (initialBalance >= 0) {
//             this.balance = initialBalance;
//         } else {
//             this.balance = 0;
//             System.out.println("Initial balance cannot be negative. Setting balance to 0.");
//         }
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//         } else {
//             System.out.println("Deposit amount must be positive.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println("Invalid withdrawal amount.");
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount(1000);
//         account.deposit(500);
//         account.withdraw(200);
//         System.out.println("Current balance: " + account.getBalance());
//         account.withdraw(1500); 
//     }
// }


// class Student {
//     private String name;
//     private double grade;

//     public Student(String name) {
//         this.name = name;
//         this.grade = 0; // Default grade
//     }

//     public String getName() {
//         return name;
//     }

//     public double getGrade() {
//         return grade;
//     }

//     public void setGrade(double grade) {
//         if (grade >= 0 && grade <= 100) {
//             this.grade = grade;
//         } else {
//             System.out.println("Grade must be between 0 and 100.");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student student = new Student("Alice");
//         student.setGrade(85);
//         System.out.println("Student: " + student.getName() + ", Grade: " + student.getGrade());
//         student.setGrade(110); // Invalid grade
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Product product = new Product("Laptop", 1200.00, 10);
//         System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
//         product.setPrice(-500); // Invalid price
//         product.setQuantity(5);
//         System.out.println("Updated Quantity: " + product.getQuantity());
//     }
// }


// class Product {
//     private String name;
//     private double price;
//     private int quantity;

//     public Product(String name, double price, int quantity) {
//         this.name = name;
//         setPrice(price);
//         setQuantity(quantity);
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public int getQuantity() {
//         return quantity;
//     }

//     public void setPrice(double price) {
//         if (price >= 0) {
//             this.price = price;
//         } else {
//             System.out.println("Price cannot be negative.");
//         }
//     }

//     public void setQuantity(int quantity) {
//         if (quantity >= 0) {
//             this.quantity = quantity;
//         } else {
//             System.out.println("Quantity cannot be negative.");
//         }
//     }
// }

// class Employee {
//     private int id;
//     private String name;
//     private double salary;

//     public Employee(int id, String name) {
//         this.id = id;
//         this.name = name;
//         this.salary = 0; // Default salary
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void setSalary(double salary) {
//         if (salary >= 0) {
//             this.salary = salary;
//         } else {
//             System.out.println("Salary cannot be negative.");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Employee employee = new Employee(1, "John Doe");
//         employee.setSalary(50000);
//         System.out.println("Employee ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
//         employee.setSalary(-1000); // Invalid salary
//     }
// }


//PACKAGES

// import java.lang.Math;

// public class Main {
//     public static void main(String[] args) {
//         double num = 10.5;
//         double sqrt = Math.sqrt(num);
//         System.out.println("Square root of " + num + " is " + sqrt);
//     }
// }

// import java.lang.String;

// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello, World!";
//         System.out.println("Length of the string: " + str.length());
//         System.out.println("String in uppercase: " + str.toUpperCase());
//     }
// }

// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Cherry");
//         System.out.println("List: " + list);
//     }
// }

// import java.util.HashMap;

// public class Main {
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("John", 25);
//         map.put("Alice", 30);
//         System.out.println("Map: " + map);
//     }
// }

// import java.io.File;

// public class Main {
//     public static void main(String[] args) {
//         File file = new File("example.txt");
//         System.out.println("File exists: " + file.exists());
//     }
// }

// import java.net.HttpURLConnection;
// import java.net.URL;

// public class Main {
//     public static void main(String[] args) {
//         try {
//             URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
//             HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//             connection.setRequestMethod("GET");

//             int responseCode = connection.getResponseCode();
//             System.out.println("Response Code: " + responseCode);
//         } catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;

// public class SimpleDatabaseExample {
//     public static void main(String[] args) {
//         try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "your_username", "your_password")) {
//             String insertSQL = "INSERT INTO Users (name) VALUES ('Alice')";
//             try (PreparedStatement insertStatement = connection.prepareStatement(insertSQL)) {
//                 insertStatement.executeUpdate();
//                 System.out.println("Data inserted.");
//             }
//         } catch (Exception e) {
//             System.out.println("Database error: " + e.getMessage());
//         }
//     }
// }

//import java.io.*;

//class college {
//    public static void main(String[] args) throws IOException {
//        File f = new File("C:\\Users\\Sahil\\Desktop\\lc.txt");
//        if (f.createNewFile()) {
//           System.out.println("File successfully created.");
//        } else {
//            System.out.println("File already exists.");
//        }
//    }
//}
