const loginForm = document.querySelector("#login-form")
const loginInput = document.querySelector("#login-form input")
const h1 = document.querySelector("h1")

const HIDDEN_CLASSNAME = "hidden"
const USERNAME_KEY = "username"

function onLoginBtnSubmit(event) {
    event.preventDefault()
    const username = loginInput.value
    loginForm.classList.add(HIDDEN_CLASSNAME)
    localStorage.setItem(USERNAME_KEY, username)
    paintGreetings(username)
}

function handleLinkClick(event) {
    event.preventDefault()
    
}

function paintGreetings(username){
    h1.classList.remove(HIDDEN_CLASSNAME)
    h1.innerText = `Hello ${username}`
}

loginForm.addEventListener("submit", onLoginBtnSubmit)
  

const saveduUsername = localStorage.getItem(USERNAME_KEY)

if(saveduUsername === null){
    loginForm.classList.remove(HIDDEN_CLASSNAME)
    loginForm.addEventListener("submit", onLoginBtnSubmit)
} else {
    paintGreetings(saveduUsername)
}