const clockTitle = document.querySelector(".js-clock")



function printTime(){
    const date = new Date()
    const dateOfChristmas = new Date("2022-12-25")
    const timeUntilChristmas = (date - dateOfChristmas) * -1
    const days = Math.floor(timeUntilChristmas / 1000 / 60 / 60 / 24)
    const hours = String(Math.floor(timeUntilChristmas / 1000 / 60 / 60 % 24)).padStart(2,"0")
    const minutes = String(Math.floor(timeUntilChristmas / 1000 / 60 % 60)).padStart(2,"0")
    const seconds = String(Math.floor(timeUntilChristmas / 1000 % 60 % 60)).padStart(2,"0")

    clockTitle.innerText = `${days}d ${hours}h ${minutes}m ${seconds}s`
}
printTime()
setInterval(printTime,1000)