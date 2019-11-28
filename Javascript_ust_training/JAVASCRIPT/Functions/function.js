// Named Functions
function add(num1,num2)
{
    console.log('Sum = ',num1+num2)
}
add(10,20)

//No method overloading in javascript

function add(num1,num2,num3)
{
    console.log('Sum value = ',num1+num2+num3)
}




//Function Expression (Anonymous)
var sub = function(num1,num2)
{
    var subValue=num1-num2;
    return subValue;
}
var value=sub(90,89)
console.log('Value = ',value);

//Self invoked functions
console.log('hello');
(function(num1,num2)
{
    console.log('Value = ',num1*num2)
}) (10,20);

//Fat Arrow function
var div = (num1,num2)=> {
    console.log('Value = ',num1/num2)
}
div(10,5);

//For Single Parameter
var div = num1=>{
    console.log('Value = ',num1)
}
div(5);

// For Single line code
var div=num1=>console.log(num1);
div(7);

var add = (num1,num2)=>num1+num2;
var value = add(11,12);
console.log('Value = ',value);

//Variable hoisting
console.log(hoist);
var hoist;

function hoisting(){
    console.log(varA)
   var varA;

}
hoisting()

function hoisting(){
    console.log(varA)
   var varA=10;

}
hoisting()
