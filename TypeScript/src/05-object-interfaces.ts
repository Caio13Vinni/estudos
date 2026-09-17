// Interface
interface  User {
    name: string,
    age: number;
    email?: string; // ? == optiocnal property
    readonly id: number;
}

// Object type annotation
let user: User = {
    name: "test",
    age: 27,
    email: "test@test.com",
    id: 1,
};

interface Product {
    name: string;
    price: number;
    getDiscount(percent:number): number;
}

let laptop: Product = {
    name: "Mac book pro",
    price: 2000.00,
    getDiscount(percentage: number): number {
        return this.price * (percentage/100)
    },


}