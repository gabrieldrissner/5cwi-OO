const express = require("express"); //Expresss importieren

const app = express(); //Express Anwendung erstellen

const port = 3000; //Port

// Middleware (Software zwischen Betriebssystemen), Verarbeitung von JSON-Daten
app.use(express.json());


let persons = [{ id: 1, firstname: "Julian", lastname: "Deronja" }]; //Datensätze

// get, Request gibt alle Personen zurück als JSON
app.get("/persons", (req, res) => res.json(persons));

//post, fügt Datensatz hinzu
app.post("/persons", (req, res) => { //Abfrage erfolgt über persons im Request
  const person = req.body; // Im Request Body wird neue Person erstellt
  person.id = persons.length + 1; // Automatisch neue ID, +1 für die nächste freie
  persons.push(person); // Push, Person zur Liste hinzufügen
  res.json(person); // neue Person als JSON zurückgeben
});

//put aktualisert einen Datensatz
app.put("/persons/:id", (req, res) => { //hier muss persons + id angegeben werden, um den Datensatz zu aktualisieren
  const id = +req.params.id; // ID wird extrahiert, anschließend in Zahl umgewandelt
  const person = persons.find((p) => p.id === id); // Suchfunktion für die ID
  if (person) {
    Object.assign(person, req.body); // Wenn Person gefunden wird, Datensatz aktualisieren
    res.json(person); 
  } else {
    res.status(404).send("Not found"); // Wenn nicht Fehlecode
  }
});

app.delete("/persons/:id", (req, res) => { //persons + id mitgeben im Request
  const id = +req.params.id; // Id extrahieren, in Zahl umwandeln
  persons = persons.filter((p) => p.id !== id); // Datensatz nach ID filtern, anschließend löschen
  res.send("Deleted"); // alert senden, deleted
});

app.listen(port, () =>
  console.log(`Server läuft auf http://localhost:${port}`) //Server starten, alert senden
);
