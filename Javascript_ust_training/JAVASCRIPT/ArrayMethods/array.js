const hobbies=['Sleeping','Cricket','Eating','Coding','Roaming']
 console.log(typeof hobbies);
 const isArrayOrNot=Array.isArray(hobbies)
 console.log('hobbies is an array? ',isArrayOrNot);

const hasCricket =  hobbies.includes('Cricket')
console.log('Using includes method ',hasCricket);

hobbies.push('Guitar','Volleyball')
console.log('After push method',hobbies)

const element = hobbies.pop()   
console.log(element);

console.log('After pop method ',hobbies);

hobbies.unshift('Numismatics','Singing')
console.log('After unshift method ',hobbies);
const ele =hobbies.shift();
console.log(ele);

console.log('After shift method ',hobbies);

const hobbies1 = ['Sleeping','Cricket','Eating','Coding','Roaming']
hobbies1.splice(1,2,'Bird Watching','PUBG')
console.log('After splice ',hobbies1);

const a1 = hobbies1.slice(2,4)
console.log('After slice ,hobbies1 = ',hobbies1);

console.log('After slice ,a1 = ',a1);

const indexOfCoding = hobbies1.indexOf('Coding',1)
console.log('Index of coding =',indexOfCoding);

const hobbies2 = hobbies.join(' - ')
console.log('String = ',hobbies2);

const numbers = [100,200,300,400]
const nums1 = numbers.map(function(value,index){
    let newValue=value+50
    return newValue
})
console.log('Numbers = ',numbers);
console.log('Nums1 = ',nums1);

const nums2 = numbers.map(value=>value+500)
console.log('After fat arrow function, nums2 = ',nums2);

const filterNum = numbers.filter(function(value,index){
    if(value>200){
        return true;
    }else{
        return
    }
})
console.log('filterNum = ',filterNum);
const filterNum1=numbers.filter(value=>value>200)
console.log('Using fat arrow, filterNum1 = ',filterNum1);

const arr1 = [1,2,3,4,5,6]
console.log(arr1.splice(1,2,9))
console.log(arr1);
// arr1 = [1,9,4,5,6]


console.log(arr1.slice(1,8))
console.log(arr1);

console.log(arr1.indexOf(4,9));




const ar1 = [1,2,3,4,5,6]
const ab=ar1.map(function(v,i){
let n=v+5;
return n;
})
console.log(ab);
console.log(ar1);

const ar3 = [{
                item:'book',
                id:1,
                price:200

             },
             {
             item:'mobile',
             id:2,
             price:9000
             },
             {
             item:'lappy',
             id:3,
             price:25000
             }
            ]

const abc = ar3.map(function(v,i){
    v.price = v.price+300;
     return ar3
})
console.log(abc);

console.log(ar3);

const pqr = ar3.filter(ar3=>ar3.price>1000)
console.log(pqr);
console.log(ar3);

















 

 
