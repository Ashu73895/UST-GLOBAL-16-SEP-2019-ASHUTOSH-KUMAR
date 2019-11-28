const message = new Promise(function(resolve,reject) {
    if(30>20){
        resolve([
            {
                name:'Bill Gates',
                age:67
            },
            {
                name: 'Mark zuckerberg',
                age:40

            }
        ])
    }else{
        reject('failed')
    }
    
})
message.then(function(msg) {
    console.log('Success Message ',msg)
    
}).catch(function(error){
    console.log('Failure message ',error)
    
})


const employees = new Promise(function(resolve,reject) {
    if(30>20){
        resolve([
            {
                name:'Bill',
                age:66
            },
            {
                name: 'Mark',
                age:41

            }
        ])
    }else{
        reject('failed')
    }
    
})
employees.then(function(msg) {
    console.log('Employee Data ',msg)
    
}).catch(function(error){
    console.log('Failure message ',error)
    
})



//Closures/////
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter+10;
        return count;
    }
 return innerFunction;   
}

let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter value ',counter);
