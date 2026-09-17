"use strict";
//primitives
let username = "Piyush";
let age = 27;
let isAdmin = true;
// Array
let numbers = [1, 3, 4, 2, 5, 5];
let names = ["test", "typescript", "Javascript"];
// Tuples
let person = ["Piyush", 27];
// Enums
var color;
(function (color) {
    color[color["Red"] = 0] = "Red";
    color[color["Green"] = 1] = "Green";
    color[color["Blue"] = 2] = "Blue";
})(color || (color = {}));
let favoriteColor = color.Blue;
console.log(favoriteColor);
// Any type (Avoid when Possible)
let randomValue = 10;
randomValue = "Test";
randomValue = false;
console.log(randomValue);
// Unkown (Safer than any)
let userInput;
userInput = 5;
userInput = "text";
userInput = false;
console.log(userInput);
// Void (for function that dont't return)
function subscribe(message) {
    console.log(message);
}
console.log(subscribe);
// Null and Undefined
let nullValue = null;
let undefinedvalue = undefined;
