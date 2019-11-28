const names=['Ramesh','Suresh','Dinesh','Mahesh']
const sports=['Cricket','Hockey','Football','Tennis']
const movies=['Dangal','Andhadhun','Zero','Kedarnath']
const players=['Dhoni','Kohli','Rohit','Dhawan']
const students=['Ashu','Abhishek','Shubham','Siddhartha']
const companies=['TCS','Infosys','Wipro','Microsoft']
const arr=[10,20,30,40]
const numbers=[50,60,70,80]
const even=[2,4,6,8]
const odd=[1,3,5,7]

console.log("========FOR EACH METHOD=============================");
console.log('=========Array 1======');
names.forEach(function(v,i){
    console.log('Names = ',v);
    
})
console.log('=========Array 2======');
names.forEach(function(v,i){
    console.log('Sports = ',v);
    
})
console.log('=========Array 3======');
names.forEach(function(v,i){
    console.log('Movies = ',v);
    
})
console.log('=========Array 4======');
names.forEach(function(v,i){
    console.log('Players = ',v);
    
})
console.log('=========Array 5======');
names.forEach(function(v,i){
    console.log('Students = ',v);
    
})
console.log('=========Array 6======');
names.forEach(function(v,i){
    console.log('Companies = ',v);
    
})
console.log('=========Array 7======');
names.forEach(function(v,i){
    console.log('Arr = ',v);
    
})
console.log('=========Array 8======');
names.forEach(function(v,i){
    console.log('Numbers = ',v);
    
})
console.log('=========Array 9======');
names.forEach(function(v,i){
    console.log('Even = ',v);
    
})
console.log('=========Array 10======');
names.forEach(function(v,i){
    console.log('Odd = ',v);
    
})
console.log("========isARRAY METHOD================================");
console.log('=========Array 1======');
console.log(Array.isArray(names));
console.log('=========Array 2======');
console.log(Array.isArray(sports));
console.log('=========Array 3======');
console.log(Array.isArray(movies));
console.log('=========Array 4======');
console.log(Array.isArray(players));
console.log('=========Array 5======');
console.log(Array.isArray(students));
console.log('=========Array 6======');
console.log(Array.isArray(companies));
console.log('=========Array 7======');
console.log(Array.isArray(arr));
console.log('=========Array 8======');
console.log(Array.isArray(numbers));
console.log('=========Array 9======');
console.log(Array.isArray(even));
console.log('=========Array 10======');
console.log(Array.isArray(odd));
console.log("========INCLUDES METHOD=============================");
console.log('=========Array 1======');
console.log(names.indexOf('Suresh',0));
console.log('=========Array 2======');
console.log(sports.indexOf('Tennis',0));
console.log('=========Array 3======');
console.log(movies.indexOf('Andhadhun',0));
console.log('=========Array 4======');
console.log(players.indexOf('Rohit',0));
console.log('=========Array 5======');
console.log(students.indexOf('Abhishek',0));
console.log('=========Array 6======');
console.log(companies.indexOf('Infosys',0));
console.log('=========Array 7======');
console.log(arr.indexOf(40,0));
console.log('=========Array 8======');
console.log(numbers.indexOf(70,0));
console.log('=========Array 9======');
console.log(even.indexOf(6,0));
console.log('=========Array 10======');
console.log(odd.indexOf(5,0));
console.log("========PUSH METHOD=================================");
console.log('=========Array 1======');
console.log(names.push('Ganesh'))
console.log('=========Array 2======');
console.log(sports.push('Volleyball'))
console.log('=========Array 3======');
console.log(movies.push('Raees'))
console.log('=========Array 4======');
console.log(players.push('Bumrah'))
console.log('=========Array 5======');
console.log(students.push('Sumit'))
console.log('=========Array 6======');
console.log(companies.push('Google'))
console.log('=========Array 7======');
console.log(arr.push(100))
console.log('=========Array 8======');
console.log(numbers.push(200))
console.log('=========Array 9======');
console.log(even.push(10))
console.log('=========Array 10======');
console.log(odd.push(9))
console.log("========POP METHOD==================================");
console.log('=========Array 1======');
console.log(names.pop());
console.log('=========Array 2======');
console.log(sports.pop());
console.log('=========Array 3======');
console.log(movies.pop());
console.log('=========Array 4======');
console.log(players.pop());
console.log('=========Array 5======');
console.log(students.pop());
console.log('=========Array 6======');
console.log(companies.pop());
console.log('=========Array 7======');
console.log(arr.pop());
console.log('=========Array 8======');
console.log(numbers.pop());
console.log('=========Array 9======');
console.log(even.pop());
console.log('=========Array 10======');
console.log(odd.pop());
console.log("========UNSHIFT METHOD==============================");
console.log('=========Array 1======');
console.log(names.unshift('Ganesh'));
console.log('=========Array 2======');
console.log(sports.unshift('Volleyball'))
console.log('=========Array 3======');
console.log(movies.unshift('Raees'))
console.log('=========Array 4======');
console.log(players.unshift('Bumrah'))
console.log('=========Array 5======');
console.log(students.unshift('Sumit'))
console.log('=========Array 6======');
console.log(companies.unshift('Google'))
console.log('=========Array 7======');
console.log(arr.unshift(100))
console.log('=========Array 8======');
console.log(numbers.unshift(200))
console.log('=========Array 9======');
console.log(even.unshift(10))
console.log('=========Array 10======');
console.log(odd.unshift(9))
console.log("========SHIFT METHOD==============================");
console.log('=========Array 1======');
console.log(names.shift());
console.log('=========Array 2======');
console.log(sports.shift());
console.log('=========Array 3======');
console.log(movies.shift());
console.log('=========Array 4======');
console.log(players.shift());
console.log('=========Array 5======');
console.log(students.shift());
console.log('=========Array 6======');
console.log(companies.shift());
console.log('=========Array 7======');
console.log(arr.shift());
console.log('=========Array 8======');
console.log(numbers.shift());
console.log('=========Array 9======');
console.log(even.shift());
console.log('=========Array 10======');
console.log(odd.shift());
console.log("========SPLICE METHOD==============================");
console.log('=========Array 1======');
console.log(names.splice(1,0,'Ganesh'));
console.log(names);

