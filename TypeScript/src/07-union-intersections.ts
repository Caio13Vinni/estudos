// Union types (OR)
type Status = "pending" | "aproved" | "reject"

function setStatus(status: Status): void{
    console.log(`Status set to: ${status}`)!
}
 
setStatus("aproved")
// Intersections type (AND)
interface Colorful{
    color: String;
}

interface Circle{
    radius: number;
}

type ColorfulCircle = Colorful & Circle

let myCircle:ColorfulCircle = {
    color: "Red",
    radius: 13,
    
}

