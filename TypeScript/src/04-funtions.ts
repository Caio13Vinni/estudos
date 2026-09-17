// Basic function with types
function add(a: number, b: number): number{
    return a + b;
}

// opitional paramtes
function greet(name: string, greeting?: string): string{
    if(greeting){
        return `${greeting}, ${name}!`;
    }
    return `Hello, ${name}!`
}

// Default parrameters
function multiply(a: number = 4, b: number= 4):number {
    return a * b;    
}
console.log(multiply(8, 8));
console.log(multiply());


// Rest parameters
function sum(...numbers: number[]): number{
    return numbers.reduce((total, n) => total + n, 0);
}

console.log(sum(23, 23));


// Arrow functrions
const divide = (a: number, b: number):number => a / b;

// Function types
let calculate: (x: number, y: number) => number;

calculate = add;