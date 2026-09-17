// Type asserions
let someValue: unknown = "Subscribe to RoadsideCoder"
let strLength:number = (someValue as String).length;
/* or */
let strLength2:number = (<String>someValue).length;

// type guards
function processValue(value: string | number) {
    if (typeof value === "string") {
        console.log(value.toLocaleUpperCase);
    }else{
        console.log(value.toFixed(2));
        
    }
}