/* =====================================================
COMMUNITY EVENT PORTAL - PROFESSIONAL JAVASCRIPT
CTS DN5.0 UPSKILLING
===================================================== */

/* Welcome Message */
console.log("Welcome to the Community Portal");

window.onload = function () {
alert("Welcome to the Community Event Portal");
};

/* Event Data */
const portalName = "Community Event Portal";

const events = [
{
id: 1,
name: "Music Festival",
category: "Music",
date: "2026-06-15",
seats: 50
},
{
id: 2,
name: "Sports Meet",
category: "Sports",
date: "2026-06-20",
seats: 30
},
{
id: 3,
name: "Technology Workshop",
category: "Technology",
date: "2026-06-25",
seats: 40
}
];

/* Display Event Information */
events.forEach(event => {
console.log(
`${event.name} | ${event.category} | Seats: ${event.seats}`
);
});

/* Registration Counter Closure */
function createRegistrationCounter() {
let totalRegistrations = 0;

```
return function () {
    totalRegistrations++;
    return totalRegistrations;
};
```

}

const registrationCounter = createRegistrationCounter();

/* Register User */
function registerUser(eventId) {

```
try {

    const event = events.find(
        event => event.id === eventId
    );

    if (!event) {
        throw new Error("Event Not Found");
    }

    if (event.seats <= 0) {
        throw new Error("No Seats Available");
    }

    event.seats--;

    const count = registrationCounter();

    console.log(
        `Registration Successful | Remaining Seats: ${event.seats}`
    );

    console.log(
        `Total Registrations: ${count}`
    );

} catch (error) {

    console.error(error.message);

}
```

}

/* Add Event */
function addEvent(
name,
category,
date,
seats = 20
) {

```
const newEvent = {
    id: events.length + 1,
    name,
    category,
    date,
    seats
};

events.push(newEvent);

console.log("New Event Added");
```

}

/* Filter Events */
function filterEventsByCategory(category) {

```
return events.filter(
    event => event.category === category
);
```

}

/* DOM Rendering */
function displayEvents() {

```
const container =
    document.querySelector("#eventContainer");

if (!container) return;

container.innerHTML = "";

events.forEach(event => {

    const card =
        document.createElement("div");

    card.className = "eventCard";

    card.innerHTML = `
        <h3>${event.name}</h3>
        <p>Category: ${event.category}</p>
        <p>Seats Available: ${event.seats}</p>
        <button onclick="registerUser(${event.id})">
            Register
        </button>
    `;

    container.appendChild(card);

});
```

}

/* Search Events */
function searchEvents(keyword = "") {

```
const result = events.filter(
    event =>
        event.name
            .toLowerCase()
            .includes(keyword.toLowerCase())
);

console.log(result);
```

}

/* Form Handling */
function handleRegistration(event) {

```
event.preventDefault();

const form =
    document.getElementById("registrationForm");

if (!form) return;

const name =
    form.elements["name"].value;

const email =
    form.elements["email"].value;

const selectedEvent =
    form.elements["event"].value;

if (
    name === "" ||
    email === "" ||
    selectedEvent === ""
) {

    alert("Please Fill All Fields");

    return;
}

console.log({
    name,
    email,
    selectedEvent
});

alert("Registration Submitted");
```

}

/* Local Storage */
function savePreference(category) {

```
localStorage.setItem(
    "preferredCategory",
    category
);
```

}

function loadPreference() {

```
return localStorage.getItem(
    "preferredCategory"
);
```

}

function clearPreference() {

```
localStorage.clear();
sessionStorage.clear();
```

}

/* Fetch API Example */
function fetchEvents() {

```
fetch(
    "https://jsonplaceholder.typicode.com/posts"
)

    .then(response =>
        response.json()
    )

    .then(data => {

        console.log(
            "Events Loaded",
            data
        );

    })

    .catch(error => {

        console.error(
            "Fetch Failed",
            error
        );

    });
```

}

/* Async Await Example */
async function loadEvents() {

```
try {

    const response =
        await fetch(
            "https://jsonplaceholder.typicode.com/posts"
        );

    const data =
        await response.json();

    console.log(data);

} catch (error) {

    console.error(error);

}
```

}

/* Simulated Registration Request */
function submitRegistration() {

```
console.log(
    "Submitting Registration..."
);

setTimeout(() => {

    console.log(
        "Registration Successful"
    );

}, 2000);
```

}

/* Debugging Helper */
function debugPortal() {

```
console.log("Portal Debug Started");

console.table(events);
```

}

/* Initialize Portal */
document.addEventListener(
"DOMContentLoaded",
function () {

```
    displayEvents();

    console.log(
        `${portalName} Loaded Successfully`
    );

}
```

);

