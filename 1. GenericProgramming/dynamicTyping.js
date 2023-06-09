function integerArrayBehavior(someIntegerArray) { // could pass anything as an argument!
    for (let i in someIntegerArray) {
        someIntegerArray[i] += 1 // will add one to anything passed, no restriction
    }
    return someIntegerArray
}

// try adding 1 to a class instance or anything you can't add a number or string to...
// error generated! This would be prevented by compiling beforehand, and probably using static typing

integerArray = []
a = 3
integerArray.push(a)
a = "Tomato"
integerArray.push(a)

console.log(integerArray) // [ 3, 'Tomato' ]
console.log(integerArrayBehavior(integerArray)) // [ 4, 'Tomato1' ]


// some unexpected and dangerous behavior, as JS is a weakly typed language,
// which means there are very little restrictions between conversions between types:

console.log("'3' - 1 = " +
    ('3' - 1)
) // 2
console.log("'3' + 1 = " +
    ('3' + 1)
) // 31

console.log("'B' + 'a' + + 'a' 'a' = " +
    ('B' + 'a' + + 'a' + 'a')
) // BaNaNa