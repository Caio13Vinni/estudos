"use strict";
// Object type annotation
let user = {
    name: "test",
    age: 27,
    email: "test@test.com",
    id: 1,
};
let laptop = {
    name: "Mac book pro",
    price: 2000.00,
    getDiscount(percentage) {
        return this.price * (percentage / 100);
    },
};
