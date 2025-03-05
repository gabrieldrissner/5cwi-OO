//Theorie
//aus https://thecodest.co/de/blog/vor-und-nachteile-von-javascript/
// keine statische Typisierung --> erschwert die Entwcklung umfangreicher Anwendungen
// JS bietet Lösung, indem es statische Typisierungfunktionen überlagert
//Abhängigkeit von Bibliotheken
//lange Ladezeiten bei großen Websiten
//Sicherheitslücken - wird auf Client-Seite ausgeführt, Code ist so für jeden zugänglich, der Website besucht
//bösartiger Code kann so ohne es zu wissen sich in die Website einschleussen
//Fehlersuche - Fehler sind schwer zu finden, da JS keine Fehlermeldungen ausgibt


//Praxis

function add(a, b) {
    return a + b;
}
//keine statische Typisierung --> Fehleranfälligkeit
console.log("vermischen von Datentypen führt zu Problemen:")
console.log(add(5, 10)); 
console.log(add("5", 10)); 
//JS erlaubt das Vermischen von verschiedenen Datentypen, führt zu problemen


console.log("ein langesArray ladet extrem lange" + Array.from({ length: 1000000 }, (_, i) => i + 1));
//lange Ladezeit bei einem riesigen Array

console.log("Geheimes API-Token: 12345");
//Sicherheitsrisiko, Code kann von Angreifern angesehen werden

document.body.innerHTML = "<img src='x' onerror='alert(\"Hacked!\")'>";
//Bösartiger Code kann in die Website eingefügt werden

function test() {
    return x + 10; 
}

try {
    test();
} catch (e) {
    console.error("Fehler erkannt:", e.message); 
}
//Fehler sind schwer zu finden, da JS keine Fehlermeldungen ausgibt


