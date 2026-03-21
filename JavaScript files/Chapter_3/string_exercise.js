//    Let's Practice
/*
    Qs1. Prompt the user to enter their full name. Generate a username for them based on the input.
    Start username with @, followed by their full name and ending with the fullname length.
        eg: user name = “shradhakhapra” , username should be “@shradhakhapra13"

*/

let str = prompt(" Enter  your Full name ");
console.log(str);

let str1 = str.toLowerCase();
let str2 = str1.trim();
let userName = "@" +  str2 + str2.length;
// let username = `@${str2}${str2.length}`;
// console.log(username);
console.log(userName);

// THREE LINES CODE 

let name = prompt("Enter your full name");

let username = `@${name.trim().toLowerCase()}${name.trim().length}`;

console.log(username);