let clickCount = 0;
let userLoaded = false;

const cookieBtn = document.getElementById("cookieBtn");
const countEl = document.getElementById("count");
const userResult = document.getElementById("userResult");

cookieBtn.addEventListener("click", async () => {
    clickCount++;
    countEl.textContent = clickCount;

    if (clickCount >= 10 && !userLoaded) {
        userLoaded = true;

        try {
            const response = await fetch("https://randomuser.me/api/");
            const data = await response.json();

            const user = data.results[0];
            const fullName = user.name.first + " " + user.name.last;

            userResult.textContent = "Random user: " + fullName;
        } catch (error) {
            userResult.textContent = "Failed to load random user.";
            console.error(error);
        }
    }
});