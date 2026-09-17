// String literal types
let direction: "north" | "south" | "east" | "west";
direction = "east"
// direction = "up" return error, up not set on variable direction

// Numeric Literal Types
let diceroll: 1 | 2 | 2 | 3 | 4 | 5 | 6;

// Combining with other types


// Combininb with other types
type SucessResponse = {
    status: "sucess";
    data: any    
}

type ErrorResponse = {
    status: "Error";
    message: String;    
}
type ApiResponse = SucessResponse | ErrorResponse;