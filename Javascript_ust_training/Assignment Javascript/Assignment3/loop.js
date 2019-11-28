console.log("==============FOR LOOP==================");
console.log('=====ARRAY 1===== ')

var Fruits = ['Apple','Orange','Banana','Mango']
for(var i=0;i<Fruits.length;i++)
{
    console.log('Fruits = ',Fruits[i]);
    
    
}
console.log('=====ARRAY 2===== ')
var Students = ['Ashu','Abhi','Atul','Ajay']
for( var i=0;i<Students.length;i++)
{
    console.log('Students = ',Students[i]);
    
}
console.log('=====ARRAY 3===== ')
var Sports = ['Cricket','Hockey','Football','Tennis']
for(var i = 0;i<Sports.length;i++)
{
    console.log('Sports = ',Sports[i]);
    
}
console.log('=====ARRAY 4===== ')
var Language = ['English','Hindi','Bengali','Odiya']
for(var i=0;i<Language.length;i++)
{
    console.log('Language = ',Language[i]);
    
}
console.log('=====ARRAY 5===== ')
var Players = ['Dhoni','Kohli','Rohit','Dhawan']
for(var i=0;i<Players.length;i++)
{
    console.log('Players = ',Players[i]);
    
}
console.log("==============FOR-OF LOOP==================");

var arr1=[1,2,3,4]
var arr2=[5,6,7,8]
var arr3=[9,10,11,12]
var arr4=[13,14,15,16]
var arr5=[17,18,19,20]
console.log('=====ARRAY 1===== ')

for(var i of arr1)
{
    console.log(i);
    
}
console.log('=====ARRAY 2===== ')
for(var i of arr2)
{
    console.log(i);
    
}
console.log('=====ARRAY 3===== ')
for(var i of arr3)
{
    console.log(i);
    
}
console.log('=====ARRAY 4===== ')
for(var i of arr4)
{
    console.log(i);
    
}
console.log('=====ARRAY 5===== ')

for(var i of arr5)
{
    console.log(i);
    
}
console.log("==============FOR-IN LOOP==================");
var A=['Apple','Ant','Air','App']
var B=['Book','Basket','Best','Better']
var C=[{ name:'Cat',id:1},{name:'Cow',id:2},{name:'Cup',id:2},{name:'Chalk',id:2}]
var D=['Dog','Doll','Donkey','Dense']
var E=[{ name:'Eat',id:1},{name:'Ear',id:2},{name:'Eye',id:3},{name:'Early',id:4}]
console.log('=====ARRAY 1===== ')
for(var i in A)
{
    console.log(A[i]);
    
}
console.log('=====ARRAY 2===== ')

for(var i in B)
{
    console.log(B[i]);
    
}
console.log('=====OBJECT 1===== ')

for(var i in C)
{
    console.log(C[i]);
    
}
console.log('=====ARRAY 3===== ')

for(var i in D)
{
    console.log(D[i]);
    
}
console.log('=====OBJECT 2===== ')

for(var i in E)
{
    console.log(E[i]);
    
}
console.log("==============FOR-EACH METHOD==================");
var ARR1=[1,2,3,4]
var ARR2=[11,22,33,44]
var ARR3=[111,222,333,444]
var ARR4=[1111,2222,3333,4444]
var ARR5=[11111,22222,33333,44444]
console.log('=====ARRAY 1===== ')
ARR1.forEach(function (v,i) 
{
    console.log(v);
    
})
console.log('=====ARRAY 2===== ')

ARR2.forEach(function (v,i) 
{
    console.log(v);
    
})
console.log('=====ARRAY 3===== ')

ARR3.forEach(function (v,i) 
{
    console.log(v);
    
})
console.log('=====ARRAY 4===== ')

ARR4.forEach(function (v,i) 
{
    console.log(v);
    
})
console.log('=====ARRAY 5===== ')

ARR5.forEach(function (v,i) 
{
    console.log(v);
    
})








