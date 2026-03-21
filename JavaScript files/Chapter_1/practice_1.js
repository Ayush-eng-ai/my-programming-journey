// Ques(1) Create a const object called "product" to store Information shown in the picture.
const products = {
    productName: "Laptop",
    price: 1200,
    inStock: true,
    specifications: {
        processor: "Intel i7",
        ram: "16GB",
        storage: "512GB SSD"
    }
};


const productsInfo = `Product Name: ${products.productName}
Price: $${products.price}
In Stock: ${products.inStock ? "Yes" : "No"};
Specifications:
  - Processor: ${products.specifications.processor}
  - RAM: ${products.specifications.ram}
  - Storage: ${products.specifications.storage}`;
console.log(productsInfo);


// Ques(2) Creat a const object called "profile" to store information shown in the picture.
const profile = {
    firstName: "Ayush",
    lastName: "Kumar",
    age: 20,
    isEmployed: false,
    skills: ["JavaScript", "HTML", "CSS"]
};
const profileInfo = `First Name: ${profile.firstName}
Last Name: ${profile.lastName}
Age: ${profile.age}
Employed: ${profile.isEmployed ? "Yes" : "No"}
Skills: ${profile.skills.join(", ")}`;
console.log(profileInfo);




// Ques(3) Create a variable to store your name, age, isStudent (boolean), and print all the values in console.
let name = "Ayush";
let age = 20;
let isStudent = true;