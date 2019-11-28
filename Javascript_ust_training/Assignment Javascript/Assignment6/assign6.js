 function keyPress()
  {
let nameKeyField = document.getElementById('text').value
nameKeyField = nameKeyField.trim()

let passKeyField = document.getElementById('psw').value
passKeyField = passKeyField.trim()

if(passKeyField.length >= 6 && nameKeyField.length >= 5)
{
    document.getElementById('clickButton').disabled = false;
    document.getElementById('clickButton').style.cursor =" pointer";
}else{
    document.getElementById('clickButton').disabled = true;
}
 }

 function showPassword()
 {
     var x = document.getElementById("psw")
     if(x.type === "password")
     {
         x.type = "text"
     }else{
         x.type = "password"
     }
 }