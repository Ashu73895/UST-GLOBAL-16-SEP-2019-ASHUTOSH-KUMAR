console.log('Window object ',window);
console.log('This keyword ',this);
console.log('this === window ?',this === window);
/*window.alert('Welcome to javascript class')
alert('Welcome to UST Global and Testyantra')*/
//let confirmDelete = confirm('Are u sure u want to delete ?') 
//console.log('Confirm Delete ',confirmDelete);

//let userName = prompt('What is ur name ? ','Ashu')
//console.log('User Name ',userName);
const person = {
                   firstName:'Alia',
                   age : 26,
                   lastName : 'Kapoor',
                   getName : function() {
                       console.log('This keyword ',this);
                       
                       return this.firstName+' '+this.lastName
                       
                   }


               }
               let fullName = person.getName()
               console.log('Full Name - ',fullName);
               
