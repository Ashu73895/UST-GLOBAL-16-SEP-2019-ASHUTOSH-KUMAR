let h1Element = document.getElementById('demo')
console.log('Element = ',h1Element);

console.log('Element text = ',h1Element.textContent)
h1Element.textContent = 'Good Evening'
console.log('===================================================');
 let buttonElement = document.createElement('button')
 console.log("Button Element = ",buttonElement);
 buttonElement.textContent = 'Click Me !!!! '
console.log('Button Element ',buttonElement);

document.body.appendChild(buttonElement)
let ulElement = document.createElement('ul')
let li1Element = document.createElement('li') 
let li2Element = document.createElement('li') 
let li3Element = document.createElement('li') 

li1Element.textContent = 'JAVA'
li2Element.textContent = 'SQL'
li3Element.textContent = 'JAVASCRIPT'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color ='red'
h1Element.style.fontFamily = 'chiller'
h1Element.style.fontSize = '40px'

function showMessage() {
    alert('Hi,hello welcome !!!')
    
}
function changeColor(){
    let pElement = document.getElementById('over')
    pElement.style.color='green'
    pElement.style.fontSize='20px'

}

function restoreCol(){
    document.getElementById('over').style.color='black'
    document.getElementById('over').style.fontSize='17px'

}
function printHello(){
    console.log('Hello');
    let username =  document.getElementById('username').value
    document.getElementById('showusername').textContent = username;
    
}

let name = 'Rakesh'
let age = 21
let phoneno = 7499881144
console.log('Name is ',name,' Age is ',age,' Phone no is ',phoneno);
console.log(`Name is ${name} Age is ${age} Ph no is ${phoneno}`);
console.log(`2 + 2 = ${2+2}`);




