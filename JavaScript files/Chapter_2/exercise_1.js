// Let's Practice
// Ques 1: Get user to input a number using prompt("Enter a number:"). check if the number is a multiple of 5 or not.


// Alert & Prompt
alert("hello"); //one time popup
let name = prompt("hello");// 
console.log(name) 


let num = prompt("Enter a number:"));
if(num  % 5 === 0){
    console.log(num,"is a multiple of 5");
}else{
    console.log(num,"not a multiple of 5");
}

// Ques 2: Write  a code which can grades to students according to their scores:
let score = prompt("Enter a Score(0-100):");
if(score <= 100 && score >=80 ){
    console.log(score,"A");
}else if(score < 80 && score >=70) {
    console.log(score,"B");
}else if(score < 70 && score >= 60) {
    console.log(score,"C");
}else if(score < 60 && score >=50) {
    console.log(score,"B")
}else if(score < 50 && score >=40) {
    console.log(score,"B");
}else {
    console.log(score,"Failed");
}
