// Operators in JS
// Used to perform some operation on data

// Arithmetic Operators
/*  +,-, *, /
Modulus
Exponentiation
Increment
Decrement*/
// Example

let a = 5;
let b = 6;

console.log("a = ",a, "& b = ",b);
console.log("a+b= ", a + b );
console.log("a-b= ", a - b );
console.log("a*b= ", a * b );
console.log("a/b= ", a / b );
console.log("a**b= ", a ** b );
console.log("a%b= ", a % b );
console.log("a**b= ", a ** b );
// unary operators(++, --) (a++(post incr., ++a(pre incr.))),  (a--(post incr., --a(pre incr.)))
// 🟡
console.log("a = ",a, "& b = ", b);
a--;
console.log("a =",a); //4

console.log("++a =",++a); //pre increment

console.log("a++ =",a++); // post increment 
console.log("a = ",a);

console.log("--a =",--a);   //pre decrement

console.log("a-- =",a--); // post decrement 
console.log("a = ",a);




//Asignment Operators
// (=, +=, -=, *=, %=, **=)
let c = 5;
let d = 2;

c += 4; //c = c+4
console.log("a =", a)

c -= b; //c = c-d
console.log("a =", a)
console.log(c)



//Comparison Operator
//(==:equal to, ===:equal to & type, !=:Not equal to, !==:Not equal to & type, >, >=,<, <=)

let e = 6;//number
let f = 3;// Number
console.log("6 == 3", a == b); // False
console.log("6 != 3", a != b); // True

let g = 6;//number
let h = "3";//String -> number
console.log("6 === 3", g === h); // False
console.log("6 !== 3", g !== h); // False



// Operators in JS
/* Logical Operators
Logical AND &&
Logical OR ||
Logical NOT !
*/
let i = 5;
let j = 6;

let cond1 = i < j; // true
let cond2 = i == j; // False
console.log("cond1 && cond2 = ", cond1 && cond2);
console.log("cond1 || cond2 = ", cond1 || cond2);
console.log("!(cond1 || cond2) = ", !(cond1 || cond2));



