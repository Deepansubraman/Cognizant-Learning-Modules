// Question 1: JavaScript Basics & Setup
console.log("Welcome to the Community Portal");
window.onload = function () {
  alert("Page fully loaded!");
};

// Question 2: Syntax, Data Types, and Operators
const eventName = "Community Music Night";
const eventDate = "2025-06-10";
let seatsAvailable = 50;
console.log(`Upcoming Event: ${eventName} on ${eventDate}. Seats: ${seatsAvailable}`);

// Question 3: Conditionals, Loops, and Error Handling
const events = [
  { name: "Music Night", date: "2025-06-10", seats: 10 },
  { name: "Tech Expo", date: "2024-01-01", seats: 0 },
  { name: "Food Festival", date: "2025-08-15", seats: 25 },
];

function displayValidEvents() {
  const today = new Date();
  events.forEach((event) => {
    const eventDate = new Date(event.date);
    if (eventDate > today && event.seats > 0) {
      console.log(`Event: ${event.name}, Date: ${event.date}, Seats: ${event.seats}`);
    } else {
      console.log(`Event ${event.name} is not valid to show.`);
    }
  });
}

// Question 4: Functions, Scope, Closures, Higher-Order Functions
function addEvent(name, date, seats) {
  events.push({ name, date, seats });
}

function registerUser(eventName) {
  try {
    const event = events.find((e) => e.name === eventName);
    if (event && event.seats > 0) {
      event.seats--;
      console.log(`Registered for ${eventName}. Remaining seats: ${event.seats}`);
    } else {
      throw new Error("Event full or not found");
    }
  } catch (error) {
    console.error("Registration error:", error.message);
  }
}

function filterEventsByCategory(category, callback) {
  const filtered = events.filter((e) => e.name.toLowerCase().includes(category));
  callback(filtered);
}

function registrationCounter() {
  let total = 0;
  return function () {
    total++;
    return total;
  };
}
const countRegistration = registrationCounter();

// Question 5: Objects and Prototypes
function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}
Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const musicEvent = new Event("Jazz Fest", "2025-07-20", 30);
console.log(Object.entries(musicEvent));

// Question 6: Arrays and Methods
const musicEvents = events.filter((e) => e.name.toLowerCase().includes("music"));
const displayCards = events.map((e) => `Event Card: ${e.name}`);

// Question 7: DOM Manipulation
function renderEvents() {
  const gallery = document.getElementById("gallery");
  events.forEach((event) => {
    const div = document.createElement("div");
    div.className = "eventCard";
    div.textContent = `${event.name} - ${event.date} - Seats: ${event.seats}`;
    gallery.appendChild(div);
  });
}

// Question 8: Event Handling
function setupEventHandlers() {
  document.querySelector("#registrationForm").addEventListener("submit", function (e) {
    e.preventDefault();
    submitForm(e);
  });

  document.querySelector("select[name='type']").addEventListener("change", function () {
    const category = this.value.toLowerCase();
    filterEventsByCategory(category, (filtered) => console.log(filtered));
  });

  document.querySelector("input[name='name']").addEventListener("keydown", function (e) {
    console.log("Searching:", e.target.value);
  });
}

// Question 9: Async JS, Promises, Async/Await
function fetchEvents() {
  fetch("mock-events.json")
    .then((res) => res.json())
    .then((data) => console.log("Fetched events:", data))
    .catch((err) => console.error("Error fetching events", err));
}

async function fetchWithSpinner() {
  document.body.classList.add("loading");
  try {
    const res = await fetch("mock-events.json");
    const data = await res.json();
    console.log("Async fetched:", data);
  } catch (err) {
    console.error("Async error:", err);
  } finally {
    document.body.classList.remove("loading");
  }
}

// Question 10: Modern JavaScript Features
function logEvent({ name, date, seats = 0 }) {
  console.log(`Event: ${name} on ${date}, Seats: ${seats}`);
}

const allEventsCopy = [...events];

// Question 11: Working with Forms
function submitForm(event) {
  event.preventDefault();
  const form = event.target.form;
  const name = form.elements.name.value;
  const email = form.elements.email.value;
  const date = form.elements.date.value;
  if (!name || !email || !date) {
    alert("All fields are required!");
    return;
  }
  document.getElementById("formOutput").textContent = `Thanks for registering, ${name}!`;
}

// Question 12: AJAX & Fetch API
function postRegistration() {
  const user = {
    name: "Jane",
    email: "jane@example.com",
  };
  fetch("https://example.com/register", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(user),
  })
    .then((res) => res.json())
    .then((data) => {
      setTimeout(() => alert("Registration Success!"), 1000);
    })
    .catch(() => alert("Failed to register"));
}

// Question 13: Debugging and Testing
function debugForm() {
  console.log("Debugging form submission...");
  const form = document.getElementById("registrationForm");
  console.log("Form elements:", form.elements);
}

// Question 14: jQuery and JS Frameworks
$(document).ready(function () {
  $("#registerBtn").click(function () {
    alert("Registered via jQuery");
  });

  $(".eventCard").fadeIn();
});
window.onload = function () {
  alert("Page fully loaded!");
  renderEvents();
  setupEventHandlers();
};
