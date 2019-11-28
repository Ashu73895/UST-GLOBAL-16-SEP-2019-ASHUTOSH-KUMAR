const person = {
                  name:'Sundara',
                  age:100,
                  color:'white',
                  address : {
                               city:'Bijapur',
                               state:'Karnataka',
                               pincode:591115

                            },
                   hobbies:['Coding','Bird watching','Singing']         

               }
console.log('JavaScript person object ',person);

const jsonObject = JSON.stringify(person)
console.log('JSON Person object = ',jsonObject);
localStorage.setItem('email','billgates@gmail.com')
const emailId = localStorage.getItem('email')
console.log('Email id ',emailId);
localStorage.clear();

