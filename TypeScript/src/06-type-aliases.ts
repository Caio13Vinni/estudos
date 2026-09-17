// Type Alias
type Point = {
    x: number;
    y: number;
}

let point:Point = {x: 10, y: 20}

//  Type Alias for primitives
type ID = string | number;

let userId: ID = "Test";
let productID: ID = 124;

// Type alias vc Interface

// Interfaces can be extended, type aliases cannot
interface Animal{
    name: string;
}

interface Dog extends Animal{
    breed: string;
}

let myDog: Dog = {
    name: "Buddy",
    age: 3,
    breed: "Golden Retriever"
}

// interfaces can be declared multiple times and will merge
interface Animal{
    name: string;
}
interface Animal{
    age: number;
}

let dog: Animal = {
    age:3,
    name:"buddy",
}

// Use interfaces for object shapes,
// type aliases for unions.intersections