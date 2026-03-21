// let' Practice
/*
    Ques1: Print all even numbers from 0 to 100.
*/

for(let i =0; i<=100; i++) {
    if(i%2===0){//even number
        console.log("i", i);

    }
}

let num =0;
// let even;
while(num<=100){
    if(num%2===0){
    console.log("even", num);
}
    num++;
}

/*
    Ques2: Create a game where you start with any random game Number. Ask the user to keep guessing the game number until the user enters correct Value.
    */
let gameNum =25;

let userNum = prompt("Guess the game number :");
while(userNum != gameNum) {//game
    userNum = prompt("you entered wrong number, guess again:");
}

console.log("Congratulation, you enter the right number");
