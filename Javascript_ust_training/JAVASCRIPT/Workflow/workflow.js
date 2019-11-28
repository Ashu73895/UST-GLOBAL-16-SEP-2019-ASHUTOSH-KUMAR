function first(){
console.log('First function executed')
}

function second(){
    console.log('Second function executed')
}
first()
second()

//setTimeout :- It takes function as a parameter
function first1(){
    setTimeout(function(){
    console.log('First1 function executed')
    },5000)
    console.log('Executed')
}
    
    
    function second(){
        console.log('Second function executed')
    }
    first1()
    second()

    //Callback function:- Passing a function as a parameter to another function



function first2(callBack){
    setTimeout(function(){
        console.log('First2 function executed');
        callBack();
    },0)
}
function second2()
{
console.log('Second function executed')
}
first2(second2);