console.log ("Ayush")
//  Arrays in JS
/* 
    // Collection of items  -->  linear way
    
    // Create Arrays

    
        // let heroes = [ “ironman”, “hulk”, “thor”, “batman” J
        // let marks = [ 96, 75, 48, 83, 66, 1];
        // let info = “rahul”, 86, “Delhi” J;


*/
let marks_student1 = 97;
let marks_student2 = 82;


let marks  = {
    stu1: 97,
    stu2: 82
}



// let's start the arrays

let mark = [97, 82, 85, 67, 76, 89, 87 ];
console.log(mark);
console.log(mark.length);  //property

let heroes = ["iranman","thor", "shaktiman"];
console.log(heroes);
console.log(heroes.lenghth);


        // array Indices
/*
    arr[0], arr[1], arr[2], ......

*/

console.log(mark[3] = 68);
console.log(mark[6] = 88);

//      Strings---> immutable
//      arrays ----> mutable


console.log(heroes[2]= "Ayush");

console.log(heroes[3]= "Piyush");

console.log(heroes[1]);


/* 
    //  Looping over an Array
      Printall elements of an arrys
       looping-->iterable(strings, objects, arrays)  

*/

let friuts = ["Apple", "banana","bitter gaurd", "orange"]

for(let idx =0; idx<friuts.length; idx++) {
    console.log(friuts[idx]);
}

//  for of loop
for(let el of friuts) {
    console.log(el);
}


// for in loop
for (let index in friuts) {
    console.log(index);
    console.log(friuts[index]);
}

console.log (print ("Hello World"))
function print (msg) {
    return msg;
}



console.log ("Ayush")
queueMicrotask (() => {    