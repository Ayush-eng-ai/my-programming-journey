// Loops in JS
// Loops are used to execute a piece of code again & again

// for, while, do_while Loop, for of loop, for in loop

// for Loop
/* for(let i; i <=5; i++){
    console.log("Ayush Rajput");
}*/
3*console.log("Ayush Rajput")

for(let i=1; i <=5; i++){
    console.log("Ayush Rajput",i);
}

// Calculate sum of 1 to n :
let sum = 0;
let n = 10;
for(let i = 1; i<=n; i++){
    sum = sum + i;
}
console.log("sum = ",sum);
console.log("loop has ended");



//  // Infinite Loop : A Loop that never ends 

// // While Loop
/* while(condition){
// do some work}
*/
let i = 1;
while(i<=5) {
   console.log("i", i);
   i++;
}

// // Do-while loop at least one time will be executed

let p = 1;
do{
    console.log("p=", p);
    p = p+1;
}while(p<=0);

         // For-of Loop
/*
    for(let val of strVar){
        // do some work
    }
*/

let str = "Ayush Rajput";

let size =0;
for(let value of str) {
    // iterator-> characters
    console.log("Value", value);
    size++;
}

console.log("String size=", size);



    // for-in Loop
/*
    for(let key in objVar) {
        // do some work
    }
*/
let student = {
    name : "Ayush Rajput",
    age: 20,
    cgpa:7.5,
    isPass:true
};
for(let key in student) {
    console.log("key", key, "value=", student[key]);
}

