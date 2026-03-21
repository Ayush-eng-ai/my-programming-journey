 //Variable Rules
//1.Variable name are caase sensitive;"a" & "A" are different
var a = 5;
var A = 10;
console.log(a);
console.log(A);


//2. Only Letters,  digits, underscore(_)and $ is allowed.(Not even Space)
var _name = "Ayush";
var $age = 20;
console.log(_name);
console.log($age);


//3. Only Letter a underscore(_) or $ should be 1st character.
var name1 = "Ayush"; //Valid
//var 1name = "Ayush"; //Inval
console.log(name1);         


//4. No reserved words allowed
//var var = 10; //Invalid
var age = 20; //Valid
console.log(age);


//5. Use meaningful names
var studentAge = 20; //Good
console.log(studentAge);
var sa = 20; //Bad
console.log(sa);




//6. Use camelCase for multiple words
var myFirstName = "Ayush"; //Good
console.log(myFirstName);
var Myfirst_name = "Ayush";
//Bad
console.log(Myfirst_name);


//7. Reserved Words cannot be variable names
//var if = 10; //Invalid
var number = 10;
console.log(number);


//8. Avoid using var , use let and const instead
let city = "New York"; //Using let
console.log(city);
const country = "USA";
console.log(country);
//country = "Canada"; //Error: Assignment to constant variable.
//  Reserved words can not be variable names.
        // break, catch, class, const, continue, debugger, default, delete, do, else, export, extends, finally, for, function, if, import, in, instanceof, new, return, super, switch, this, throw, try, typeof, var, void, while, with, yield 


// fullName= Camel Case
// FullName= Pascal Case
// full_name= Snake Case
// full-name= Kebab Case


// Variables Keywords in JS
// var, let & const


// var - Variable can be re-declared & updated.A global scope Variable.
// let - Variable can be updated but not re-declared.Block scope Variable.
// const - Variable can neither be updated nor re-declared.Block scope Variable.

// Example of var
var fruit = "Apple";
console.log(fruit);
var fruit = "Banana"; //Re-declared
console.log(fruit);
fruit = "Orange"; //Updated
console.log(fruit);

// Example of let
let vegetable = "Carrot";
console.log(vegetable);
vegetable = "Broccoli";
console.log(vegetable); //Updated
//let vegetable = "Spinach"; //Error: Identifier 'vegetable' has already been declared

// Example of const
const drink = "Water";
console.log(drink);
//drink = "Juice"; //Error: Assignment to constant variable
//const drink = "Soda"; //Error: Identifier 'drink' has already been declared

// Summary
// Use var for global scope variables when re-declaration is needed.
// Use let for block scope variables when updating is needed.
// Use const for block scope variables when neither updating nor re-declaration is needed.

// 2015 new features of JS (ES6) introduced let & const keywords to provide better variable scoping and immutability options compared to var.