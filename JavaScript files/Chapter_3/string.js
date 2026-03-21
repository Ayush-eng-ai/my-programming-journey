// String in JS
/*
    String is a sequence of characters used to represent text
        //create string
            letstr = "Ayush Rajput";
        // String Length
            str.length
        //String Indices
            str[0], str[1], str[2]
    */

let str = "Ayush";
let str2 = "Rajput";

// console.log(t25)
console.log("Name", str, str2);
console.log(str[8]);

    // Template Literals in JS
/* 
    A way to have embedded expressions in strings
        `this is a template literal`

    // String Interpolation
     T Create string by doing substitution of placeholders
        `string text ${expression} string text`
    */
let sentence = `this is a template literal`; //special type  of  string
   console.log(typeof sentence);


let  obj = {
    item: "pen",
    price:"10"
   };
let output =`the cost of ${obj.item} is ${obj.price} rupees`; // templete literal
console.log(output);
   console.log("The cost of", obj.item, "is", obj.price, "rupees");
 console.log(` This is a Templete literal ${ 1 + 2 + 3}`);


//  Escape characters(   \n,  \t)
console.log(`Ayush \nRajput`);
console.log(`Ayush \tRajput`);




// String Methods in JS
/* 
    These are built-in function to manipulate a string
            // str.to Upper Case( )
            // str.to lower Case( )
            // str.trim( )  ////removes whitespaces
            // str.slice(start, end?)  # returns part of string
            // str1.concat(str2)  # joins str2 with strl
            // str.replace( searchVal, newVal )
            // str.charAt(idx) I
    */

        
let str3 = "   Ayush   Rajput  "
console.log(str3.toUpperCase( ))
console.log(str3.toLowerCase())
console.log(str3.trim( )  )
console.log(str3)

// String is immutable  in Javascript

let str4 = "012345678"
console.log(str4.slice(1, 6)); //starting number added but ending number is not included

console.log(str4.slice(1));

console.log(str4.slice(7 ));

let str5 = "Ayush"
let str6 = " Rajput"

let res = str5.concat(str6);
console.log(res);

let result = " I am " + str5 + str6;
console.log(result);



let str7 = "hello"
console.log(str7.replace("h", "A"));


let str8 = "hello hoho"
console.log(str8.replaceAll("h", "A"));

let str9 = "Ayush Rajput"
console.log(str9.charAt(7));


