const form = document.querySelector("#form")
const range = document.querySelector("#range")
const guess = document.querySelector("#guess")
const result = document.querySelectorAll("h3")
const won = document.querySelector(".won")


function game(e){
    e.preventDefault()
    
    const rangeValue = range.value
    const guessValue = guess.value
    const randomNumber = Math.floor(Math.random() * rangeValue)
    result[1].innerText = `You chose: ${guessValue}, the machine chose: ${randomNumber}`
    result[1].classList.remove('hide')
    if(guessValue == randomNumber){
        won.innerText = `You won!`
        won.classList.remove('hide')
    }
    else{
        won.innerText = `You lost`
        won.classList.remove('hide')
    }
    
}

form.addEventListener("submit",game)
