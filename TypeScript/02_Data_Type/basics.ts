// Primitives : number, string, boolean
// More complex types : arryas, objects
// Function types, parameters

// Primitives
let age: number = 24;
let userName: string = 'Ydmins';
let isInstructor: boolean = true;

// Complex types
let hobbies : string[];
hobbies = ['Sports', 'Cooking'];

let person : {
    name: string;
    age: number;
};

person = {
    name: "Ydmins",
    age: 24,
}

// Types inference
let course : string = 'React - The Complete Guide';

// Union Types
let lecture : string | number = 'TypeScript';
lecture = 12341;

let members : string | string[];

// Type Alias
type Home = {
    address : string;
    size : number;
}

let town : Home[];

// Functions & Types
function add(a: number, b:number):number {
    return a+b;
}

function print(value : any):void{
    console.log(value);
}

// Generics
function insertAtBeginning<T>(array: T[], value: T){
    const newArray = [value, ...array];
    return newArray;  
}

// Classes & TypeScript
class Student {
    // firstName: string;
    // lastName: string;
    // age: number;
    // private courses: string[];

    // constructor(firstName: string, lastName: string, age:number, courses:string[]){
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.age = age;
    //     this.courses = courses;
    // }

    constructor(
        public firstName:string,
        public lastName:string,
        public age:number,
        private courses:string[]
    ){}

    enrol(courseName: string){
        this.courses.push(courseName);
    }

    listCourses(){
        return this.courses.slice();
    }
}

const student = new Student('Ydmins', "Best", 23, ['Angular'] );
student.enrol('React');
student.listCourses();

// Interface
interface Human {
    firstName: string;
    age: number;

    greet : () => void;
}

let max: Human;
max = {
    firstName : 'Max',
    age: 32,
    greet(){
        console.log('Hello');
    }
}

class Instructor implements Human{
    firstName : string;
    age; nubmer;
    greet(){
        console.log("hello!");
    }
}

//