var brands = ['Kingfisher','Bisleri','Aqua','Kinley']
// for loop(For array and string)
console.log('=============BY FOR LOOP===============')
for(var i=0;i<brands.length;i++)
{
    console.log('Brands = ',brands[i])
}

//for of loop(Only used for array)
console.log('=============BY FOR-OF LOOP===============')
for(var i of brands){
    console.log('Brands = ',i)
    
}

//for in loop(Used for array as well as objects)
console.log('=============BY FOR-IN LOOP for array=====')
for(var i in brands){
    console.log('Brands = ',brands[i])
    
}
var person = {
    name :'Sundari',
    age : 33,
    color : 'white'

}

console.log('=============BY FOR-IN LOOP for Objects===')

for(var i in person)
{
    console.log('Value = ',person[i])

}
// For each method(Method of Array)
console.log('=============BY FOR Each Method ==========')

{
    brands.forEach(function(v,i)
    {
        console.log('Brands = ',v)
        console.log('Index = ',i)


    })
}
// For each method for array of objects
console.log('=============BY FOR Each Method for Array of objects ==========')


var items =[ {
                item:'bangles',
                id:1,
                price:50
            },
            {
                item:'eyeliner',
                id:2,
                price:500
            },
            {
                item:'Watch',
                id:3,
                price:5000
            },
            {
                item:'Bike',
                id:4,
                price:100000
            }]

  items.forEach(function(v,i){
      console.log('Items = ',v)
      console.log('Index = ',i)

  
   } )   
   console.log('==============================================');
          
   var name;
   var name ='Pailwan'
   name='Prasthanam'
   console.log(name);
   

   //console.log(name1)
   let name1;
   //let name1 = 'Saaho'
   name1='Valmiki'
   console.log(name1);
   

   //const name2;
   //const name2='DreamGirl'
  // name2='Kabir Singh'
   const name3='Dangal'
   console.log(name3);
   console.log('================Using var==============================');

  for(var i=0;i<5;i++)
  {
      
  } 
  console.log('Outside for loop ',i);

  console.log('===================Using let===========================');
for(let i=0;i<5;i++)
{
    console.log('Inside for loop ',i);

}
//console.log('Outside for loop 'i);

            



