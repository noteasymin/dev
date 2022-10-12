const clock = document.querySelector("h2#clock")

function sayHello(){
    console.log("Hello")
}

function setDate(){
    const date = new Date()

    const year = date.getFullYear()
    const hour = String(date.getHours()).padStart(2,"0")
    const minute = String(date.getMinutes()).padStart(2,"0")
    const second = String(date.getSeconds()).padStart(2,"0")


    clock.innerText = `${year}년 ${hour}시 ${minute}분 ${second}초`
}

setDate()
setInterval(setDate,1000)