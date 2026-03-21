// Data Type in JS

//  Ther are 2 types of Data Types in JS
// 1. Primitive Data Types (7 types)
// 2. Non-Primitive Data Types (Reference Data Types) (objects,{ arrays, functions})

// Primitive Data Types:
// String, Number, Boolean, Null, Undefined, BigInt, Symbol

//1. String Data Type
var name = "Ayush"; //String
console.log("My name is " + name);
console.log(typeof name); //typeof operator to check data type

//2. Number Data Type
var age = 20;
console.log("My age is " + age);
console.log(typeof age); //typeof operator to check data type

//3. Boolean Data Type
var isStudent = true;
console.log("Am I a student? " + isStudent);
console.log(typeof isStudent); //typeof operator to check data type

//4. Null Data Type
var emptyValue = null;
console.log("The value is " + emptyValue);
console.log(typeof emptyValue); //typeof operator to check data type

//5. Undefined Data Type
var notDefined;
console.log("The value is " + notDefined);
console.log(typeof notDefined); //typeof operator to check data type

//6. BigInt Data Type
var bigIntValue = 9007199254740991n; //n at the end denotes BigInt
console.log("BigInt value is " + bigIntValue);
console.log(typeof bigIntValue); //typeof operator to check data type

//7. Symbol Data Type
var sym = Symbol("uniqueIdentifier");
console.log("Symbol value is " + sym.toString());
console.log(typeof sym); //typeof operator to check data type


// Non-Primitive Data Types (Reference Data Types)
//1. Object Data Type
const person = {
    name: "Ayush",
    age: 20,
    isStudent: true
};
console.log("Person Object: ", person);
console.log(typeof person); //typeof operator to check data type

//2. Array Data Type
const numbers = [1, 2, 3, 4, 5];
console.log("Array: ", numbers);
console.log(typeof numbers); //typeof operator to check data type

//3. Function Data Type
function greet() {
    return "Hello!";
}
console.log("Function Output: " + greet());
console.log(typeof greet); //typeof operator to check data type

// Note: In JavaScript, arrays and functions are also considered objects.




