//primitives
let username: string = "Piyush";
let age: number = 27;
let isAdmin: boolean = true;

// Array
let numbers:number[] = [1,3,4,2,5,5];
let names:string[] = ["test", "typescript", "Javascript"];

// Tuples
let person:[string, number]  = ["Piyush", 27]

// Enums
enum color{
    Red,
    Green,
    Blue
}
let favoriteColor:color = color.Blue;

console.log(favoriteColor)

// Any type (Avoid when Possible)
let randomValue: any = 10;
randomValue = "Test"
randomValue = false;

console.log(randomValue)

// Unkown (Safer than any)
let userInput: unknown;
userInput = 5; 
userInput = "text";
userInput = false;
console.log(userInput)


// Void (for function that dont't return)
function subscribe(message: String): void{
    console.log(message);
}

console.log(subscribe);

// Null and Undefined
let nullValue: null = null;
let undefinedvalue: undefined = undefined;