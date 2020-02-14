const arr = [ 1, 2, 3, 4]

const dupe = (arr) => {
    const newArr = []
    for(i in arr){
        newArr.push(i);
    } 
    return newArr;
}

// outputs [0, 1, 2, 3]
console.log(dupe(arr));


const arr2 = [ 1, 2, 3, 4]

const actualDupe = (arr) => {
    const newArr = []
    for(i in arr){
        newArr.push(arr[i]);
    } 
    return newArr;
}

// outputs [ 1, 2, 3, 4]
console.log(actualDupe(arr2));

const arr3 = [ 1, 2, 3, 4]

const altDupe = (arr) => {
    const newArr = []
    for(i of arr){
        newArr.push(i);
    } 
    return newArr;
}

// outputs [ 1, 2, 3, 4]
console.log(altDupe(arr3));