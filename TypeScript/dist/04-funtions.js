"use strict";
// Basic function with types
function add(a, b) {
    return a + b;
}
// opitional paramtes
function greet(name, greeting) {
    if (greeting) {
        return `${greeting}, ${name}!`;
    }
    return `Hello, ${name}!`;
}
// Default parrameters
function multiply(a = 4, b = 4) {
    return a * b;
}
console.log(multiply(8, 8));
console.log(multiply());
// Rest parameters
function sum(...numbers) {
    return numbers.reduce((total, n) => total + n, 0);
}
console.log(sum(23, 23));
// Arrow functrions
const divide = (a, b) => a / b;
// Function types
let calculate;
calculate = add;
