//1
let sum = 0;
for (let i = 0; i <= 10; i++) {
    sum += i;
}
console.log("Aufgabe 1: " + sum);

// 2
let sum2 = 0;
for (let i = 1; i <= 30; i++) {
    if (i % 3 === 0) {
        sum2 += i;
    }
}
console.log("Aufgabe 2: " + sum2);

//3
let sum3 = 0;
for (let i = 1; i <= 20; i++) {
    if (i % 2 === 0) {
        sum3 += i;
    }
}
console.log("Aufgabe 3: " + sum3);

//4
let sum4 = 0;
for (let i = 1; i <= 20; i++) {
    if (i % 2 >0) {
        sum4 += i;
    }
}
console.log("Aufgabe 4: " + sum4);

//5
let sum5 = 0;
for (let i = 10; i >= 1; i--) {

    console.log("Aufgabe 5: " + i);
}

//6
let sum6 = 0;
for(let i = 1; i<6; i++){
    sum6+= i*i;
}
console.log("Aufgabe 6: " + sum6);

//7
let sum7 = 0;
for(let i = 1; i<101; i++){
    sum7 += i;
}

console.log("Aufgabe 7: " + sum7);

//8
let sum8 = 1;
for(let i = 1; i<6; i++){
    sum8 *= i;
}

console.log("Aufgabe 8: " + sum8);

//9
let Array = []; 
for (let i = 1; i < 11; i++) {
    Array.push(3 * i); 
}
console.log("Aufgabe 9: " + Array.join(", ")); 
