const items = [{
                 items:'EarRing',
                 id:1,
                 price:5000

             },
             {
                items:'Kajal',
                id:2,
                price:1000

            },
            {
                items:'Trimmer',
                id:3,
                price:3000

            },
            {
                items:'Beardo',
                id:4,
                price:500

            }]

             const updatedItems = items.map(function (items,index) {
                items.price = items.price + 300
                return items;
            })
            console.log(updatedItems);

            const itemsArrow = items.map((value)=>{
                value.price=value.price + 300
                return value
            })
            console.log(itemsArrow);
            
            const filteredItems = items.filter((items)=>items.price>3000)
            console.log(filteredItems);

            console.log(items);
            
            