console.log('=========Array 2======');
console.log(sports.splice(1,0,'Volleyball'))
console.log(sports);

console.log('=========Array 3======');
console.log(movies.splice(1,0,'Raees'))
console.log(movies);

console.log('=========Array 4======');
console.log(players.splice(1,0,'Bumrah'))
console.log(players);

console.log('=========Array 5======');
console.log(students.splice(1,0,'Sumit'))
console.log(students);

console.log('=========Array 6======');
console.log(companies.splice(1,0,'Google'))
console.log(companies);

console.log('=========Array 7======');
console.log(arr.splice(1,0,100))
console.log(arr);

console.log('=========Array 8======');
console.log(numbers.splice(1,0,200))
console.log(numbers);

console.log('=========Array 9======');
console.log(even.splice(1,0,10))
console.log(even);

console.log('=========Array 10======');
console.log(odd.splice(1,0,9))
console.log(odd);
console.log("========SLICE METHOD==============================");
console.log('=========Array 1======');
console.log(names.slice(1,4));
console.log('=========Array 2======');
console.log(sports.slice(1,4));
console.log('=========Array 3======');
console.log(movies.slice(1,4));
console.log('=========Array 4======');
console.log(players.slice(1,4));
console.log('=========Array 5======');
console.log(students.slice(1,4));
console.log('=========Array 6======');
console.log(companies.slice(1,4));
console.log('=========Array 7======');
console.log(arr.slice(1,4));
console.log('=========Array 8======');
console.log(numbers.slice(1,4));
console.log('=========Array 9======');
console.log(even.slice(1,4));
console.log('=========Array 10======');
console.log(odd.slice(1,4))
console.log("========INDEXOF METHOD============================");
console.log('=========Array 1======');
console.log(names.indexOf('Suresh',0));
console.log('=========Array 2======');
console.log(sports.indexOf('Tennis',0));
console.log('=========Array 3======');
console.log(movies.indexOf('Andhadhun',0));
console.log('=========Array 4======');
console.log(players.indexOf('Rohit',0));
console.log('=========Array 5======');
console.log(students.indexOf('Abhishek',0));
console.log('=========Array 6======');
console.log(companies.indexOf('Infosys',0));
console.log('=========Array 7======');
console.log(arr.indexOf(40,0));
console.log('=========Array 8======');
console.log(numbers.indexOf(70,0));
console.log('=========Array 9======');
console.log(even.indexOf(6,0));
console.log('=========Array 10======');
console.log(odd.indexOf(5,0));
console.log("========JOIN METHOD============================");
console.log('=========Array 1======');
console.log(names.join(' - '));
console.log('=========Array 2======');
console.log(sports.join(' - '));
console.log('=========Array 3======');
console.log(movies.join(' - '));
console.log('=========Array 4======');
console.log(players.join(' - '));
console.log('=========Array 5======');
console.log(students.join(' - '));
console.log('=========Array 6======');
console.log(companies.join(' - '));
console.log('=========Array 7======');
console.log(arr.join(' - '));
console.log('=========Array 8======');
console.log(numbers.join(' - '));
console.log('=========Array 9======');
console.log(even.join(' - '));
console.log('=========Array 10======');
console.log(odd.join(' - '));
console.log("========MAP METHOD============================");
console.log('=========Array 7======');
console.log(arr.map(v=>v+5));
console.log('=========Array 8======');
console.log(numbers.map(v=>v+5));
console.log('=========Array 9======');
console.log(even.map(v=>v+5));
console.log('=========Array 10======');
console.log(odd.map(v=>v+5));
console.log("========FILTER METHOD============================");
console.log('=========Array 7======');
console.log(arr.filter(v=>v>30));
console.log('=========Array 8======');
console.log(numbers.filter(v=>v>70));
console.log('=========Array 9======');
console.log(even.filter(v=>v>4));
console.log('=========Array 7======');
console.log(odd.filter(v=>v>3));





























